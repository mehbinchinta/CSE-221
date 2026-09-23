import java.io.*;
 import java.util.*;
public class task1{
    static long count=0;

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
int n= Integer.parseInt(bf.readLine());
StringTokenizer st= new StringTokenizer(bf.readLine());
int[]arr= new int[n];
for(int i=0; i<n;i++){
arr[i]=Integer.parseInt(st.nextToken());

}

int[]sorted= mergesort(arr);
pw.println(count);
for(int i=0; i<n;i++){
pw.print(sorted[i]+" ");
pw.flush();
}
pw.flush();
}

public static int[] mergesort(int[]a){
    if(a.length<=1){
        return a;
    }
int mid= a.length/2;
int[]larr= new int[mid];
int[]rarr=new int[a.length-mid];
for(int i=0; i<mid;i++){
larr[i]=a[i];
}
for(int j=mid; j<a.length;j++){
rarr[j-mid]=a[j];
}
int[]sortedl=mergesort(larr);
int[]sortedr=mergesort(rarr);
int[]merged=merge(sortedl,sortedr);
return merged;



}
public static int[]merge(int[]l,int [] r){
    int[]merged=new int[l.length+r.length];
    int left1=0;
    int left2=0;
    int i=0;
    while(left1<l.length && left2<r.length){
        if(l[left1]<=r[left2]){
            merged[i]=l[left1];
            left1++;
            i++;

        }
        else{
            
            merged[i]=r[left2];
            left2++;
            i++;
count=count+(l.length-left1);
        }
        }
        while(left1<l.length){
            merged[i]=l[left1];
            left1++;
            i++;

        }
        while(left2<r.length){
            merged[i]=r[left2];
            left2++;
            i++;

        }
        return merged;

    }


}




    

