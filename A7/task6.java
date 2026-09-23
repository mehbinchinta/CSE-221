    import java.io.*;
        import java.util.*;
        public class task6{
        

        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st= new StringTokenizer(bf.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        int s= Integer.parseInt(st.nextToken());
        int d =Integer.parseInt(st.nextToken());
        
        //ArrayList<Long>[]w8= new ArrayList[n+1];
        ArrayList<long[]>[]adj= new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            adj[i]=new ArrayList<>();
        
        }
        

        for(int i=0; i<m;i++){
            st= new StringTokenizer(bf.readLine());
    int u=Integer.parseInt(st.nextToken());
    int v=Integer.parseInt(st.nextToken());
        long w=Long.parseLong(st.nextToken());
        adj[u].add(new long[]{v,w});
        adj[v].add(new long[]{u,w});
        
        }
        long[] shortest= new long[n+1];
        long[] scndshort= new long[n+1];
    for(int i=1;i<=n;i++){
        shortest[i]=Long.MAX_VALUE;
        scndshort[i]=Long.MAX_VALUE;

    }
    shortest[s]=0;
    PriorityQueue<long[]>pq= new PriorityQueue<>((node1,node2)->Long.compare(node1[1],node2[1]));
    pq.add(new long[]{s,0});
    while(!pq.isEmpty()){
        long[]curr=pq.poll();
        int unode=(int) curr[0];
        long udist=curr[1];
    
        for(int i=0;i<adj[unode].size();i++){
                int vnode=(int)adj[unode].get(i)[0];
                long edgew8= adj[unode].get(i)[1];
                long newdist= udist + edgew8;
                if(newdist<shortest[vnode]){
                long oldshortest= shortest[vnode];
                shortest[vnode]=newdist;
                scndshort[vnode]=oldshortest;
                pq.add(new long[]{vnode,newdist});
                //if(oldshortest!=Long.MAX_VALUE){
                    //pq.add(new long[]{vnode,oldshortest});

                //}
                }
                else if(newdist>shortest[vnode]&& newdist<scndshort[vnode]){
                    scndshort[vnode]=newdist;
                    pq.add(new long[]{vnode,newdist});


                }
        }
    }
    if(scndshort[d]==Long.MAX_VALUE){
        pw.println(-1);

    }
    else{
        pw.println(scndshort[d]);
    }
    pw.flush();
        }
    }