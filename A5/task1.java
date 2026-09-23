import java.io.*;
 import java.util.*;
public class task1{
   

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int m =Integer.parseInt(st.nextToken());
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
String[]color= new String[n+1];
int[]p=new int[n+1];
int [] d= new int[n+1];
for(int u=1; u<=n; u++){
    color[u]="white";
    p[u]=-1;
    d[u]=Integer.MAX_VALUE;


}
int s=1;
color[s]="gray";
d[s]=0;
Queue<Integer> q= new LinkedList<>();
q.add(s);
while(!q.isEmpty()){
    int u= q.poll();
    pw.print(u+ " ");
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
pw.flush();
}
}