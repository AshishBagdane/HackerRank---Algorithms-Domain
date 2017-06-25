package algorithms.graphtheory.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KruskalMSTReallySpecialSubtree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        DisjointSet ds = new DisjointSet(n);
        PriorityQueue<EdgeK> edges = new PriorityQueue<>();
        for(int i=0;i<m;i++) {
            NodeK source = new NodeK(sc.nextInt());
            NodeK destination = new NodeK(sc.nextInt());
            int weight = sc.nextInt();
            edges.add(new EdgeK(source, destination, weight));
        }
        sc.close();
        int pathWeight = 0;
        while(!edges.isEmpty()) {
            EdgeK edge = edges.poll();
            NodeK source = edge.getSource();
            NodeK destination = edge.getDestination();
            pathWeight += (ds.union(source.getId(), destination.getId())) ? edge.getWeight() : 0;
        }
        System.out.println(pathWeight);
    }
}

class EdgeK implements Comparable<EdgeK>{

    private NodeK source;
    private NodeK destination;
    private int weight;

    public EdgeK() {
    }
    
    public EdgeK(NodeK source, NodeK destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public NodeK getSource() {
        return source;
    }

    public void setSource(NodeK source) {
        this.source = source;
    }

    public NodeK getDestination() {
        return destination;
    }

    public void setDestination(NodeK destination) {
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(EdgeK t) {
        int diff = (this.getSource().getId() + this.getWeight() + this.getDestination().getId()) - (t.getSource().getId() + t.getWeight() + t.getDestination().getId());
        return (this.getWeight()==t.getWeight()) ? diff : this.getWeight() - t.getWeight();
    }
}

class NodeK {

    private int id;

    public NodeK() {
    }
    
    public NodeK(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class DisjointSet {
    
    private Map<Integer, Integer> parent = new HashMap<>();
    private Map<Integer, Integer> rank = new HashMap<>();

    public DisjointSet(int n) {
        for(int i=1;i<=n;i++) {
            parent.put(i, i);
            rank.put(i, 1);
        }
    }
    
    public int find(int item) {
        if(parent.get(item)==item) {
            return item;
        }else{
            return find(parent.get(item));
        }
    }
    
    public boolean union(int setA, int setB) {
        int parentA = find(setA);
        int parentB = find(setB);
        if(parentA!=parentB){
            if(rank.get(parentA)<rank.get(parentB)) {
                parent.put(parentA, parentB);
                rank.put(parentB, rank.get(parentA)+rank.get(parentB));
            }else {
                parent.put(parentB, parentA);
                rank.put(parentA, rank.get(parentA)+rank.get(parentB));
            }
            return true;
        }
        return false;
    }

    public Map<Integer, Integer> getParent() {
        return parent;
    }

    public void setParent(Map<Integer, Integer> parent) {
        this.parent = parent;
    }

    public Map<Integer, Integer> getRank() {
        return rank;
    }

    public void setRank(Map<Integer, Integer> rank) {
        this.rank = rank;
    }
}
