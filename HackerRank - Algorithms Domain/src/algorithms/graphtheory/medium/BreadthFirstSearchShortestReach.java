package algorithms.graphtheory.medium;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class BreadthFirstSearchShortestReach {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0) {
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            
            Vertex[] graph = createGraph(nodes, edges, sc);
            printGraph(graph);
            int source = 1;
            BFS(graph, source);
            for(int i=1;i<graph.length;i++) {
                if(i!=source) {
                    System.out.print(graph[i].getDistance() + " ");
                }
            }
            System.out.println();
        }
    }
    
    static Vertex[] createGraph(int n, int e, Scanner sc) {
        Vertex[] graph = new Vertex[n+1];
        
        for(int i=1;i<=n;i++) {
            graph[i] = new Vertex();
            graph[i].setId(i);
        }
        
        for(int i=0;i<e;i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph[from].getAdjacentVertices().add(graph[to]);
            graph[to].getAdjacentVertices().add(graph[from]);
        }
        return graph;
    }
    
    static void printGraph(Vertex[] graph) {
        for(Vertex vertex : graph) {
            if(vertex!=null) {
                System.out.print(vertex.getId() + " : ");
                for(Vertex adjacentVertex : vertex.getAdjacentVertices()) {
                    System.out.print(adjacentVertex.getId() + " ");
                }
                System.out.println();
            }
        }
    }
    
    static void BFS(Vertex[] graph, int source) {
        for(Vertex vertex : graph) {
            if(vertex!=graph[source] && vertex!=null) {
                vertex.setColor((byte)0);
                vertex.setDistance(-1);
                vertex.setParent(null);
            }
        }
        Queue<Vertex> vertices = new ArrayDeque<>();
        graph[source].setColor((byte)1);
        graph[source].setDistance(0);
        graph[source].setParent(null);
        vertices.add(graph[source]);
        while(!vertices.isEmpty()) {
            Vertex u = vertices.poll();
            for(Vertex v : u.getAdjacentVertices()) {
                if(v.getColor()==0) {
                    v.setColor((byte)1);
                    v.setDistance(u.getDistance() + 6);
                    v.setParent(u);
                    vertices.add(v);
                }
                u.setColor((byte)2);
            }
        }
    }
    
    static void printPath(Vertex[] graph, Vertex s, Vertex v) {
        if(s==v) {
            System.out.println(s.getId());
        }else if(v.getParent()==null) {
            return;
        }else{
            System.out.println(v.getId());
            printPath(graph, s, v.getParent());
        }
    }
}

class Vertex implements Comparable<Vertex>{

    private byte color;
    private int distance;
    private Vertex parent;
    private TreeSet<Vertex> adjacentVertices = new TreeSet<>();
    private int id;
    private int weight;

    public Vertex() {
    }

    public byte getColor() {
        return color;
    }

    public void setColor(byte color) {
        this.color = color;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public TreeSet<Vertex> getAdjacentVertices() {
        return adjacentVertices;
    }

    public void setAdjacentVertices(TreeSet<Vertex> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Vertex t) {
        return this.getId() - t.getId();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}