package chap02;

import java.util.Scanner;

//그 해 경과 일수를 구하되, dayOfYear 메서드에서
//while문을 사용하여 변수 i와 days 없이 구현하기 
public class Prac2_8 {
	//각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	//서기 year년은 윤년인가? (윤년: 1 / 평년 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? 1 : 0;
	}
	
	//서기 y년 m월 d일의 그 해 경과 일 수를 구함
	static int dayOfYear(int y, int m, int d){
		while(--m != 0){
			d += mdays[isLeap(y)][m-1];
		}
		return d;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; //다시 한 번?
		
		System.out.println("그 해의 경과 일 수를 구합니다.");
		
		do {
			System.out.print("년 : "); int year = stdIn.nextInt();
			System.out.print("월 : "); int month = stdIn.nextInt();
			System.out.print("일 : "); int day = stdIn.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			
			System.out.print("한번 더 할 까요? (1.예 / 0.아니오) : ");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}

}
