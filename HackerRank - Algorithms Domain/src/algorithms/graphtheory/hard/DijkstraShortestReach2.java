package algorithms.graphtheory.hard;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class DijkstraShortestReach2 {
    
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out = new OutputWriter(System.out);
        int t = in.readInt();
        while(t--!=0) {
            int nodes = in.readInt();
            int edges = in.readInt();
            
            Node[] graph = new Node[nodes+1];
            
            int[][] edgeWeight = new int[nodes+1][nodes+1];
        
            for(int i=1;i<=nodes;i++) {
                graph[i] = new Node();
                graph[i].setId(i);
            }
        
            for(int i=0;i<edges;i++) {
                int source = in.readInt();
                int destination = in.readInt();
                int weight = in.readInt();
                
                if(edgeWeight[source][destination]>weight || edgeWeight[source][destination]==0) {
                    graph[source].getAdjacentNodes().add(graph[destination]);
                    graph[destination].getAdjacentNodes().add(graph[source]);
                    edgeWeight[source][destination] = weight;
                    edgeWeight[destination][source] = weight;
                }
            }
            
            int source = in.readInt();
            
            //printGraph(graph, edgeWeight);
            
            Dijkstra(graph, graph[source], edgeWeight);
            
            for(int i=1;i<graph.length;i++) {
                if(i!=source) {
                    out.print(((graph[i].getDistance()==Integer.MAX_VALUE) ? -1 : graph[i].getDistance()) + " ");
                }
            }
            out.printLine();
        }
        out.flush();
        out.close();
    }
    
    static void printGraph(Node[] graph, int[][] edgeWeight) {
        for(Node vertex : graph) {
            if(vertex!=null) {
                System.out.print(vertex.getId() + " : ");
                for(Node adjacentNode : vertex.getAdjacentNodes()) {
                    System.out.print(adjacentNode.getId() + " = " + edgeWeight[vertex.getId()][adjacentNode.getId()] + ", ");
                }
                System.out.println();
            }
        }
    }
    
    static void Dijkstra(Node[] graph, Node source, int[][] edgeWeight) {
        for(Node vertex : graph) {
            if(vertex!=source && vertex!=null) {
                vertex.setDistance(Integer.MAX_VALUE);
                vertex.setParent(null);
            }
        }
        source.setDistance(0);
        source.setParent(null);
        Set<Node> visitedVertices = new HashSet<>();
        PriorityQueue<Node> unvisitedVertices = new PriorityQueue<>((Node t, Node t1) -> t.getDistance() - t1.getDistance());
        for(int i=1;i<graph.length;i++) {
            unvisitedVertices.add(graph[i]);
        }
        while(!unvisitedVertices.isEmpty()) {
            Node u = unvisitedVertices.poll();
            visitedVertices.add(u);
            for(Node v : u.getAdjacentNodes()) {
                if(v.getDistance()>(u.getDistance() + edgeWeight[u.getId()][v.getId()]) && u.getDistance()!=Integer.MAX_VALUE) {
                    unvisitedVertices.remove(v);
                    v.setDistance(u.getDistance() + edgeWeight[u.getId()][v.getId()]);
                    v.setParent(u);
                    unvisitedVertices.add(v);
                }
            }
        }
    }
}

class Node {

    private int id;
    private int distance;
    private Node parent;
    private List<Node> adjacentNodes = new ArrayList<>();

    public Node(int id, int distance, Node parent) {
        this.id = id;
        this.distance = distance;
        this.parent = parent;
    }
    
    public Node() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(List<Node> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }
}

class Edge implements Comparable<Edge>{

    private Node source;
    private Node destination;
    private int weight;

    public Edge() {
    }

    public Edge(Node source, Node destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
    
    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getDestination() {
        return destination;
    }

    public void setDestination(Node destination) {
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

class InputReader {

    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;

    public InputReader(InputStream stream) {
            this.stream = stream;
    }

    public int read() {
            if (numChars == -1)
                    throw new InputMismatchException();
            if (curChar >= numChars) {
                    curChar = 0;
                    try {
                            numChars = stream.read(buf);
                    } catch (IOException e) {
                            throw new InputMismatchException();
                    }
                    if (numChars <= 0)
                            return -1;
            }
            return buf[curChar++];
    }

    public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                    c = read();
            int sgn = 1;
            if (c == '-') {
                    sgn = -1;
                    c = read();
            }
            int res = 0;
            do {
                    if (c < '0' || c > '9')
                            throw new InputMismatchException();
                    res *= 10;
                    res += c - '0';
                    c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
    }

    public String readString() {
            int c = read();
            while (isSpaceChar(c))
                    c = read();
            StringBuilder res = new StringBuilder();
            do {
                    res.appendCodePoint(c);
                    c = read();
            } while (!isSpaceChar(c));
            return res.toString();
    }

    public boolean isSpaceChar(int c) {
            if (filter != null)
                    return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public String next() {
            return readString();
    }

    public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
    }
}
 
class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
    }

    public void print(Object...objects) {
            for (int i = 0; i < objects.length; i++) {
                    if (i != 0)
                            writer.print(' ');
                    writer.print(objects[i]);
            }
    }

    public void printLine(Object...objects) {
            print(objects);
            writer.println();
    }

    public void close() {
            writer.close();
    }

    public void flush() {
            writer.flush();
    }

}
 
class IOUtils {

    public static int[] readIntArray(InputReader in, int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
                    array[i] = in.readInt();
            return array;
    }

}