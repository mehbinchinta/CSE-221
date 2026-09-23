    import java.io.*;
        import java.util.*;
        public class task7{
        

        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int test= Integer.parseInt(bf.readLine());
        for(int k=0;k<test;k++){
        StringTokenizer st= new StringTokenizer(bf.readLine());
        int n= Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
    ArrayList<long[]>edges= new ArrayList<>();
                
        for(int i=0;i<m;i++){
            st= new StringTokenizer(bf.readLine());
    int u= Integer.parseInt(st.nextToken());
    int v= Integer.parseInt(st.nextToken());
    long w= Long.parseLong(st.nextToken());
    edges.add(new long[]{u,v,w});

        }
        long[] dist=new long[n+1];
        for(int i=1;i<=n;i++){
            dist[i]=Long.MAX_VALUE;


        }
        dist[1]=0;
        for(int i=0;i<=n-1;i++){
            boolean updated=false;
            for(int j = 0; j < edges.size(); j++){

            long[] edge = edges.get(j);

            int u = (int) edge[0];
            int v = (int) edge[1];
            long w = edge[2];
            if(dist[u] != Long.MAX_VALUE && dist[u] + w < dist[v]){
                dist[v] = dist[u] + w;
    updated=true;
        }

    }
    if(!updated){
        break;

    }
        }
        pw.println(dist[n]);
        pw.flush();
    }
        }
    }