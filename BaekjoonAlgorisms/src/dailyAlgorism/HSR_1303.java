package dailyAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HSR_1303 {
	static int[] dx = { 1, 0, -1, 0 };	// 상하좌우 검색을 취한 x좌표 배열
	static int[] dy = { 0, 1, 0, -1 };	// 상하좌우 검색을 취한 y좌표 배열
	static ArrayList<Integer> visitArr = new ArrayList<Integer>(); //해당 노드에서 인접한 노드를 입력해 줄 리스트
	static boolean[][] isVisited;	//방문상태를 확인할 배열
	static char[][] battlefield;	//어떤 병사가 들어가있는지 입력할 배열 ('W'/'B')
	static Queue q = new LinkedList<>();	//bfs를 사용하기 위한 큐 선언
	
	static int B = 0, W = 0, N, M, cnt = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));	//입력을 위한 버퍼리더
		StringBuilder sb = new StringBuilder();	//입력할 문자를 담을 스트링빌더
		StringTokenizer st = new StringTokenizer(br.readLine());	//입력한 문자를 담을 스트링토크나이저
		
		N = Integer.parseInt(st.nextToken());	//전장의 X좌표 크기 설정
		M = Integer.parseInt(st.nextToken());	//전장의 ㅛ좌표 크기 설정
		
		isVisited = new boolean[N][M];	//방문 상태를 담을 isVisted 배열 선언
		battlefield = new char[N][M];	//어떤 병사가 들어가있는지 입력할 배열 ('W'/'B')
	
		for (int i = 0; i < N; i++) {
			sb.setLength(0);
			sb.append(br.readLine());			
			for (int j = 0; j < M; j++) {
				battlefield[i][j] = sb.toString().charAt(j);
			}			
		}
		for (int i = 0; i < N; i++) {						
			for (int j = 0; j < M; j++) {
				if(!isVisited[i][j]) {
					cnt = 1;
					isVisited[i][j]= true;
					q.add(new int[] {i, j});
					
					bfs();
					
					if(battlefield[i][j] == 'W') {W += cnt * cnt;}
					else{B += cnt * cnt;}
					
				}
			}			
		}
		System.out.println(W + " " + B);		
	}
	
	static void bfs() {
		while(!q.isEmpty()) {	//q 가 빌때까지 반복 즉 인접한 상하좌우 배열 확인
			int[] pos = (int[])q.poll();	//현재 x, y 좌표가 들어가 있는 큐값 꺼내줌
			int row = pos[0];	//x좌표
			int col = pos[1];	//y좌표
			
			for (int i = 0; i < dx.length; i++) { //앞전에 선언한 배열을 이용해 인접한 배열 x,y좌표 탐색
				int nx = row + dx[i];	
				int ny = col + dy[i];
				
				//배열 범위를 넘어가면 패스
				if(nx >= N || nx < 0 || ny >= M || ny < 0) {
					continue;
				}
				//이미 방문한 배열이면 패스
				if(isVisited[nx][ny]) {
					continue;
				}
				//인접한 배열의 값이 다르면 패스
				if (battlefield[nx][ny] != battlefield[row][col]) {
					continue;
				}
				
				cnt++;	//연결된 노드 수를 가질 cnt 증가
				isVisited[nx][ny] = true;	//이제 방문한 노드이므로 true로 입력
				q.add(new int[] {nx, ny});	//인접한 배열이 현재 배열과 같은 병사 이므로 큐에 추가
				
				
				
			}
		}
		
	}
}
