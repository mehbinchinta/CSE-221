    import java.io.*;
        import java.util.*;
        public class task3{
        

        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st= new StringTokenizer(bf.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
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
            adj[v].add(new long[]{u,w});
        }
        long[] dist= new long[n+1];
            //int[]p= new int[n+1];
            for(int i=1;i<=n;i++){
            dist[i]=Long.MAX_VALUE;
    
            }
            dist[1]=0;
            PriorityQueue<long[]> pq= new PriorityQueue<>((node1,node2)->Long.compare(node1[1],node2[1]));
            pq.add(new long[]{1,0});//vertex and distance
            while(!pq.isEmpty()){
                long[]curr=pq.poll();
                int unode=(int) curr[0];
                long udist=curr[1];
                for(int i=0;i<adj[unode].size();i++){
                    long[]edge=adj[unode].get(i);
                    int v= (int)edge[0];
                    long w= edge[1];
                    long newdngr=Math.max(dist[unode],w);//maxdngr alrready faced
                    if(newdngr<dist[v]){//minimum dngr
                        dist[v]=newdngr;

                    
                        pq.add(new long[]{v,dist[v]});
                    }
                    }


                        }
    for(int i=1;i<=n;i++){
        if(dist[i]==Long.MAX_VALUE){
            pw.print(-1+" ");
        }
        else{
            pw.print(dist[i]+" ");
        }
    }
    pw.flush();
                    }
                }

