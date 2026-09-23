import java.io.*;
import java.util.*;

public class task8 {
 static int[]in;
  static int[] post;
static PrintWriter pw;
static boolean first=true;

 public static void main(String[] args) throws IOException{
BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
pw = new PrintWriter(System.out);
int n=Integer.parseInt(bf.readLine());
in=new int[n];
post =new int[n];
 StringTokenizer st =new StringTokenizer(bf.readLine());
        for (int i=0;i<n;i++) {
            in[i] = Integer.parseInt(st.nextToken());
        }

        st=new StringTokenizer(bf.readLine());

        for (int i=0;i<n;i++) {
            post[i] = Integer.parseInt(st.nextToken());
        }

        goforpre(0, n-1, 0, n-1);

        pw.println();
        pw.flush();
    }
 public static void goforpre(int inl, int inr, int postl, int  postr){

if (inl>inr||postl>postr) {
return;
}

int root=post[postr];

if (!first) {
pw.print(" ");
}

pw.print(root);
 first = false;
int rootpos = -1;
for (int i=inl; i<=inr; i++) {
if (in[i] == root) {
    rootpos = i;
        break;
 }
}
 int lftsze = rootpos - inl;
 goforpre(inl, rootpos-1, postl, postl+lftsze-1);
 goforpre(rootpos+1,inr,postl+lftsze,postr-1);
}
}