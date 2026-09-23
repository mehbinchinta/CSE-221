import java.io.*;
 import java.util.*;
public class task6{
    static int[]arr;
static PrintWriter pw;
public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
pw = new PrintWriter(System.out);
int n= Integer.parseInt(bf.readLine());
StringTokenizer st= new StringTokenizer(bf.readLine());
arr= new int[n];
for(int i=0; i<n;i++){
arr[i]=Integer.parseInt(st.nextToken());

}
findorder(0,n-1);
pw.flush();
}

public static void findorder(int l, int r){
if(l>r){
    return;

}
int mid= (l+r)/2;
pw.print(arr[mid]+" ");
findorder(l,mid-1);
findorder(mid+1, r);


}
}