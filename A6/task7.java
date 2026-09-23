import java.io.*;
 import java.util.*;
public class task7{
   

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
String a= st.nextToken();
String b= st.nextToken();
String[]wrds=new String[n];
for(int i=0;i<n;i++){
    wrds[i]=bf.readLine();

}
ArrayList<Integer>[] adj = new ArrayList[26];
for(int i=0;i<26;i++){
    adj[i]=new ArrayList<>();
}
for(int i=0;i<n;i++){
char frst= wrds[i].charAt(0);
int idx= frst-'A';
adj[idx].add(i);
}
int src=0;
int trgt=0;
for(int i=0; i<n;i++){
    if(wrds[i].equals(a)){
        src=i;

    }
    if(wrds[i].equals(b)){
        trgt=i;

    }

}
String[]col=new String[n];
for(int i=0;i<n;i++){
    col[i]="w";

}
Queue<Integer> q = new LinkedList<>();
q.add(src);
col[src]="g";
boolean[]used = new boolean[26];
while(!q.isEmpty()){
    int u = q.poll();
    String uwrd = wrds[u];

    char last = uwrd.charAt(uwrd.length() - 1);
    int idx= last-'A';
  if(!used[idx]){
for(int j=0;j<adj[idx].size();j++){

    int v=adj[idx].get(j);

    if(col[v].equals("w")){
        col[v] = "g";
        q.add(v);
    }

}
used[idx]=true;
  }
}

if(col[trgt].equals("g")){
    pw.println("YES");
}
else{
    pw.println("NO");
}
pw.flush();
}
}
