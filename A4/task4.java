    import java.io.*;
                import java.util.*;
            public class task4 {
                
            public static void main(String[] args) throws IOException {
                    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter pw = new PrintWriter(System.out);
            StringTokenizer stp= new StringTokenizer(bf.readLine());
                int n= Integer.parseInt(stp.nextToken());
                int m= Integer.parseInt(stp.nextToken());
                int[]u= new int[m];
                int[] deg= new int[n+1];
                StringTokenizer stu= new StringTokenizer(bf.readLine());
    for(int i=0; i<m;i++){
        u[i]= Integer.parseInt(stu.nextToken());
    }
    StringTokenizer stv= new StringTokenizer(bf.readLine());
    for(int i=0; i<m;i++){
        int v= Integer.parseInt(stv.nextToken());
    deg[u[i]]++;
    deg[v]++;

    }
    int oddcnt=0;
    for(int i=1;i<=n;i++){
        if(deg[i]%2!=0){
            oddcnt++;

        }
    }
    if(oddcnt==0||oddcnt==2){
        pw.println("YES");

    }
    else{
        pw.println("NO");
    }
    pw.flush();
            

    }
            }


