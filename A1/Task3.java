import java.util.Scanner;
public class Task3{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int T= sc.nextInt();
    for(int i=0;i<T;i++){
      long N= sc.nextInt();
      long sum= N*(N+1)/2;
      System.out.println(sum);
    }
  }
}
  