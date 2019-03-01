/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Khaitong
 */
public class TestHashFn {
    public static void main(String[] args) {
        String x[] = {"This", "Ant", "Dog", "Cat", "Bird", "Horse", "Monkey", "Tiger", "Fish", "Camel", "Bear", "Lion"} ;
        Map<String, String> animal = new HashMap() ;
        for(String a : x) {
            System.out.println(a + " : "+ a.hashCode()+ "  -->  "+  hash(a.hashCode()
            ) );
            animal.put(a,a);
        }
        
    }
    
    static int hash(int h) { 
        int hash = h ^ (h >>> 16) ;     //shift and exclusive all
        return  hash & 15 ;             //will get value 0-15 (same like mod)
    }
    
}
