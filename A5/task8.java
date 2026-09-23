import java.io.*;
 import java.util.*;
public class task8{
   
static int max=0;
public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
StringTokenizer st= new StringTokenizer(bf.readLine());
int r= Integer.parseInt(st.nextToken());
int h= Integer.parseInt(st.nextToken());
char[][]mat= new char[r][h];
for(int i=0;i<r;i++){
String line=bf.readLine();
for(int j=0;j<h;j++){
mat[i][j]=line.charAt(j);
}
}
boolean[][] gray= new boolean[r][h];//gray==visited

for(int i=0;i<r;i++){
for(int j=0;j<h;j++){
if(mat[i][j]!='#' && !gray[i][j]){
int dmnds= bfs(mat,gray,i,j,r,h);
max=Math.max(dmnds,max);
}
}
}
pw.print(max);
pw.flush();
}

public static int bfs(char[][]mat, boolean[][]gray, int row, int col , int r, int h){
Queue<int[]>q=new LinkedList<>();
q.add(new int[]{row,col});
gray[row][col]=true;
int dmnd= 0;
while(!q.isEmpty()){
int[]cur= q.poll();
int rowcur= cur[0];
int colcur=cur[1];
if(mat[rowcur][colcur]=='D'){
    dmnd++;

}

if(rowcur-1>=0 && mat[rowcur-1][colcur]!='#' && !gray[rowcur-1][colcur]){
gray[rowcur-1][colcur]=true;
q.add(new int[]{rowcur-1,colcur});
}
if(rowcur+1<r && mat[rowcur+1][colcur]!='#' && !gray[rowcur+1][colcur]){
gray[rowcur+1][colcur]=true;
q.add(new int[]{rowcur+1,colcur});
}
if(colcur-1>=0 && mat[rowcur][colcur-1]!='#' && !gray[rowcur][colcur-1]){
gray[rowcur][colcur-1]=true;
q.add(new int[]{rowcur,colcur-1});
}
if(colcur+1<h && mat[rowcur][colcur+1]!='#' && !gray[rowcur][colcur+1]){
gray[rowcur][colcur+1]=true;
q.add(new int[]{rowcur,colcur+1});
}
}
return dmnd;

}
}



