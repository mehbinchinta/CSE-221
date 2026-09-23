    import java.io.*;
    import java.util.*;

    public class task6 {

        public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    int n = Integer.parseInt(bf.readLine());
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    ArrayList<int[]> crctmvs = new ArrayList<>();
    for (int dx= -1;dx<=1;dx++) {
    for (int dy=-1;dy<=1;dy++) {
        if (dx==0&&dy== 0) {
        continue;
        }

    int newx= x +dx;
    int newy =y +dy;
    if (newx>= 1&& newx <= n&&newy>= 1 &&newy<= n) {
    crctmvs.add(new int[]{newx, newy});
                    }
                }
            }
    pw.println(crctmvs.size());
    for (int i = 0; i < crctmvs.size(); i++) {
        int[]move = crctmvs.get(i);

        pw.println(move[0]+ " " +move[1]);
    }

            pw.flush();
        }
    }