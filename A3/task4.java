import java.io.*;
 import java.util.*;
public class task4{
   static final long mod= 1000000007;

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
int n= Integer.parseInt(bf.readLine());
for(int i=0;i<n;i++){
StringTokenizer st= new StringTokenizer(bf.readLine());
long[][]mat= new long[2][2];
mat[0][0]=Long.parseLong(st.nextToken());
mat[0][1]=Long.parseLong(st.nextToken());
mat[1][0]=Long.parseLong(st.nextToken());
mat[1][1]=Long.parseLong(st.nextToken());

long expo= Long.parseLong(bf.readLine());
long [][] solution= matpow(mat,expo);
pw.println(solution[0][0]+" "+solution[0][1]);
pw.println(solution[1][0]+" "+solution[1][1]);
}
pw.flush();
}

public static long[][] matpow(long[][]mat, long expo){
long[][] rslt= new long[2][2];
  rslt[0][0]=1;
rslt[0][1]=0;
rslt[1][0]=0;
rslt[1][1] =1;
long  [][]  base= mat;
while(expo>0){
    if(expo%2==1){
        rslt= domulti(rslt, base);
    }
    base= domulti(base,base);
        expo= expo/2;

}
    return rslt;

}

public static long[][] domulti(long[][] frst, long[][]scnd){
long[][] prod= new long[2][2];
prod[0][0]=((frst[0][0]*scnd[0][0])% mod+ (frst[0][1]*scnd[1][0])% mod)%mod;
prod[0][1]=((frst[0][0]*scnd[0][1])% mod+ (frst[0][1]*scnd[1][1])% mod)%mod;
prod[1][0]=((frst[1][0]*scnd[0][0])% mod+ (frst[1][1]*scnd[1][0])% mod)%mod;
prod[1][1]=((frst[1][0]*scnd[0][1])% mod+ (frst[1][1]*scnd[1][1])% mod)%mod;
return prod;
}




}