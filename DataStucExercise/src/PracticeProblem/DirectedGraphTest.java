/*
 * Created By Safe_IT23
 */
package PracticeProblem;

/**
 *
 * @author jatawatsafe 
 * Practice02 : Find Subgraph
 * Level: Hard
 */

public class DirectedGraphTest {

    public static void main(String[] args) {
        //testDirectedGraph();
        testDirectedGraph2();
    }

    private static void testDirectedGraph() {
        DirectedGraph<X> g = new DirectedGraph();
        int size = 7;
        X[] x = new X[size];
        for (int i = 0; i < x.length; i++) {
            x[i] = new X(i);
        }
        for (int i = 0; i < x.length; i++) {
            g.addNode(x[i]);
        }
        g.addEdge(x[0], x[1]);
        g.addEdge(x[0], x[3]);
        g.addEdge(x[1], x[4]);
        g.addEdge(x[1], x[3]);
        g.addEdge(x[1], x[6]);
        g.addEdge(x[2], x[3]);
        g.addEdge(x[6], x[2]);
        g.addEdge(x[4], x[1]);
        g.addEdge(x[3], x[6]);
        g.addEdge(x[4], x[3]);
        g.addEdge(x[5], x[0]);
        g.addEdge(x[6], x[0]);
        g.addEdge(x[3], x[5]);
        System.out.println(g);
        
        
        int target = 5;
        DirectedGraph<X> result = g.subgraph(x[target]);
        System.out.println("\nSubgraph: " + target);
        System.out.println(result);
        
    }
    
    private static void testDirectedGraph2(){
        DirectedGraph<String> g = new DirectedGraph();
        g.addNode("A");
        g.addNode("B");
        g.addNode("C");
        g.addNode("D");
        g.addNode("E");
        g.addNode("F");
        g.addNode("G");
        g.addNode("H");
        g.addNode("J");
        g.addNode("K");
        g.addNode("I");
        g.addNode("L");
        g.addNode("M");
        g.addNode("S");
        
        g.addEdge("A", "C");
        g.addEdge("C", "B");
        g.addEdge("D", "C");
        g.addEdge("C", "E");
        g.addEdge("E", "F");
        g.addEdge("D", "F");
        g.addEdge("G", "E");
        g.addEdge("G", "H");
        g.addEdge("F", "H");
        g.addEdge("G", "J");
        g.addEdge("I", "G");
        g.addEdge("G", "S");
        g.addEdge("S", "J");
        g.addEdge("S", "I");
        g.addEdge("S", "K");
        g.addEdge("K", "L");
        g.addEdge("H", "I");
        g.addEdge("L", "S");
        g.addEdge("M", "L");
        g.addEdge("K", "M");
        
        System.out.println(g);
        
        String target = "S";
        DirectedGraph<String> result = g.subgraph(target);
        System.out.println("\nSubgraph: " + target);
        System.out.println(result);
    }
    
}

class X implements Comparable<X> {

    private final int id;

    public X(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(X s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return "X[" + id + "]";
    }
}
