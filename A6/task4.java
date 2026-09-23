import java.io.*;
 import java.util.*;
public class task4{
   
static int[] d;
public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
//int m =Integer.parseInt(st.nextToken());
ArrayList<Integer>[]adj= new ArrayList[n+1];
for(int i=1;i<=n;i++){
    adj[i]=new ArrayList<>();

}
for(int i=0;i<n-1;i++){
    st= new StringTokenizer(bf.readLine());
    int u= Integer.parseInt(st.nextToken());
    int v=Integer.parseInt(st.nextToken());
adj[u].add(v);
adj[v].add(u);
}
int frst= bfs(1,adj,n);
int scnd= bfs(frst,adj,n);
 pw.println(d[scnd]);
        pw.println(frst + " " + scnd);

        pw.close();
}
public static int bfs(int strt, ArrayList<Integer>[] adj, int n){
String[]col=new String[n+1];
d= new int[n+1];
for(int i=1;i<=n;i++){
    col[i]="w";
    d[i]=-1;

}
Queue<Integer>q= new LinkedList<>();
col[strt]="g";
d[strt]=0;
q.add(strt);
while(!q.isEmpty()){
int u= q.poll();
for(int i=0;i<adj[u].size();i++){
    int v= adj[u].get(i);
    if(col[v].equals("w")){
        col[v]="g";
        d[v]=d[u]+1;
        q.add(v);

    }

}
col[u]="b";
}
int frthst=1;
for(int i=1; i<=n;i++){
if(d[i]>d[frthst]){
    frthst=i;

}
}
return frthst;
}
}