 import java.io.*;
 import java.util.*;
public class task4{

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
long k= Integer.parseInt(st.nextToken());
StringTokenizer st1= new StringTokenizer(bf.readLine());
int[]arr= new int[n];
for(int i=0; i<n;i++){
arr[i]=Integer.parseInt(st1.nextToken());

}
int l=0;
int len=0;
long sum=0;
for(int r=0;r<n;r++){
    sum+= arr[r];
    while(sum>k && l<=r){
        sum-=arr[l];
l++;
    }
len= Math.max(len, (r-l+1));

}
pw.print(len);
pw.flush();
}
}