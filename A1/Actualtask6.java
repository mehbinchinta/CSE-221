import java.io.*;
import java.util.*;
public class Actualtask6{
  public static void main (String[]args) throws IOException{
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw= new PrintWriter(System.out);
    int n=Integer.parseInt(bf.readLine());
    StringTokenizer st= new StringTokenizer(bf.readLine());
   int[]arr=new int[n];
   int[] movest=new int[n*n];
   int[] movend=new int[n*n];
    int count=0;
    for(int i=0;i<n;i++){
      arr[i]=Integer.parseInt(st.nextToken());
    }
    
    if(isarranged(arr)==true){
      pw.println("YES");
      pw.println("0");
    }
    else{
      for(int i=0;i+2<n;i++){
        if(arr[i]>arr[i+2]){
          int temp=arr[i];
          arr[i]=arr[i+2];
          arr[i+2]=temp;
          movest[count]=i+1;
          movend[count]=i+3;
          count++;
          i=-1;
       
      }
      }
      if(isarranged(arr)==true){
        pw.println("YES");
        pw.println(count);
        for(int j=0;j<count;j++){
          pw.println(movest[j]+" "+movend[j]);
        }
      }
      else{
        pw.println("NO");
      }
    }
    pw.flush();
  }
  public static boolean isarranged(int[] a){
    for(int i=0;i<a.length-1;i++){
      if(a[i]>a[i+1]){
        return false;
      }
    }
      
        return true;
      
    
  }
}
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    