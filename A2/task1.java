 import java.io.*;
 import java.util.*;
public class task1{

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int sum=  Integer.parseInt(st.nextToken());
StringTokenizer st1= new StringTokenizer(bf.readLine());
int[]arr= new int[n];
int l=0;
int r= n-1;
for(int i=0; i<n;i++){
    arr[i]= Integer.parseInt(st1.nextToken());

}
while(l<r){
   if(arr[l]+arr[r]==sum){
    pw.print((l+1)+" "+(r+1));
    pw.flush();
    return;
   }
   else if (arr[l]+arr[r]<sum) {
    l++;
   }
   else{
    r--;
   }

    }
    pw.print(-1);
    pw.flush();
}
}