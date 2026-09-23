import java.io.*;
import java.util.*;
public class Tasktrains{
  public static void main(String[]args) throws IOException{
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw= new PrintWriter(System.out);
    int n= Integer.parseInt(bf.readLine());
    String[]arrt= new String[n];
    String[]arrdes= new String[n];
    String[]arrtm= new String[n];
    for(int i=0;i<n;i++){
      StringTokenizer st= new StringTokenizer(bf.readLine());
      String train=st.nextToken();
      arrt[i]=train;
      st.nextToken();
      st.nextToken();
      st.nextToken();
      String dest= st.nextToken();
      arrdes[i]=dest;
      st.nextToken();
      String time=st.nextToken();
      arrtm[i]=time;
    }
    
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-1-i;j++){
        
        if(arrt[j].compareTo(arrt[j+1])>0){
          String temp=arrt[j];
          arrt[j]=arrt[j+1];
          arrt[j+1]=temp;
          String temp1=arrdes[j];
          arrdes[j]=arrdes[j+1];
          arrdes[j+1]=temp1;
          String temp2=arrtm[j];
          arrtm[j]=arrtm[j+1];
          arrtm[j+1]=temp2;
          
        }
        else if(arrt[j].compareTo(arrt[j+1])==0){
          if(arrtm[j].compareTo(arrtm[j+1])<0){
            String temp=arrt[j];
            arrt[j]=arrt[j+1];
            arrt[j+1]=temp;
            String temp1=arrdes[j];
            arrdes[j]=arrdes[j+1];
            arrdes[j+1]=temp1;
            String temp2=arrtm[j];
            arrtm[j]=arrtm[j+1];
            arrtm[j+1]=temp2;
          }
        }
      }
    }
    for(int m=0;m<n;m++){
      pw.println(arrt[m] + " will departure for " + arrdes[m] + " at " + arrtm[m]);
    }
    
    pw.close();
  }
}

    
    
    
    
    
    