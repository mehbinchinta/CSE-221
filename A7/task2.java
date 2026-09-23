    import java.io.*;
        import java.util.*; 
        public class task2{
        

        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st= new StringTokenizer(bf.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        int a= Integer.parseInt(st.nextToken());//alice
        int b =Integer.parseInt(st.nextToken());//bob
        ArrayList<long[]>[]adj= new ArrayList[n+1];
        for(int i=1;i<=n;i++){
    adj[i]=new ArrayList<>();

        }
    for(int i=0; i<m;i++){
    st=new StringTokenizer(bf.readLine());
    int u = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        long w = Long.parseLong(st.nextToken());

        adj[u].add(new long[]{v, w});
    }
    long[]alice= dij(a,adj,n);
    long[]bob=dij(b,adj,n);

    long mintime = Long.MAX_VALUE;
    int meetnode = -1;

    for(int i=1;i<= n;i++){

        if(alice[i]!= Long.MAX_VALUE && bob[i] != Long.MAX_VALUE){
            long currtime = Math.max(alice[i], bob[i]);

            if(currtime < mintime){
                mintime = currtime;
                meetnode = i;

        }
    }
    }
    if(meetnode == -1){
        pw.println(-1);
    }
    else{
        pw.println(mintime + " " + meetnode);
    }

    pw.flush();

 }

    public static long[] dij(int start, ArrayList<long[]>[]adj,int n){
        long[] dist= new long[n+1];
        //int[]p= new int[n+1];
        for(int i=1;i<=n;i++){
        dist[i]=Long.MAX_VALUE;
    // p[i]=-1;
        }
        dist[start]=0;
        PriorityQueue<long[]> pq= new PriorityQueue<>((node1,node2)->Long.compare(node1[1],node2[1]));
        pq.add(new long[]{start,0});
        while(!pq.isEmpty()){
            long[]curr=pq.poll();
            int unode=(int) curr[0];
            long udist=curr[1];
            for(int i=0;i<adj[unode].size();i++){
                long[]edge=adj[unode].get(i);
                int v= (int)edge[0];
                long w= edge[1];
                if(dist[v]>dist[unode]+w){
                    dist[v]=dist[unode]+w;
                //  p[v]=unode;
                    pq.add(new long[]{v,dist[v]});
                }


                }
            }
            return dist;

        }

    }
