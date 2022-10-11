import java.util.Scanner;
public class HOME_PT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age, answer, sex;
		double cm, kg, muscle, fat, kkg = 0.0, mmuscle = 0.0, ffat = 0.0;
		
		System.out.println("H       H     OOO     M        M  E E E E E");
		System.out.println("H       H   O     O   MM      MM  E        ");
		System.out.println("H       H  O       O  M M    M M  E        ");
		System.out.println("H H H H H  O       O  M  M  M  M  E E E E E");
		System.out.println("H       H  O       O  M   MM   M  E        ");
		System.out.println("H       H   O     O   M        M  E        ");
		System.out.println("H       H     OOO     M        M  E E E E E");
		System.out.println();
		System.out.println("           P P P P    T T T T T            ");
		System.out.println("           P      P       T                ");
		System.out.println("           P      P       T                ");
		System.out.println("           P P P P        T                ");
		System.out.println("           P              T                ");
		System.out.println("           P              T                ");
		System.out.println("           P              T                ");
		System.out.println();
		System.out.println("★HOME PT에 오신걸 환영합니다★");
		System.out.println("운동을 시작해볼까요?");
		System.out.println("1. 예");
		System.out.println("2. 아니요(프로그램 종료)");
		answer = sc.nextInt();
		
		switch(answer) {
		
		case 1:
			System.out.println("당신의 인바디를 입력해주세요!");
			System.out.print("나이 : ");
			age = sc.nextInt();
			System.out.println();
			System.out.println("성별 ");
			System.out.println("1. 여자 ");
			System.out.println("2. 남자");
			sex = sc.nextInt();
			System.out.print("키 : ");
			cm = sc.nextDouble();
			System.out.print("몸무게 : ");
			kg = sc.nextDouble();
			System.out.print("근육량 : ");
			muscle = sc.nextDouble();
			System.out.print("체지방량 : ");
			fat = sc.nextDouble();
			System.out.printf("당신의 신장에 알맞는 표준 체중은 %.2f입니다.\t", getAvekg(kkg,sex,cm));
			System.out.printf("당신의 골격근량은 %.2f입니다.\t", getMuscle(muscle, mmuscle));
			System.out.printf("당신의 체지방률은 %.2f입니다.", getFat(ffat, fat, kg));
			
			break;
			
		case 2:
			System.exit(0);break;
		default:
			System.out.println("잘못된 입력입니다.");
			System.exit(0);break;
		}	
	}
	public static double getAvekg(double kkg, int sex, double cm) {
		if(sex == 1) {
			kkg = cm*cm*21*0.0001;
			return kkg;
		}else {
			kkg = cm*cm*22*0.0001;
			return kkg;
		}
	}
	public static double getMuscle(double muscle, double mmuscle) {
		mmuscle = muscle*0.577;
		return mmuscle;
	}
	public static double getFat(double fat, double ffat, double kg) {
		ffat = (fat%kg)*100;
		return ffat;
	}
}
