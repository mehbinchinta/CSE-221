import java.io.*;
import java.util.*;

public class task8{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        long[] arr = new long[n];
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        long h = 0;
        for (int i=0;i<n;i++) {
            arr[i] = Long.parseLong(st1.nextToken());
            h = Math.max(h,arr[i]);
        }

        long l = 1;
        long valid=-1;

        while (l<=h) {
            long mid = l+(h-l)/2;

            long pieces = 0;
            for (int i=0;i<n;i++) {
                pieces += arr[i]/mid;

                if (pieces>= k) {
                    break;
                }
            }

            if (pieces >= k) {
                valid = mid;
                l= mid+1;
            } else {
                h= mid-1;
            }
        }

        pw.println(valid);
        pw.flush();
    }
}