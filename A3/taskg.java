import java.io.*;
 import java.util.*;
public class taskg{
    static int[]inordr;
    static int[] preordr;
    static int [] pos;
    static int preidx=0;

static PrintWriter pw;
public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
pw = new PrintWriter(System.out);
int n= Integer.parseInt(bf.readLine());
inordr= new int[n];
preordr= new int[n];
pos=new int[n+1];
StringTokenizer st= new StringTokenizer(bf.readLine());

for(int i=0; i<n;i++){
inordr[i]=Integer.parseInt(st.nextToken());
pos[inordr[i]]=i;

}
st= new StringTokenizer(bf.readLine());
for(int i=0; i<n;i++){
preordr[i]=Integer.parseInt(st.nextToken());

}
goforpostordr(0, n-1);
pw.println();
pw.flush();
}

public static void goforpostordr(int l, int r){
if(l>r){
    return;

}
int root= preordr[preidx];
preidx++ ;
int rootpos= pos[root];
goforpostordr(l, rootpos-1);
goforpostordr(rootpos+1,r);
pw.print(root+" ");
}
}

