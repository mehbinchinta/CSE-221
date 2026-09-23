import java.io.*;
 import java.util.*;
public class task6{
   

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st = new StringTokenizer(bf.readLine());

int start = Integer.parseInt(st.nextToken());
int target = Integer.parseInt(st.nextToken());

int n = Integer.parseInt(bf.readLine());

boolean[] forbidden = new boolean[10000];

for (int i = 0; i < n; i++) {
    int x = Integer.parseInt(bf.readLine());
    forbidden[x] = true;
}



int[] d = new int[10000];

Arrays.fill(d, -1);


Queue<Integer> q = new LinkedList<>();

q.add(start);
d[start] = 0;



int[] place = {1, 10, 100, 1000};


while (!q.isEmpty()) {

    int cur = q.poll();

    if (cur == target) {
        break;
    }


    for (int i = 0; i < 4; i++) {

        int p = place[i];

       
        int digit = (cur / p) % 10;


        
        int next;

        if (digit == 9) {
            next = cur - 9 * p;
        } 
        else {
            next = cur + p;
        }

        if (!forbidden[next] && d[next] == -1) {
            d[next] = d[cur] + 1;
            q.add(next);
        }


        

        if (digit == 0) {
            next = cur + 9 * p;
        } 
        else {
            next = cur - p;
        }

        if (!forbidden[next] && d[next] == -1) {
            d[next] = d[cur] + 1;
            q.add(next);
        }
    }
}


pw.println(d[target]);
pw.flush();
}
}
