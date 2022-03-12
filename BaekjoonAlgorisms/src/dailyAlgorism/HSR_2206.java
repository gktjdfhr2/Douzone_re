package dailyAlgorism;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HSR_2206 {
   static int N,M;
   public static void main(String[] args) throws IOException {
      BufferedReader br = 
            new BufferedReader(
                  new InputStreamReader(System.in));
      StringTokenizer st;
      StringBuilder sb = new StringBuilder();
      
      st = new StringTokenizer(br.readLine()); 
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());
      int[][] map = new int[N][M];
      for (int i = 0; i < N; i++) {
         sb.setLength(0);
         sb.append(br.readLine());
         for (int j = 0; j < M; j++) {
            map[i][j] = sb.charAt(j);
            System.out.print(sb.charAt(j) + " ");
         }
         System.out.println();
      }
      
   }
}