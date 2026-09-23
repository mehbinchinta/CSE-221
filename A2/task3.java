 import java.io.*;
 import java.util.*;
public class task3{
public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
int n= Integer.parseInt(bf.readLine());
StringTokenizer st1= new StringTokenizer(bf.readLine());
int m= Integer.parseInt(bf.readLine());
StringTokenizer st2= new StringTokenizer(bf.readLine());
int[] arr1= new int[n];
int[] arr2= new int[m];
int[] fin= new int[n+m];
for(int i=0;i<n;i++){
    arr1[i]= Integer.parseInt(st1.nextToken());
}
for(int i=0;i<m;i++){
    arr2[i]= Integer.parseInt(st2.nextToken());
}
int a=0;
int b=0;
int idx=0;
while(a<n && b<m){
    if(arr1[a]<=arr2[b]){
        fin[idx]=arr1[a];
        idx++;
      a++;  
    }
    else {
      fin[idx]=arr2[b];
        idx++;
      b++;  

    }

}
if(a==n){
    while(b<m){
        fin[idx]=arr2[b];
        idx++;
        b++;

    }

}
else if(b==m){
    while(a<n){
        fin[idx]=arr1[a];
        idx++;
        a++;

    }

}
for(int i=0;i<(n+m);i++){
    pw.print(fin[i]+" ");

}
pw.flush();

}
}

