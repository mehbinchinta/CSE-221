import java.io.*;
import java.util.*;
public class task6{
     public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int n= Integer.parseInt(st.nextToken());
int q=  Integer.parseInt(st.nextToken());
StringTokenizer st1= new StringTokenizer(bf.readLine());
int[]arr= new int[n];
for(int i=0; i<n;i++){
    arr[i]= Integer.parseInt(st1.nextToken());
}
for(int j=0;j<q;j++){
    StringTokenizer que= new StringTokenizer(bf.readLine());
int x= Integer.parseInt(que.nextToken());
int y= Integer.parseInt(que.nextToken());
int lft=findxfam(arr,x);
int rt=findyfam(arr,y);
pw.println(rt-lft);
}
pw.flush();

    }

    public static int findxfam(int[]a,int x){
    int l=0;
    int r=a.length-1;
    int valid= a.length;
    while(l<=r){
        int mid=(l+r)/2;
        if(a[mid]>=x){
            valid=mid;
            r=mid-1;

        }
        else{
            l=mid+1;
        }

    }
return valid;
}
public static int findyfam(int[]a,int y){
    int l=0;
    int r=a.length-1;
    int valid= a.length;
    while(l<=r){
        int mid=(l+r)/2;
        if(a[mid]>y){
            valid=mid;
            r=mid-1;

        }
        else{
            l=mid+1;
        }

    }
return valid;
}
}





