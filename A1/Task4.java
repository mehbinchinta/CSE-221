import java.util.Scanner;
public class Task4{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    
    int T = sc.nextInt();
    for(int i=0;i<T;i++){
      int size= sc.nextInt();
      int[] arr= new int[size];
      for(int j=0;j<size;j++){
        int a=sc.nextInt();
        arr[j]=a;
      }
      boolean flag= true;
      
      for(int k=0;k<size-1;k++){
        if(arr[k]<=arr[k+1]){
          flag=true;
        }
        else{
          flag=false;
          break;
        }
      }
      if(flag==false){
        System.out.println("NO");
      }
      else{
        System.out.println("YES");
      }
    }
  }
}

