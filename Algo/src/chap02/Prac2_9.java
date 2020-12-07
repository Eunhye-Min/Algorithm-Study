package chap02;

import java.util.Scanner;

//y년 m월 d일의 그 해 남은 일수를 구하는 leftDayOfYear 메서드 작성하기
public class Prac2_9 {
	//각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	//서기 year년은 윤년인가? (윤년: 1 / 평년: 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	//서기 y년 m월 d일의 그 해 남은 일수 구하기
	static int leftDayOfYear(int y, int m, int d) {
		int totalDays = 0;
		int days = d;
		//그 해 전체 일수 구하기
		for(int i=1; i<=12; i++) {
			totalDays += mdays[isLeap(y)][i-1];
		}
		//y년 m월 d일까지의 일수 구하기
		for(int i=1; i<m; i++) {
			days += mdays[isLeap(y)][i-1];
		}
		
		return totalDays - days;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; //다시 한 번?
		
		System.out.println("입력하신 날짜 기준 그 해 남은 일수를 구합니다.");
		
		do {
			System.out.print("년: "); int year = stdIn.nextInt();
			System.out.print("월: "); int month = stdIn.nextInt();
			System.out.print("일: "); int day = stdIn.nextInt();
			
			System.out.printf("그 해 남은 일 수는 %d일입니다.\n", leftDayOfYear(year, month, day));
			
			System.out.print("한번 더 할까요? (1.예 / 0.. 아니오) : ");
			retry = stdIn.nextInt();
		}while(retry == 1);

	}

}
