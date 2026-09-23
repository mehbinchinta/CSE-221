import java.io.*;
 import java.util.*;
public class task3{
   

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int m= Integer.parseInt(st.nextToken());
int src= Integer.parseInt(st.nextToken());
int dest= Integer.parseInt(st.nextToken());
int[]nodeu=new int[m];
int[]nodev=new int[m];
st= new  StringTokenizer(bf.readLine());
for(int i=0; i<m;i++){
    nodeu[i]=Integer.parseInt(st.nextToken());
}
st= new  StringTokenizer(bf.readLine());
for(int i=0; i<m;i++){
    nodev[i]=Integer.parseInt(st.nextToken());
}
ArrayList<Integer>[]adj= new ArrayList[n+1];
for(int i=1;i<=n;i++){
    adj[i]= new ArrayList<>();

}
for(int i=0;i<m;i++){
  adj[nodeu[i]].add(nodev[i]);
   adj[nodev[i]].add(nodeu[i]);

}
for(int i=1;i<=n;i++){
Collections.sort(adj[i]);
}

String[]color= new String[n+1];
int[]p=new int[n+1];
int [] d= new int[n+1];
for(int u=1; u<=n; u++){
    color[u]="white";
    p[u]=-1;
    d[u]=Integer.MAX_VALUE;


}
int s=src;
color[s]="gray";
d[s]=0;
Queue<Integer> q= new LinkedList<>();
q.add(s);
while(!q.isEmpty()){
    int u= q.poll();
    //pw.print(u+ " ");
    for(int i=0; i<adj[u].size();i++){
        int v= adj[u].get(i);
        if(color[v].equals("white")){
            color[v]="gray";
            d[v]=d[u]+1;
            p[v]=u;
            q.add(v);

        }

    }
    color[u]="black";


}
if (d[dest] == Integer.MAX_VALUE) {
    pw.print(-1);
} else {
   pw.println(d[dest]);

    ArrayList<Integer>path = new ArrayList<>();

    int curr =dest;

    while (curr!= src) {
        path.add(curr);
        curr= p[curr];
    }

    path.add(src);

    Collections.reverse(path);

   for (int i=0; i<path.size();i++) {
    pw.print(path.get(i) + " ");
}
}
pw.flush();
}
}