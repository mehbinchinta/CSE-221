import java.io.*;
 import java.util.*;
public class taskd{
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

public static long[][] matpow(long[][] mat,long expo) {

    long[][]rslt = new long[2][2];

    rslt[0][0] = 1;
    rslt[0][1] = 0;
    rslt[1][0] = 0;
    rslt[1][1] = 1;

    long[][] base = new long[2][2];

    base[0][0] = mat[0][0];
    base[0][1] = mat[0][1];
    base[1][0] = mat[1][0];
    base[1][1] = mat[1][1];

    long[][] temp = new long[2][2];

    while (expo>0) {

        if (expo%2 == 1) {

            domulti(rslt,base,temp);

            rslt[0][0] = temp[0][0];
            rslt[0][1] = temp[0][1];
            rslt[1][0] = temp[1][0];
            rslt[1][1] = temp[1][1];
        }

        domulti(base, base, temp);

        base[0][0] = temp[0][0];
        base[0][1] = temp[0][1];
        base[1][0] = temp[1][0];
        base[1][1] = temp[1][1];

        expo = expo / 2;
    }

    return rslt;
}

public static void domulti(long[][] frst, long[][] scnd, long[][] prod) {

    long p00 =
            ((frst[0][0] * scnd[0][0]) % mod
            + (frst[0][1] * scnd[1][0]) % mod) % mod;

    long p01 =
            ((frst[0][0] * scnd[0][1]) % mod
            + (frst[0][1] * scnd[1][1]) % mod) % mod;

    long p10 =
            ((frst[1][0] * scnd[0][0]) % mod
            + (frst[1][1] * scnd[1][0]) % mod) % mod;

    long p11 =
            ((frst[1][0] * scnd[0][1]) % mod
            + (frst[1][1] * scnd[1][1]) % mod) % mod;

    prod[0][0] = p00;
    prod[0][1] = p01;
    prod[1][0] = p10;
    prod[1][1] = p11;
}





}
