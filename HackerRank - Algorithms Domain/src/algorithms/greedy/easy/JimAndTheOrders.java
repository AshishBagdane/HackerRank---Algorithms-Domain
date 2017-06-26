package algorithms.greedy.easy;

import java.util.Scanner;
import java.util.TreeSet;

public class JimAndTheOrders {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Order> orders = new TreeSet<>();
        
        for(int i=1;i<=n;i++) {
            Order order = new Order(i, sc.nextInt(), sc.nextInt());
            orders.add(order);
        }
        
        for(Order order : orders) {
            System.out.print(order.getOrderId() + " ");
        }
        
        sc.close();
    }
}

class Order implements Comparable<Order>{
    
    private int orderId;
    private int takenAtTime;
    private int timeToProcess;
    private int deliveredAtTime;

    public Order() {
    }

    public Order(int orderId, int takenAtTime, int timeToProcess) {
        this.orderId = orderId;
        this.takenAtTime = takenAtTime;
        this.timeToProcess = timeToProcess;
        this.deliveredAtTime = takenAtTime + timeToProcess;
    }
    
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getTakenAtTime() {
        return takenAtTime;
    }

    public void setTakenAtTime(int takenAtTime) {
        this.takenAtTime = takenAtTime;
    }

    public int getTimeToProcess() {
        return timeToProcess;
    }

    public void setTimeToProcess(int timeToProcess) {
        this.timeToProcess = timeToProcess;
    }

    public int getDeliveredAtTime() {
        return deliveredAtTime;
    }

    public void setDeliveredAtTime(int deliveredAtTime) {
        this.deliveredAtTime = deliveredAtTime;
    }

    @Override
    public int compareTo(Order t) {
        int diff = this.getDeliveredAtTime() - t.getDeliveredAtTime();
        return (diff != 0) ? diff : this.getOrderId() - t.getOrderId();
    }
}