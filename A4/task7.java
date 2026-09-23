import java.io.*;
import java.util.*;

public class task7 {
public static void main(String[] args) throws IOException {
BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw= new PrintWriter(System.out);
 StringTokenizer st = new StringTokenizer(bf.readLine());
int n = Integer.parseInt(st.nextToken());
int m = Integer.parseInt(st.nextToken());
int k = Integer.parseInt(st.nextToken());
boolean[][]kngt = new boolean[n + 1][m + 1];
int[] dx ={-2,-2,-1,-1, 1,1,2,2};
int[] dy ={-1,1, -2,2, -2,2,-1,1};
 boolean attck = false;
for (int i =0; i <k;i++) {
 st = new StringTokenizer(bf.readLine());
int x = Integer.parseInt(st.nextToken());
int y = Integer.parseInt(st.nextToken());
for (int j = 0; j < 8; j++) {
int newx = x + dx[j];
int newy = y + dy[j];
if (newx >= 1 && newx <= n && newy >= 1 && newy <= m) {
if (kngt[newx][newy]) {
    attck = true;
                    }
                }
            }
             kngt[x][y] = true;
        }

if (attck) {
           pw.println("YES");
        } else {
            pw.println("NO");
            
        }
        pw.flush();
    }
}