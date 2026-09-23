import java.io.*;
import java.util.*;
public class Task5{
  public static void main(String[]args) throws IOException{
    BufferedReader bf= new BufferedReader( new InputStreamReader(System.in));
    PrintWriter pw= new PrintWriter(System.out);
  
    int n= Integer.parseInt(bf.readLine());
    StringTokenizer st= new StringTokenizer(bf.readLine());
    int[]arr= new int[n];
    for(int i=0;i<n;i++){
      int e= Integer.parseInt(st.nextToken());
      arr[i]=e;
    }
    boolean swapdone= true;
    while(swapdone){
     swapdone= false;
     for(int i=0;i<n-1;i++){
       if(arr[i]>(arr[i+1])){
         if((arr[i]%2==0 && (arr[i+1])%2==0) || (arr[i]%2==1 && (arr[i+1])%2==1)){
           int temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
           swapdone= true;
         }
       }
     }
    }
    for(int i=0; i<n;i++){
      pw.print(arr[i]+ " ");
    }
  pw.flush();
  }
}

       
           
