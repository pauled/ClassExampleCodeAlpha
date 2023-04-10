package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N> {

    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addEdge(N from, N to) {
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }

    public void addBidirectionalEdge(N node1, N node2) {
        this.addNode(node1);
        this.addNode(node2);
        this.adjacencyList.get(node1).add(node2);
        this.adjacencyList.get(node2).add(node1);
    }

    private void addNode(N a) {
        if (!this.adjacencyList.containsKey(a)) {
            this.adjacencyList.put(a, new ArrayList<>());
        }
    }

    public HashMap<N, ArrayList<N>> getAdjacencyList() {
        return adjacencyList;
    }

    public boolean areConnected(N from, N to){
        return this.adjacencyList.containsKey(from) && this.adjacencyList.get(from).contains(to);
    }

    public boolean validPath(ArrayList<N> path) {
        for (int i=0; i < path.size()-1; i++) {
            N from = path.get(i);
            N to = path.get(i+1);
            if (!this.areConnected(from, to)) {
                return false;
            }
        }
        return true;
    }

    public N mostIncomingConnections(){
        HashMap<N, Integer> incoming = new HashMap<>();
        for(ArrayList<N> destinations : this.adjacencyList.values()){
            for(N to: destinations){
                if(!incoming.containsKey(to)){
                    incoming.put(to, 1);
                }else {
                    incoming.put(to, incoming.get(to) +1 );
                }
            }
        }
        int max = -1;
        N bestNode = null;
        for(N node: incoming.keySet()){
            int count = incoming.get(node);
            if(count > max){
                max = count;
                bestNode = node;
            }
        }
        return bestNode;
    }

    @Override
    public String toString() {
        return this.adjacencyList.toString();
    }

    public static void example(){
        Graph<String> graph = new Graph<>();
        graph.addBidirectionalEdge("UCLA","STANFORD");
        graph.addBidirectionalEdge("UCLA","SRI");
        graph.addBidirectionalEdge("UCLA","UCSB");
        graph.addBidirectionalEdge("UCLA","RAND");
        graph.addBidirectionalEdge("STANFORD","SRI");
        graph.addBidirectionalEdge("SRI","UCSB");
        graph.addBidirectionalEdge("UCSB","RAND");
        graph.addBidirectionalEdge("SRI","UTAH");
        graph.addBidirectionalEdge("RAND","SDC");
        graph.addBidirectionalEdge("UTAH","SDC");
        graph.addBidirectionalEdge("UTAH","MIT");
        graph.addBidirectionalEdge("RAND","BBN");
        graph.addBidirectionalEdge("MIT","BBN");
        graph.addBidirectionalEdge("MIT","LINCOLN");
        graph.addBidirectionalEdge("LINCOLN","CASE");
        graph.addBidirectionalEdge("CASE","CARNEGIE");
        graph.addBidirectionalEdge("CARNEGIE","HARVARD");
        graph.addBidirectionalEdge("HARVARD","BBN");
    }

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        graph.addEdge("BUF", "WDC");//fix edges to make interesting
        graph.addEdge("TOR", "BUF");
        graph.addEdge("BUF", "TOR");
        graph.addEdge("JFK", "BUF");
        graph.addEdge("WDC", "JFK");
        graph.addEdge("WDC", "BUF");
        System.out.println(graph);

        ArrayList<String> path = new ArrayList<>(Arrays.asList("BUF", "WDC", "JFK"));
        System.out.println(graph.validPath(path));

        ArrayList<String> path2 = new ArrayList<>(Arrays.asList("BUF", "WDC", "JFK", "TOR"));
        System.out.println(graph.validPath(path2));

        ArrayList<String> path3 = new ArrayList<>(Arrays.asList("BUFFALO", "WDC", "JFK", "TOR"));
        System.out.println(graph.validPath(path3));

        System.out.println(graph.mostIncomingConnections());
    }

}
