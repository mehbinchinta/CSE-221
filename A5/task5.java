import java.io.*;
import java.util.*;
public class task5{
     static String[]color;
static int[]p;
static int[]subtreesize;
    public static void main(String[]args) throws IOException{
 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int r= Integer.parseInt(st.nextToken());
ArrayList<Integer>[]adj= new ArrayList[n+1];
for(int i=1;i<=n;i++){
    adj[i]=new ArrayList<>();
}
for(int i=0; i<n-1;i++){
    st=new StringTokenizer(bf.readLine());
    int u= Integer.parseInt(st.nextToken());
int v= Integer.parseInt(st.nextToken());
adj[u].add(v);
adj[v].add(u);
}
int q= Integer.parseInt(bf.readLine());
color=new String[n+1];
p=new int[n+1];
subtreesize=new int[n+1];
p[r]=-1;
for(int u=1; u<=n;u++){
    color[u]="white";
    p[u]=-1;

}
dfsvisit(adj,r);
for(int i=0;i<q;i++){
    int x= Integer.parseInt(bf.readLine());
pw.println(subtreesize[x]);

}
pw.flush();

    }
    public static void dfsvisit(ArrayList<Integer>[]adj, int u){
color[u]="gray";
subtreesize[u]=1;
for(int i=0;i<adj[u].size();i++){
int v= adj[u].get(i);
if(color[v]=="white"){
    p[v]=u;
    dfsvisit(adj,v);
    subtreesize[u]+=subtreesize[v];

}
}
color[u]="black";


    }









}