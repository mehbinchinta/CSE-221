import java.io.*;
 import java.util.*;
public class task7{
  static String[]color;
  //static int grpcount=0;
  //static int []grp;

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int m =Integer.parseInt(st.nextToken());
ArrayList<Integer>[]adj=new ArrayList[n+1];
for(int i=1;i<=n;i++){
    adj[i]= new ArrayList<>();

}
for(int i=0;i<m;i++){
    st=new StringTokenizer(bf.readLine());
    int u= Integer.parseInt(st.nextToken());
    int v=Integer.parseInt(st.nextToken());
adj[u].add(v);
//adj[v].add(u);
}
color= new String[n+1];
for(int node=1;node<=n;node++){
    color[node]="white";

}
for(int u=1;u<=n;u++){
    if(color[u].equals("white")){
       if(hascycle(adj,u)==true){
        pw.print("YES");
        pw.flush();
return;
       }
    }
}
    pw.print("NO");

pw.flush();
}

public static boolean hascycle(ArrayList<Integer>[]adj,int u){
color[u]="gray";
for(int i=0;i<adj[u].size();i++){
    int v= adj[u].get(i);
    if(color[v].equals("white")){
if(hascycle(adj,v)==true){
    return true;

}
    }
    else if(color[v].equals("gray")){
return true;
    }

}
color[u]="black";
return false;
}
}