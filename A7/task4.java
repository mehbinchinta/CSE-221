    import java.io.*;
            import java.util.*;
            public class task4{
            

            public static void main(String[] args) throws IOException {
                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            StringTokenizer st= new StringTokenizer(bf.readLine());
            int n= Integer.parseInt(st.nextToken());
            int m =Integer.parseInt(st.nextToken());
            int s= Integer.parseInt(st.nextToken());
            int d =Integer.parseInt(st.nextToken());
    long[]w8=new long[n+1];

    st= new StringTokenizer(bf.readLine());
    for(int i=1;i<=n;i++){
        w8[i]=Long.parseLong(st.nextToken());

    }
            ArrayList<Integer>[]adj= new ArrayList[n+1];
            for(int i=1;i<=n;i++){
        adj[i]=new ArrayList<>();

            }
        for(int i=0; i<m;i++){
        st=new StringTokenizer(bf.readLine());
        int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
        }
        long[]dist=new long[n+1];
    for(int i=1;i<=n;i++){
    dist[i]=Long.MAX_VALUE;
    }
    dist[s]=w8[s];
    PriorityQueue <long[]> pq=new PriorityQueue<>((node1,node2)->Long.compare(node1[1],node2[1]));
    pq.add(new long[]{s,w8[s]});
    while(!pq.isEmpty()){
    long[]curr=pq.poll();
    int u= (int)curr[0];
    for(int i=0;i<adj[u].size();i++){
        int v= adj[u].get(i);
        long newdist=dist[u]+w8[v];
    if(newdist< dist[v]){
    dist[v]=newdist;
    pq.add(new long[]{v,dist[v]});

    }
    }
    }

        if(dist[d]==Long.MAX_VALUE){
    pw.print(-1);

        }
        else{
            pw.print(dist[d]);
        }

    pw.flush();
            }
        }
        