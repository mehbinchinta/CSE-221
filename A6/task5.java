import java.io.*;
 import java.util.*;
public class task5{
   

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int m =Integer.parseInt(st.nextToken());
int s= Integer.parseInt(st.nextToken());
int q =Integer.parseInt(st.nextToken());

ArrayList<Integer>[]adj= new ArrayList[n+1];
for(int i=1;i<=n;i++){
    adj[i]=new ArrayList<>();

}
for(int i=0;i<m;i++){
    st= new StringTokenizer(bf.readLine());
    int u= Integer.parseInt(st.nextToken());
    int v=Integer.parseInt(st.nextToken());
adj[u].add(v);
adj[v].add(u);
}
int[]d= new int[n+1];
String[]col=new String[n+1];
for(int i=1;i<=n;i++){
    col[i]="w";
    d[i]=-1;

}
Queue<Integer>qu= new LinkedList<>();
st=new StringTokenizer(bf.readLine());
for(int i=0;i<s;i++){
    int src= Integer.parseInt(st.nextToken());
    qu.add(src);
    d[src]=0;
    col[src]="g";

}
while(!qu.isEmpty()){
int u= qu.poll();
for(int i=0;i<adj[u].size();i++){
    int v= adj[u].get(i);
    if(col[v].equals("w")){
        col[v]="g";
        d[v]=d[u]+1;
        qu.add(v);

    }

}
col[u]="b";
}
st=new StringTokenizer(bf.readLine());

for(int i=0;i<q;i++){
    int dest=Integer.parseInt(st.nextToken());

    if(col[dest].equals("w")){
        pw.print(-1 + " ");
    }
    else{
        pw.print(d[dest] + " ");
    }
}
pw.flush();
}
}