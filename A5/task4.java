    import java.io.*;
    import java.util.*;
    public class task4{
    static String[]color;
    static int[]p;
    static int [] d;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st= new StringTokenizer(bf.readLine());
    int n= Integer.parseInt(st.nextToken());
    int m= Integer.parseInt(st.nextToken());
    int src= Integer.parseInt(st.nextToken());
    int dest= Integer.parseInt(st.nextToken());
    int k= Integer.parseInt(st.nextToken());
    ArrayList<Integer>[]adj= new ArrayList[n+1];
    for(int i=1;i<=n;i++){
        adj[i]= new ArrayList<>();

    }
    for(int i=0;i<m;i++){
        st= new StringTokenizer(bf.readLine());
        int u= Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());
    adj[u].add(v);
    //adj[v].add(u);
    }
    for(int i=1;i<=n;i++){
    Collections.sort(adj[i]);
    }
    Bfs(adj,src,n);
    ArrayList<Integer> path1= findpath(src,k);
    Bfs(adj,k,n);
    ArrayList<Integer> path2=findpath(k,dest);

    if (path1==null||path2==null) {
        pw.println(-1);
    } else{

        int len=(path1.size()-1)+(path2.size()-1);

        pw.println(len);

        for (int i = 0; i < path1.size(); i++) {
        pw.print(path1.get(i) + " ");
    }

        for (int i = 1; i < path2.size(); i++) {
            pw.print(path2.get(i) + " ");
        }
    }

    pw.flush();

    }

    public static void Bfs(ArrayList<Integer>[]adj,int source,int n){
    color= new String[n+1];
    p=new int[n+1];
    d= new int[n+1];
    for(int u=1; u<=n; u++){
        color[u]="white";
        p[u]=-1;
        d[u]=Integer.MAX_VALUE;


    }
    int s=source;
    color[s]="gray";
    d[s]=0;
    Queue<Integer> q= new LinkedList<>();
    q.add(s);
    while(!q.isEmpty()){
        int u= q.poll();
        //pw.print(u+ " ");
        for(int i=0; i<adj[u].size();i++){
            int v= adj[u].get(i);
            if(color[v].equals("white")){
                color[v]="gray";
                d[v]=d[u]+1;
                p[v]=u;
                q.add(v);

            }

        }
        color[u]="black";
t

    }
    }
    public static ArrayList<Integer> findpath(int src, int dest){
    if (d[dest] == Integer.MAX_VALUE) {
    return null;
    } else {
    //pw.println(d[dest]);

        ArrayList<Integer>path = new ArrayList<>();

        int curr =dest;

        while (curr!= src) {
            path.add(curr);
            curr= p[curr];
        }

        path.add(src);

        Collections.reverse(path);

    return path;
    }

    }
    }