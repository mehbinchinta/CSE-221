 import java.io.*;
 import java.util.*;
public class task2{
    static long count=0;

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
int n= Integer.parseInt(bf.readLine());
StringTokenizer st= new StringTokenizer(bf.readLine());
long[]arr= new long[n];
for(int i=0; i<n;i++){
arr[i]=Integer.parseInt(st.nextToken());

}

 mergesort(arr);
pw.println(count);

pw.flush();
}

public static long[] mergesort(long[]a){
    if(a.length<=1){
        return a;
    }
int mid= a.length/2;
long[]larr= new long[mid];
long[]rarr=new long[a.length-mid];
for(int i=0; i<mid;i++){
larr[i]=a[i];
}
for(int j=mid; j<a.length;j++){
rarr[j-mid]=a[j];
}
long[]sortedl=mergesort(larr);
long[]sortedr=mergesort(rarr);
pairfind(sortedl,sortedr);
long[]merged=merge(sortedl,sortedr);
return merged;
}




public static long[]merge(long[]l,long [] r){
    long[]merged=new long[l.length+r.length];
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

    public static void pairfind(long[]left, long[] right){
        long[]sqr= new long[right.length];
for(int i=0; i<right.length;i++){
sqr[i]=right[i]*right[i];
}
Arrays.sort(sqr);
int indctr=0;
for(int i=0;i<left.length;i++){
    while(indctr<sqr.length && sqr[indctr]<left[i]){
indctr++;
    }
    count+=indctr;

}
  }







}




    



