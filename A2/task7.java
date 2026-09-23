    import java.io.*;
    import java.util.*;
    public class task7{

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st= new StringTokenizer(bf.readLine());
    int n= Integer.parseInt(st.nextToken());
    int k=  Integer.parseInt(st.nextToken());
    StringTokenizer st1= new StringTokenizer(bf.readLine());
    int[]arr= new int[n];
    long smol=0;
    long big=0;
    for(int i=0; i<n;i++){
        arr[i]= Integer.parseInt(st1.nextToken());
    smol = Math.max(smol, arr[i]);
                big += arr[i];
    }

    long valid = big;

while (smol <= big) {
long mid = smol + (big - smol) / 2;

if (splitpos(arr, k, mid)) {
 valid = mid;
 big = mid - 1;
 }
  else {
    smol = mid + 1;
    }
}
            
pw.println(valid);
pw.flush();
}

 public static boolean splitpos(int[]a, int k, long m) {
  int parts = 1;
long currsum = 0;

for (int i = 0; i < a.length; i++) {
int x = a[i];

if (currsum+x<= m) {
     currsum+= x;
    } 
    else {
         parts++;
     currsum = x;
            }
        }

        return parts <= k;
    }
    }