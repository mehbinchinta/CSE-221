import java.io.*;
 import java.util.*;
public class task3{
    static long mod=107;

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
long a= Long.parseLong(st.nextToken());
long b= Long.parseLong(st.nextToken());
long solution = domod(a,b);
pw.println(solution);
pw.flush();
}

public static long domod(long a,long b){
if(b==0){
return 1;
}

long hlf= domod(a,b/2);
long rslt= (hlf*hlf)% mod;
if(b%2==1){
    rslt= (rslt* (a%mod))%mod;

}
return rslt;
}
}



