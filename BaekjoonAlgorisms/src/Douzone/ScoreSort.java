package Douzone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//https://fbtmdwhd33.tistory.com/83
//�̸� ���� ���� ���� ���� �־��� Ŭ���� ���� 
		//�������� ��������
		//�������� ������ �� �������� ��������
		//�������� & �������� ���� �� �������� ��������
		//��� ������ ������ �̸� ��������(�ƽ�Ű �ڵ� ����)
public class ScoreSort{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int row = sc.nextInt();		
		
		//���� �Է��� ����4���� 2���� �迭 ���� 
		String[][] stScore = new String[row][4];
		
		//�� ������ �̸��� ��,��,�� ���� �Է�
		for(int i = 0; i < stScore.length; i++) {
			for(int j = 0; j < stScore[i].length; j++) {
				stScore[i][j] = sc.next();
			}
		}
		
		Arrays.sort(stScore, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				//�������� ��������			
				if(Integer.valueOf(o1[1]) > Integer.valueOf(o2[1])) {					
					 return -1;
				}
				//��������, ��������, �������� ���� �� �̸��� ��������
				else if(Integer.valueOf(o1[1]) == Integer.valueOf(o2[1])) {
					if(Integer.valueOf(o1[2]) == Integer.valueOf(o2[2])) {
						if(Integer.valueOf(o1[3]) == Integer.valueOf(o2[3])) {
							return o1[0].compareTo(o2[0]);
						}					
					//��������, �������� ���� �� �������� ��������
						return Integer.compare(Integer.valueOf(o2[3]), Integer.valueOf(o1[3]));
					}
					return Integer.compare(Integer.valueOf(o1[2]), Integer.valueOf(o2[2]));
				}
				return 1;
			}
		});
		
		for(int i = 0; i < stScore.length; i ++) {
			System.out.println(stScore[i][0]);
		}
	}
}