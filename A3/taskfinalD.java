import java.io.*;
public class taskfinalD{
static final long mod = 1000000007;
public static void main(String[] args) throws IOException {
 BufferedInputStream input = new BufferedInputStream(System.in);
 StringBuilder output = new StringBuilder();
int test = (int)nextLong(input);
for (int t= 0; t<test; t++) {
long[] mat = new long[4];

mat[0] = nextLong(input); 
mat[1]=nextLong(input); 
mat[2] = nextLong(input); 
mat[3] = nextLong(input); 

long expo =nextLong(input);
 long[] ans = matpow(mat, expo);
output.append(ans[0]).append(' ')
                  .append(ans[1]).append('\n');
output.append(ans[2]).append(' ')
                  .append(ans[3]).append('\n');
    }
 System.out.print(output);
}

public static long[] matpow(long[] mat, long expo) {

long[] rslt ={1,0,0,1};
long[]base = { mat[0],mat[1],mat[2],mat[3]};
while (expo>0) {

if (expo%2==1) {
    rslt = domulti(rslt, base);
}

base = domulti(base, base);
expo = expo / 2;
}

return rslt;
    }

public static long[] domulti(long[] frst, long[] scnd) {

long[] prod= new long[4];

prod[0] =(frst[0] *scnd[0]+ frst[1] * scnd[2]) % mod;
prod[1] =(frst[0] * scnd[1]+frst[1] *scnd[3]) % mod;
prod[2] = (frst[2] * scnd[0] + frst[3] * scnd[2]) % mod;
prod[3] =(frst[2] * scnd[1]+ frst[3] * scnd[3]) % mod;

 return prod;
    }
public static long nextLong(BufferedInputStream input) throws IOException {
int cha = input.read();
while (cha<=32 && cha!= -1) {
     cha = input.read();
 }
 long num= 0;

 while (cha> 32 && cha != -1) {
  num = num * 10 + cha - '0';
   cha = input.read();
}

     return num;
    }
}