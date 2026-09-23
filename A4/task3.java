    import java.io.*;
            import java.util.*;
        public class task3 {
            
        public static void main(String[] args) throws IOException {
                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(System.out);
            //StringTokenizer stp= new StringTokenizer(bf.readLine());
            int n= Integer.parseInt(bf.readLine());
            int[][]mat= new int[n][n];
            for(int i=0; i<n;i++){
    StringTokenizer st= new StringTokenizer(bf.readLine());
    int k= Integer.parseInt(st.nextToken());
            
            for(int j=0; j<k;j++){
    int ngbr= Integer.parseInt(st.nextToken());
    mat[i][ngbr]=1;

            }
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
