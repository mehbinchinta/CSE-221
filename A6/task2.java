import java.io.*;
 import java.util.*;
public class task2{
   

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
int redcount=0;
int bluecount=0;
String[]col=new String[n+1];
int ans =0;
for(int i=1;i<=n;i++){
if(col[i]==null){
Queue<Integer>q=new LinkedList<>();
col[i]="red";
redcount=1;
bluecount=0;
q.add(i);
while(!q.isEmpty()){
int u=q.poll();
for(int j=0;j<adj[u].size();j++){
    int v= adj[u].get(j);
    if(col[v]==null){
        if(col[u].equals("red")){
            col[v]="blue";
            bluecount++;

        }
        else{
            col[v]="red";
            redcount++;
        
        }
        q.add(v);

    }

}

}
ans= ans+ Math.max(redcount, bluecount);

}



}
pw.print(ans);
pw.flush();
}

}

