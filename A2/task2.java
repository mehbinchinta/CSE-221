 import java.io.*;
 import java.util.*;
public class task2{

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int m= Integer.parseInt(st.nextToken());
int k=  Integer.parseInt(st.nextToken());
StringTokenizer st1= new StringTokenizer(bf.readLine());
StringTokenizer st2= new StringTokenizer(bf.readLine());
int[]arr1= new int[n];
int[]arr2=new int[m];
int l=0;
int r= m-1;
for(int i=0; i<n;i++){
    arr1[i]= Integer.parseInt(st1.nextToken());

}
for(int i=0; i<m;i++){
    arr2[i]= Integer.parseInt(st2.nextToken());

}

long best= Math.abs((long)arr1[l] + arr2[r] - k);
int corri=l;
int corrj=r;
while(l < n && r >= 0){
    int sum= arr1[l]+arr2[r];
long diff= Math.abs((long)arr1[l] + arr2[r] - k);
if(diff<best){
    best= diff;
    corri=l;
    corrj=r;

}
if(sum==k){
    pw.print((l+1)+" "+(r+1));
pw.flush();
return;
}
else if(sum<k){
    l++;

}
else{
    
r--;

}

}
pw.print((corri+1)+" "+(corrj+1));
pw.flush();
}
}





   
