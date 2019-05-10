/*
 * Created By Safe_IT23
 */
package PracticeProblem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.StringJoiner;

/**
 *
 * @author jatawatsafe 
 * Practice02 : Find Subgraph
 * Level: Hard
 */

public class DirectedGraph<V> {
    ArrayList<GraphNode<V>> nodes;
    
    public DirectedGraph() {
        nodes = new ArrayList<>();
    }
    
    private GraphNode<V> getNode(V v) {
        Objects.requireNonNull(v);
        for (GraphNode<V> node : nodes) {
            if (node.data.equals(v)) return node; 
        }
        return null;
    }
    
    public void addNode(V v) {
        if (getNode(v)!=null) 
            throw new IllegalArgumentException("Duplication is not allowed.");
        GraphNode<V> node = new GraphNode<>(v);
        nodes.add(node);
    }
    
    public void addEdge(V from, V to) {
        GraphNode<V> fromNode = getNode(from);
        GraphNode<V> toNode = getNode(to);
        if (fromNode == null || toNode == null) 
            throw new IllegalArgumentException("Node(s) not found.");
        fromNode.addEdgeTo(toNode);
    }
    
    public DirectedGraph<V> subgraph(V v) {
        DirectedGraph dg = new DirectedGraph();
        //Find Node
        GraphNode<V> node = this.getNode(v);
        dg.addNode(node.data);
        ArrayList<GraphNode<V>> toN = node.toNodes;
        //Find Out Going Node
        for (GraphNode<V> eachN : toN) {
            dg.addNode(eachN.data);
            dg.addEdge((V)node.data, (V)eachN.data);
        }
        
        for (int i = 0; i < dg.nodes.size(); i++) {
            GraphNode<V> cur = (GraphNode<V>)dg.nodes.get(i);
            GraphNode<V> out = this.getNode(cur.data);
            System.out.printf("-----Node%d: %s\n",(i+1),out);
            for (int j = 0; j < out.toNodes.size(); j++) {
                GraphNode<V> next= this.getNode(out.toNodes.get(j).data);
                System.out.println("------------LoopInside: "+next);
                for(int k=0; k<next.toNodes.size();k++){
                    System.out.println("-------------------NEXT:"+next.toNodes.get(k).data);
                    if(next.toNodes.get(k).data.equals(node.data)){
                        GraphNode<V> now = next.toNodes.get(k);
                        System.out.printf(">>>>>>>>>>>>>>>>>>>>>FIND : %s ---> %s \n",next.data,now.data);
                        if (dg.getNode(next.data)==null) {
                            dg.addNode(next.data);
                            dg.getNode(next.data).addEdgeTo(node);
                        }
                        //From AdjacentNode ---> NextNode
                        dg.getNode(out.data).addEdgeTo(next);
                    }
                }
            }
            
        }

        
        return dg;
    }
    

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Graph:\n");
        for (GraphNode<V> node : nodes) {
            s.append(" Node: ").append(node.toString()).append("\n");
        }
        return s.toString();
    }
}

class GraphNode<V> {
    V data;
    ArrayList<GraphNode<V>> toNodes; // out-going edges to destination nodes
    
    GraphNode(V v) {
        data = v;
        toNodes = new ArrayList<>();
    }
    
    void addEdgeTo(GraphNode<V> n) {
        toNodes.add(n);
    }
    
    @Override
    public String toString() {
        StringJoiner s = new StringJoiner(", ", data.toString() + " -> ", ".");
        for (GraphNode<V> node : toNodes) {
            s.add(node.data.toString());
        }
        return s.toString();
    }
}
