import java.io.*;
    import java.util.*;
    public class task5{
    

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st= new StringTokenizer(bf.readLine());
    int n= Integer.parseInt(st.nextToken());
    int m =Integer.parseInt(st.nextToken());
    int[]u=new int[m];
    int[]v=new int[m];
    long[]w= new long[m]; 
    ArrayList<Long>[]w8= new ArrayList[n+1];
    ArrayList<Integer>[]adj= new ArrayList[n+1];
    for(int i=1;i<=n;i++){
        adj[i]=new ArrayList<>();
        w8[i]=new ArrayList<>();
    }
    StringTokenizer stu= new StringTokenizer(bf.readLine());
    StringTokenizer stv= new StringTokenizer(bf.readLine());
    StringTokenizer stw= new StringTokenizer(bf.readLine());

    for(int i=0; i<m;i++){
    u[i]=Integer.parseInt(stu.nextToken());
    v[i]=Integer.parseInt(stv.nextToken());
    w[i]=Long.parseLong(stw.nextToken());
    adj[u[i]].add(v[i]);
    w8[u[i]].add(w[i]);
    }
    long[][]dist=new long[n+1][2];
    for(int i=1;i<=n;i++){
        dist[i][0]=Long.MAX_VALUE;
        dist[i][1]=Long.MAX_VALUE;

    }
    dist[1][0]=0;
    dist[1][1]=0;
    PriorityQueue<long[]>pq= new PriorityQueue<>((node1,node2)->Long.compare(node1[1],node2[1]));
 pq.add(new long[]{1,0,0});
 pq.add(new long[]{1,0,1});
 while(!pq.isEmpty()){
    long[]curr=pq.poll();
    int unode=(int) curr[0];
    long udist=curr[1];
    int uparity=(int)curr[2];
    for(int i=0;i<adj[unode].size();i++){
            int vnode= adj[unode].get(i);
            long edgew8= w8[unode].get(i);
            int newparity=(int)(edgew8%2);
            if(newparity!=uparity){
                if(dist[vnode][newparity]>udist+edgew8){
                    dist[vnode][newparity]=udist+edgew8;
                    pq.add(new long[]{vnode,dist[vnode][newparity],newparity});
                }

            }

 }
}
long ans =Math.min(dist[n][0], dist[n][1]);

if(ans == Long.MAX_VALUE){
    pw.println(-1);
}
else{
    pw.println(ans);
}
pw.flush();
    }
}