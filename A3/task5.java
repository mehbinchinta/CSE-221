import java.io.*;
 import java.util.*;
public class task5{
    //static long mod=107;

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
int test= Integer.parseInt(bf.readLine());
for(int i=0;i<test;i++){
StringTokenizer st= new StringTokenizer(bf.readLine());
long a= Long.parseLong(st.nextToken());
long n= Long.parseLong(st.nextToken());
long m= Long.parseLong(st.nextToken());
long[] solution= work(a,n,m);
pw.println(solution[1]);
}
pw.flush();
}

public static long[] work(long a, long n, long m){
if(n==0){
long[]ans= new long[2];
ans[0]=1%m;
ans[1]=0;
return ans;
}
long hlf= n/2;
long[] hlfsol=work(a,hlf,m);
long hlfpow= hlfsol[0];
long  hlfsum= hlfsol[1];
long evnpow= (hlfpow*hlfpow)%m;
long evnsum=(hlfsum*((1+hlfpow)%m))%m;
if(n%2==0){
long[] ans=new long[2];
ans[0]=evnpow;
ans[1]=evnsum;
return ans;
}
else{
    long oddpow=(evnpow*(a%m))%m;
    long oddsum= (evnsum+oddpow)%m;
    long[]ans=new long[2];
    ans[0]=oddpow;
    ans[1]=oddsum;
    return ans;
}
}



}
