package dailyAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class IceBerg {
	int x;
	int y;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public IceBerg(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
}

public class HSR_2573 {
	static int N,M;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	
	static int[][] map;
	static Queue q = new LinkedList();
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st= new StringTokenizer(br.readLine());		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}		
		int ans = 0;	//걸린 년도
		int cnt = 0;	//빙하의 개수
		
		while((cnt = separateNum()) < 2) {	//빙하가 2개이상 분리 되지 않으면 0 반환
			if (cnt == 0) {
				ans = 0;
				break;
			}			
			bfs();
			ans++;
		}
		System.out.println(ans);
	}
	public static int separateNum() {	//	현재 빙하의 개수를 dfs를 통해 확인
		boolean[][] isVisited = new boolean[N][M];;
		int cnt = 0;
		for (int i = 0; i < N; i++) {	//N * M 의 맵을 전부 검사하는데 인접한 행렬이 0이 아니면 dfs를 통해 방문 기록남김 
			for (int j = 0; j < M; j++) {
				if(map[i][j] != 0 && !isVisited[i][j]) {	//(x,y)map의 값이 0이 아니고 방문하지 않았을때
					dfs(i, j, isVisited);	//dfs로 빙하가 연결된 깊이 확인
					cnt++;		//빙하의 개수만큼 증가
				}
			}
		}
		return cnt;
	}
	public static void dfs(int x, int y, boolean[][] isVisited) {	
        isVisited[x][y] = true;
 
        int nx, ny;
        for (int i = 0; i < 4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];
 
            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {	
                continue;
            }
 
            if (map[nx][ny] != 0 && !isVisited[nx][ny]) {	//방문 기록이 있는 경우 빙하라 판단
                dfs(nx, ny, isVisited);	//재귀 호출을 통해 빙하의 깊이(빙하의 크기)를 확인한다.
            }
        }
    }
	
	public static void bfs() {
		Queue<IceBerg> q = new LinkedList<>();	//빙하가 있었던 위치를 체크한다 
		
		boolean[][] isVisited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] !=0) {
					q.offer(new IceBerg(i, j));	//빙하의 좌표를 링크드 큐로 입력
					isVisited[i][j] = true;	// 입력된 좌표는 방문 확인
				}
			}
		}
		
		int nx, ny;
		while(!q.isEmpty()) {
			IceBerg ice = q.poll();	//맵 전체를 검사해 IceBerg 객체를 큐를 통해 생성
			
			int seaNum = 0;	//빙하 상하좌우 사면에 있는 바다의 수를 담을 변수
			
			for (int i = 0; i < dx.length; i++) {	//상하좌우 값을 확인한다
				nx = dx[i] + ice.getX();	
				ny = dy[i] + ice.getY();
				
				if (nx < 0 || ny < 0 || nx >= N || ny >= M) {	//배열 범위를 벗어나는 값은 패스
                    continue;
                }
 
                if (!isVisited[nx][ny] && map[nx][ny] == 0) {	//방문하지 않은 map이고 값이 0이면 바다이므로 바다의개수를 증가
                    seaNum++;
                }
			}
			
			if(map[ice.getX()][ice.getY()] - seaNum < 0) {	//0보다 작아지지 않는다 했으므로 0보다 작을때 0으로 설정
				map[ice.getX()][ice.getY()] = 0;
			} else	//바다의 개수만큼 빙하의 값 감소
				map[ice.getX()][ice.getY()] -= seaNum;
		}
	}
}
