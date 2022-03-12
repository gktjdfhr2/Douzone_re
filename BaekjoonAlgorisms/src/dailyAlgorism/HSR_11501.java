package dailyAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class HSR_11501 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N;
		long M;
		int max = 0;			
		long profit = 0;	//주식으로 얻은 이득
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
//		ArrayList<Integer> stock = new ArrayList<Integer>();	시간초과
		
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			max = 0;
			profit = 0;
			M = Integer.parseInt(br.readLine());
			int[] stock = new int[(int) (M+1)];
//			stock.removeAll(stock);	시간초과
			
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				stock[j] = Integer.parseInt(st.nextToken());
								
			}
			
			for (int k = (int) (M - 1); k >= 0; k--) {
				if(stock[k] > max) {
					max = stock[k];
				}
				else {
					profit += max - stock[k];					
				}
			}			
			System.out.println(profit);		
			
			
		}
		
	}
}

