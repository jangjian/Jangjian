package Array2;
import java.util.Scanner;
public class Array2_score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][3]; //점수 배열 선언 생성
		int max = 0, team = 0; //최대값 변수, 최고팀 변수 선언&초기화
		int[] sum = new int[5]; // 점수 합, 5개의 조이기 때문에 크기를 5로 했다.
		
		System.out.println("0~20 사이의 수를 입력해주세요. (점수 사이에는 공백입력)");
		
		for(int i = 0; i< score.length; i++) {
			System.out.print((i+1) + "조  점수 입력 :  ");
			for(int j = 0; j<score[i].length; j++) {
					score[i][j] = sc.nextInt();
					sum[i] += score[i][j];
			}
			if(max <= sum[i]) {
					team = i+1;
					max = sum[i];
			}
		}
		System.out.println("최고팀 : " +  team + "번째 팀 -> 점수 : " + max);
	}
}
