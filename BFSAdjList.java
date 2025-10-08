import  java.util.*;
public class BFSAdjList{
    private int v;
    private LinkedList<Integer>[] adj;
    public BFSAdjList(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int src, int dest){
        adj[src].add(dest);
        adj[dest].add(src);
        }
    public void bfs(int start){
        boolean[] visited = new boolean[v];
        Arrays.fill(visited, false);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()){
            int vis = queue.poll();
            System.out.print(vis+" ");
            for(int neighbour : adj[vis]){
                if(!visited[neighbour]){
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int v = sc.nextInt();
        BFSAdjList graph = new BFSAdjList(v);
        System.out.println("Enter the number of edges:");
        int e = sc.nextInt();
        System.out.println("Enter the edges(source and destination)");
        for(int i=0;i<e;i++){
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(src, dest);
        }
        System.out.println("Enter the starting vertex for BFS:");
        int start = sc.nextInt();
        System.out.println("BFS traversal starting from vertix "+start+":");
        graph.bfs(start);
        sc.close();
    }
}

