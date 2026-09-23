
    import java.io.*;
    import java.util.*;
    public class task8{
    

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    //StringTokenizer st= new StringTokenizer(bf.readLine());
    int n= Integer.parseInt(bf.readLine());

    String[]wrds=new String[n];
     boolean[] used = new boolean[26];
    for(int i=0;i<n;i++){
        wrds[i]=bf.readLine();
        for (int j = 0; j < wrds[i].length(); j++) {
                int x = wrds[i].charAt(j) - 'a';
                used[x] = true;
            }

    }
    ArrayList<Integer>[] adj = new ArrayList[26];
    int[]indeg=new int[26];

    for (int i = 0; i < 26; i++) {
        adj[i]=new ArrayList<>();
    }
    for (int i=0; i<n - 1;i++) {
        String w1 = wrds[i];
        String w2 = wrds[i+1];

        int len =Math.min(w1.length(), w2.length());
        boolean found=false;

        for (int j = 0; j<len; j++) {
            if (w1.charAt(j) != w2.charAt(j)) {
                found= true;
                char a =w1.charAt(j);
                char b =w2.charAt(j);
    int u = a - 'a';
        int v = b - 'a';
    if (!adj[u].contains(v)) {
        adj[u].add(v);
        indeg[v]++;
    }
    break;
    
            }
        }
        if (!found&&w1.length()>w2.length()) {
            pw.println(-1);
            pw.flush();
            return;
    }
    }
    PriorityQueue<Integer> q = new PriorityQueue<>();

    for (int i =0; i<26; i++) {
        if (used[i]&&indeg[i]==0) {
            q.add(i);
        }
    }
    String ans="";

    while (!q.isEmpty()) {

        int u=q.poll();

        ans = ans+(char)(u + 'a');

        for (int i=0; i<adj[u].size(); i++) {

            int v=adj[u].get(i);

            indeg[v]--;

            if (indeg[v] == 0) {
                q.add(v);
            }
        }
    }
    int usedcount = 0;

        for (int i = 0; i < 26; i++) {
            if (used[i]) {
                usedcount++;
            }
        }

        if (ans.length() != usedcount) {
            pw.println(-1);
        } else {
            pw.println(ans);
        }

        pw.flush();
    }
}