import java.io.*;
import java.util.*;
public class task5{

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int k=  Integer.parseInt(st.nextToken());
StringTokenizer st1= new StringTokenizer(bf.readLine());
int[]arr= new int[n];
for(int i=0; i<n;i++){
    arr[i]= Integer.parseInt(st1.nextToken());
}
int[] fqnc=new int[n+1];
int l=0;
int perf=0;
int dist=0;
for(int right=0; right<n;right++){
    if(fqnc[arr[right]]==0){
dist++;

    }
    fqnc[arr[right]]++;
while(dist>k){
    fqnc[arr[l]]--;
if(fqnc[arr[l]]==0){
    dist--;

}
l++;

}
perf=Math.max(perf, (right-l+1));
}
pw.print(perf);
pw.flush();
}
}
