    import java.io.*;
        import java.util.*;
    public class task2 {
        
    public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer stp= new StringTokenizer(bf.readLine());
        int n= Integer.parseInt(stp.nextToken());
        int m= Integer.parseInt(stp.nextToken());
        StringTokenizer stu= new StringTokenizer(bf.readLine());
        StringTokenizer stv= new StringTokenizer(bf.readLine());
        StringTokenizer stw= new StringTokenizer(bf.readLine());
        int[]u= new int[m];
        int[]v= new int[m];
        int[]w= new int[m];
        for(int i=0;i<m;i++){
            u[i]= Integer.parseInt(stu.nextToken());
            v[i]= Integer.parseInt(stv.nextToken());
            w[i]= Integer.parseInt(stw.nextToken());
        }
    ArrayList<int[]>[] adj = new ArrayList[n + 1];
        for(int i=1;i<=n;i++){
            adj[i] = new ArrayList<>();
        }
        for(int i=0;i<m;i++){
        adj[u[i]].add(new int[]{v[i], w[i]});
        }
        for(int i=1;i<=n;i++){
            pw.print(i+":");
            for(int j=0;j<adj[i].size();j++){
                int[] edge = adj[i].get(j);
                pw.print("("+edge[0]+","+edge[1]+")");
            }
            pw.println();

        }
        pw.flush();
    }
    }
