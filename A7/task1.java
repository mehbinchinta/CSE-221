    import java.io.*;
    import java.util.*;
    public class task1{
    

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st= new StringTokenizer(bf.readLine());
    int n= Integer.parseInt(st.nextToken());
    int m =Integer.parseInt(st.nextToken());
    int s= Integer.parseInt(st.nextToken());
    int d =Integer.parseInt(st.nextToken());
    int[]u=new int[m];
    int[]v=new int[m];
    long[]w= new long[m]; 
    //ArrayList<Long>[]w8= new ArrayList[n+1];
    ArrayList<long[]>[]adj= new ArrayList[n+1];
    for(int i=1;i<=n;i++){
        adj[i]=new ArrayList<>();
       // w8[i]=new ArrayList<>();
    }
    StringTokenizer stu= new StringTokenizer(bf.readLine());
    StringTokenizer stv= new StringTokenizer(bf.readLine());
    StringTokenizer stw= new StringTokenizer(bf.readLine());

    for(int i=0; i<m;i++){
    u[i]=Integer.parseInt(stu.nextToken());
    v[i]=Integer.parseInt(stv.nextToken());
    w[i]=Long.parseLong(stw.nextToken());
    adj[u[i]].add(new long[]{v[i],w[i]});
    //w8[u[i]].add(w[i]);
    }
    long[] dist= new long[n+1];
    int[]p= new int[n+1];
    for(int i=1;i<=n;i++){
    dist[i]=Long.MAX_VALUE;
    p[i]=-1;
    }
    dist[s]=0;
    PriorityQueue<long[]> pq= new PriorityQueue<>((node1,node2)->Long.compare(node1[1],node2[1]));
    pq.add(new long[]{s,0});
    while(!pq.isEmpty()){
        long[]curr=pq.poll();
        int unode=(int) curr[0];
        long udist=curr[1];
        for(int i=0;i<adj[unode].size();i++){
            int vnode= (int)adj[unode].get(i)[0];  
            long edgew8= adj[unode].get(i)[1];
            if(dist[vnode]>dist[unode]+edgew8){
                dist[vnode]=dist[unode]+edgew8;
                p[vnode]=unode;
                pq.add(new long[]{vnode,dist[vnode]});
            }
        }

    }
    if(dist[d]==Long.MAX_VALUE){
        pw.print(-1);

    }
    else{
        pw.println(dist[d]);
        ArrayList<Integer> path = new ArrayList<>();

        int crnt=d;

        while (crnt!=-1) {
            path.add(crnt);
            crnt = p[crnt];
        }

        Collections.reverse(path);
        for (int i = 0;i <path.size(); i++) {
        pw.print(path.get(i)+" ");


    }

    pw.println();

    }
    pw.flush();
    }
    }