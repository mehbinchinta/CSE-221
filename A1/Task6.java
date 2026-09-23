import java.io.*;
import java.util.*;
public class Task6{
  public static void main(String[]args) throws IOException{
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw= new PrintWriter(System.out);
    
    int t= Integer.parseInt(bf.readLine());
    
    for(int i=0;i<t;i++){
      int n= Integer.parseInt(bf.readLine());
      StringTokenizer id= new StringTokenizer(bf.readLine());
      StringTokenizer mrk= new StringTokenizer(bf.readLine());
      int count=0;
      int[] arrm= new int[n];
      int [] arrid=new int[n];
      for(int j=0;j<n;j++){
        arrid[j]=Integer.parseInt(id.nextToken());
        arrm[j]=Integer.parseInt(mrk.nextToken());
      }
      
      for(int k=0;k<n-1;k++){
        int high=k;
        for(int l=k+1;l<n;l++){
          if(arrm[l]>arrm[high]){
            high=l;
          }
          else if(arrm[l]==arrm[high] && arrid[high]>arrid[l]){
            high=l;
          }
        }
        if(high!=k){
          int temp = arrm[k];
          arrm[k] = arrm[high];
          arrm[high] = temp;
          
          int temp1 = arrid[k];
          arrid[k] = arrid[high];
          arrid[high] = temp1;
          
          count++;
        }
        
      }
      
      
      pw.println("Minimum swaps: "+ count);
      for(int l=0;l<n;l++){
        pw.println("ID: "+arrid[l]+" Mark: "+arrm[l]);
      }
    }
    pw.flush();
  }
}


       
       
       
       
       
     