/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity7;
import java.util.ArrayList;
/**
 *
 * @author Sjkukseeeeee
 */
public class Activity7 {

    
    public static void main(String[] args) {
        
        System.out.println("Directed Graph");
        ArrayList<ArrayList> adjList = new ArrayList<>();
        char[] vertices = {'A','B','C','D','E','F'};
        int num = 6; //number of vertices
        
        for (int i = 0; i < num; i++){         
        adjList.add(new ArrayList<>());
        }
    
        adjList.get(0).add('C'); 
        adjList.get(1).add('A');
        adjList.get(1).add('E');
        adjList.get(1).add('D');
        adjList.get(2).add('E');
        adjList.get(3).add('E');
        adjList.get(3).add('F');

    for (int i = 0, v = 0; i < num; i++, v++) { // for displaying vertex A to F
    System.out.println(vertices[v] + ": " + adjList.get(i)); // for displaying content of each list
}
    }
    
}
