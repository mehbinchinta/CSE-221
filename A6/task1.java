import java.io.*;
 import java.util.*;
public class task1{
   

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
int test= Integer.parseInt(bf.readLine());
for(int p=0;p<test;p++){
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int m =Integer.parseInt(st.nextToken());
ArrayList<Integer>[]adj= new ArrayList[n+1];
int [] indeg= new int[n+1];
for(int i=1;i<=n;i++){
    adj[i]=new ArrayList<>();

}
for(int i=0;i<m;i++){
    st= new StringTokenizer(bf.readLine());
    int u= Integer.parseInt(st.nextToken());
    int v=Integer.parseInt(st.nextToken());
adj[u].add(v);
indeg[v]++;
//adj[v].add(u);
}
Queue<Integer>q= new LinkedList<>();
for(int i=1; i<=n;i++){
if(indeg[i]==0){
    q.add(i);

}
}
ArrayList<Integer>ans= new ArrayList<>();
while(!q.isEmpty()){
int u= q.poll();
ans.add(u);
for(int i=0;i<adj[u].size();i++){
int v= adj[u].get(i);
indeg[v]--;
if(indeg[v]==0){
q.add(v);
}
}
}
if(ans.size()==n){
    for(int i=0;i<ans.size();i++){
pw.print(ans.get(i)+" ");
    }
   
}
    else{
        pw.print(-1);
    }
  pw.println();
}
//pw.println();
pw.flush();
}
}