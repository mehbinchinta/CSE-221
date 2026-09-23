import java.util.Scanner;
public class Task2{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int T= sc.nextInt();
    
    for(int i=0;i<T;i++){
      String st=sc.next();
      int N= sc.nextInt();
      String op=sc.next();
     int M= sc.nextInt();
     if(op.equals("+")){
      System.out.println(N+M);
     }
     if(op.equals("-")){
       System.out.println(N-M);
     }
     if(op.equals("*")){
      System.out.println(N*M);
     }
      if(op.equals("/")){
      System.out.println((float)N/M);
     }
      if(op.equals("%")){
      System.out.println(N%M);
     }
      if(op.equals("&")){
      System.out.println((long)N&M);
     }
      if(op.equals("|")){
      System.out.println((long)N|M);
     }
      if(op.equals("^")){
      System.out.println((long)N^M);
     }
      if(op.equals("<<")){
      System.out.println((long)N<<M);
     }
      if(op.equals(">>")){
      System.out.println((long)N>>M);
     }
    }
  }
}
      
     