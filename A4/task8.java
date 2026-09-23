    import java.io.*;
    import java.util.*;

    public class task8 {
        public static void main(String[] args) throws IOException {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int n = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());
    int[][] ngbr = new int[n + 1][n];
    int[] deg = new int[n + 1];
    for (int x =1; x <= n;x++) {
    for (int y = 1; y <= n; y++) {
    if (x != y && gcd(x, y) == 1) {
    ngbr[x][deg[x]] = y;
            deg[x]++;
                    }
                }
            }
            for (int i = 0; i <q;i++) {
    st = new StringTokenizer(bf.readLine());
    int x = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    if (k >deg[x]) {
            pw.println(-1);
            } else {
                
        pw.println(ngbr[x][k - 1]);
                }
            }

            pw.flush();
        }
    public static int gcd(int a, int b) {

            while (b!= 0) {
                int rmndr = a % b;
                a = b;
                b = rmndr;
            }

            return a;
        }
    }