package algorithms.graphtheory.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class FloydCityOfBlindingLights {
    
    public static void main(String[] args) {
        InputReader sc = new InputReader(System.in);
        int nNodes = sc.readInt();
        int nEdges = sc.readInt();
        
        Vertex[] graph = new Vertex[nNodes + 1];
        
        for(int i = 1; i <= nNodes; i++) {
            graph[i] = new Vertex();
            graph[i].setId(i);
        }
        
        List<Edge> edges = new ArrayList<>();
        HashMap<String, Edge> hashMap = new HashMap<>();
        
        for(int i = 1; i <= nEdges; i++) {
            Vertex source = graph[sc.readInt()];
            Vertex destination = graph[sc.readInt()];
            int weight = sc.readInt();
            Edge edge = new Edge(source, destination, weight);
            String key = source + "->" + destination;
            hashMap.put(key, edge);
        }
        
        for(Edge edge : hashMap.values()) {
            edges.add(edge);
        }
        
        int[][] distances = apply(graph, edges);
        
        int Q = sc.readInt();
        StringBuffer output = new StringBuffer();
        while(Q-- != 0) {
            int u = sc.readInt();
            int v = sc.readInt();
            output.append((distances[u][v] == 9999999) ? -1 : distances[u][v]).append('\n');
        }
        System.out.println(output);
    }
    
    public static int[][] apply(Vertex[] graph, List<Edge> edges) {
        int[][] distances = new int[graph.length][graph.length];
        
        for(int i = 1; i < graph.length; i++) {
            Arrays.fill(distances[i], 9999999);
        }
        
        for(Vertex vertex : graph) {
            if(vertex != null) {
                distances[vertex.getId()][vertex.getId()] = 0;
            }
        }
        
        for(Edge edge : edges) {
            Vertex u = edge.getSource();
            Vertex v = edge.getDestination();
            distances[u.getId()][v.getId()] = edge.getWeight();
        }
        
        for(int k = 1; k < graph.length; k++) {
            for(int i = 1; i < graph.length; i++) {
                for(int j = 1; j < graph.length; j++) {
                    int alternateDistance = distances[i][k] + distances[k][j];
                    if(distances[i][j] > alternateDistance) {
                        distances[i][j] = alternateDistance;
                    }
                }
            }
        }
        
        return distances;
    }
    
    static class Vertex implements Comparable<Vertex>{
        
        private byte color;
        private int distance;
        private Vertex parent;
        private int id;
        private int weight;
        private TreeSet<Vertex> adjacentVertices = new TreeSet<>();

        public Vertex() {
        }

        public Vertex(byte color, int distance, Vertex parent, int id, int weight) {
            this.color = color;
            this.distance = distance;
            this.parent = parent;
            this.id = id;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public TreeSet<Vertex> getAdjacentVertices() {
            return adjacentVertices;
        }

        public void setAdjacentVertices(TreeSet<Vertex> adjacentVertices) {
            this.adjacentVertices = adjacentVertices;
        }

        @Override
        public int compareTo(Vertex that) {
            return this.getId() - that.getId();
        }
        
    }
    
    static class Edge implements Comparable<Edge>{

        private Vertex source;
        private Vertex destination;
        private int weight;

        public Edge() {
        }

        public Edge(Vertex source, Vertex destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
        
        public Vertex getSource() {
            return source;
        }

        public void setSource(Vertex source) {
            this.source = source;
        }

        public Vertex getDestination() {
            return destination;
        }

        public void setDestination(Vertex destination) {
            this.destination = destination;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge t) {
            return this.getWeight() - t.getWeight();
        }
    }
}
