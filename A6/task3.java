import java.io.*;
 import java.util.*;
public class task3{
   

public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw = new PrintWriter(System.out);
int n= Integer.parseInt(bf.readLine());
StringTokenizer st= new StringTokenizer(bf.readLine());
int x1 =Integer.parseInt(st.nextToken());
int y1 =Integer.parseInt(st.nextToken());
int x2 =Integer.parseInt(st.nextToken());
int y2 =Integer.parseInt(st.nextToken());
boolean[][]gray=new boolean[n+1][n+1];
int[][]d= new int[n+1][n+1];
Queue<int[]>q= new LinkedList<>();
q.add(new int[]{x1,y1});
gray[x1][y1]=true;
d[x1][y1]=0;
while(!q.isEmpty()){
    int[]cur=q.poll();
    int x= cur[0];
    int y=cur[1];
    if(x+2<=n && y+1<=n && !gray[x+2][y+1]){
        gray[x+2][y+1]=true;
        d[x+2][y+1]=d[x][y]+1;
        q.add(new int[]{x+2,y+1});

    }
    if(x+2<=n && y-1>=1 && !gray[x+2][y-1]){
        gray[x+2][y-1]=true;
        d[x+2][y-1]=d[x][y]+1;
        q.add(new int[]{x+2,y-1});

    }
    if(x-2>=1 && y+1<=n && !gray[x-2][y+1]){
        gray[x-2][y+1]=true;
        d[x-2][y+1]=d[x][y]+1;
        q.add(new int[]{x-2,y+1});

    }
    if(x-2>=1 && y-1>=1 && !gray[x-2][y-1]){
        gray[x-2][y-1]=true;
        d[x-2][y-1]=d[x][y]+1;
        q.add(new int[]{x-2,y-1});

    }
    if(x+1<=n && y+2<=n && !gray[x+1][y+2]){
        gray[x+1][y+2]=true;
        d[x+1][y+2]=d[x][y]+1;
        q.add(new int[]{x+1,y+2});

    }
    if(x+1<=n && y-2>=1 && !gray[x+1][y-2]){
        gray[x+1][y-2]=true;
        d[x+1][y-2]=d[x][y]+1;
        q.add(new int[]{x+1,y-2});

    }
    if(x-1>=1 && y+2<=n && !gray[x-1][y+2]){
        gray[x-1][y+2]=true;
        d[x-1][y+2]=d[x][y]+1;
        q.add(new int[]{x-1,y+2});

    }
    if(x-1>=1 && y-2>=1 && !gray[x-1][y-2]){
        gray[x-1][y-2]=true;
        d[x-1][y-2]=d[x][y]+1;
        q.add(new int[]{x-1,y-2});

    }


}
if(gray[x2][y2]){
    pw.println(d[x2][y2]);

}
else{
    pw.println(-1);
}
pw.flush();
}
}