import java.io.*;
 import java.util.*;
public class task6{
  static String[]color;
  static int grpcount=0;
  static int []grp;

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int m =Integer.parseInt(st.nextToken());
int q =Integer.parseInt(st.nextToken());
ArrayList<Integer>[]adj=new ArrayList[n+1];
for(int i=1;i<=n;i++){
    adj[i]= new ArrayList<>();

}
for(int i=0;i<m;i++){
    st=new StringTokenizer(bf.readLine());
    int u= Integer.parseInt(st.nextToken());
    int v=Integer.parseInt(st.nextToken());
adj[u].add(v);
adj[v].add(u);
}

color=new String[n+1];
grp=new int[n+1];

for(int node=1;node<=n;node++){
    color[node]="white";
  


}
for(int node=1;node<=n;node++){
    if(color[node].equals("white")){
        grpcount=grpcount+1;
        dfsvisit(adj,node);

    }
 
}
for(int  i=0;i<q;i++){
st=new StringTokenizer(bf.readLine());
int a= Integer.parseInt(st.nextToken());
int b= Integer.parseInt(st.nextToken());
if(grp[a]==grp[b]){
    pw.println("YES");
}
else{
    pw.println("NO");
}

}
pw.flush();
}


public static void dfsvisit(ArrayList<Integer>[]adj, int u){
color[u]="gray";
grp[u]=grpcount;

for(int i=0;i<adj[u].size();i++){
int v=adj[u].get(i);
if(color[v].equals("white")){
dfsvisit(adj,v);
}
}   
color[u]="black";



}
}