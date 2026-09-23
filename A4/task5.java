    import java.io.*;
    import java.util.*;

    public class task5 {

    public static void main(String[] args) throws IOException {
    BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));

    PrintWriter pw = new PrintWriter(System.out);

    StringTokenizer st = new StringTokenizer(bf.readLine());

    int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
            int[] indeg = new int[n + 1];
            int[] outdeg = new int[n + 1];
           // int[] u = new int[m];
    if (m>0) {
    st = new StringTokenizer(bf.readLine());
    for (int i = 0; i < m; i++) {
      int  u = Integer.parseInt(st.nextToken());
    outdeg[u]++;
               }           

    st = new StringTokenizer(bf.readLine());
    for (int i = 0; i < m; i++) {
        int v = Integer.parseInt(st.nextToken());
    indeg[v]++;
                }
            }

        for (int i = 1; i <= n; i++) {

    int diff = indeg[i] - outdeg[i];

        pw.print(diff);

    if (i < n) {
            pw.print(" ");
                }
            }

           // pw.println();
            pw.flush();
        }
    }