package dailyAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HSR_1303_practice {
	static char[][] battlefield;
	static boolean[][] isVisited;
	static ArrayList<Integer>graph = new ArrayList<Integer>();
	static int[] dx = { 1, 0, -1, 0};
	static int[] dy = { 0, 1 , 0, -1};
	static int N, M, cnt = 0, B = 0, W = 0;
	static Queue q = new LinkedList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		isVisited = new boolean[N][M];
		battlefield = new char[N][M];	//true = W false = B
	
		for (int i = 0; i < N; i++) {
			sb.setLength(0);
			sb.append(br.readLine());			
			for (int j = 0; j < M; j++) {
				battlefield[i][j] = sb.toString().charAt(j);
			}			
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(!isVisited[i][j]) {	//방문했는지 확인 방문 안했어야 동작
					cnt = 1;
					isVisited[i][j] = true;		//방문했다고 바꿔주고
					q.add(new int[] {i,j} );	//{x,y}좌표 큐에 생성 방식
					
					bfs();	// bfs 시작
					
					if(battlefield[i][j] == 'W') {
						W += cnt * cnt;						
					}else {
						B += cnt * cnt;
					}
				}
			}
		}
		System.out.println(W + " " + B);
		
	}
	static void bfs() {
		while(!q.isEmpty()) {	//q 가 빌때까지 반복 즉 인접한 상하좌우 배열 확인
			int pos[] = (int[])q.poll(); //데이터 형태 맞춰주자
			int row = pos[0];
			int col = pos[1];
			
			for (int i = 0; i < dx.length; i++) {
				int nx = row + dx[i];
				int ny = col + dy[i];
				
				if(nx > N || nx < 0 || ny > M || ny < 0) {continue;}
				if(isVisited[nx][ny]) {continue;}
				if(battlefield[nx][ny] != battlefield[row][col]) {continue;}
					
				cnt++;
				isVisited[nx][ny] = true;
				q.add(new int[] {nx, ny});
				
			}
			
			
			
			
			
		}
	}
}
