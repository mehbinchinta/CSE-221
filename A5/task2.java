import java.io.*;
 import java.util.*;
public class task2{
   static int time=0;
  static String[]color;
static int[]p;
static int[]d;
static int[]f;
static ArrayList<Integer> order = new ArrayList<>();

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int m =Integer.parseInt(st.nextToken());
int[]u=new int[m];
int[]v=new int[m];
st= new  StringTokenizer(bf.readLine());
for(int i=0; i<m;i++){
    u[i]=Integer.parseInt(st.nextToken());
}
st= new  StringTokenizer(bf.readLine());
for(int i=0; i<m;i++){
    v[i]=Integer.parseInt(st.nextToken());
}
ArrayList<Integer>[]adj=new ArrayList[n+1];
for(int i=1;i<=n;i++){
    adj[i]= new ArrayList<>();

}
for(int i=0;i<m;i++){
  adj[u[i]].add(v[i]);
   adj[v[i]].add(u[i]);

}
color=new String[n+1];
p=new int[n+1];
d=new int[n+1];
f=new int[n+1];

for(int node=1;node<=n;node++){
    color[node]="white";
    p[node]=-1;


}
for(int node=1;node<=n;node++){
    if(color[node].equals("white")){
        dfsvisit(adj,node);

    }
 
}
for (int i=0; i<order.size();i++) {
    int x=order.get(i);
    pw.print(x + " ");
}
pw.flush();
}
public static void dfsvisit(ArrayList<Integer>[]adj, int u){
color[u]="gray";
order.add(u);
time=time+1;
d[u]=time;
for(int i=0;i<adj[u].size();i++){
int v=adj[u].get(i);
if(color[v].equals("white")){
p[v]=u;
dfsvisit(adj,v);
}
}
color[u]="black";
time=time+1;
f[u]=time;


}
}

