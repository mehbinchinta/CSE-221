    import java.io.*;
    import java.util.*;
    public class task1{
    

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer stp= new StringTokenizer(bf.readLine());
    int n= Integer.parseInt(stp.nextToken());
    int m= Integer.parseInt(stp.nextToken());
    int[][]mat= new int[n][n];
    for(int i=0;i<m;i++){
        StringTokenizer st= new StringTokenizer(bf.readLine());
    int u= Integer.parseInt(st.nextToken());
    int v= Integer.parseInt(st.nextToken());
    int w= Integer.parseInt(st.nextToken());
    mat[u-1][v-1]=w;
    }
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    pw.print(mat[i][j]);
    if(j<n-1){
        pw.print(" ");

    }
    }
    pw.println();  
    }
    pw.flush();
    }
    }
