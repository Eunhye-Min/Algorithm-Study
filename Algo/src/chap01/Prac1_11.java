package chap01;

import java.util.Scanner;

//양의 정수의 자릿수 출력하기
public class Prac1_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("양의 정수의 자릿수를 출력합니다.");
		
		int n;
		while(true) {
			System.out.print("정수값 입력: ");
			n = stdIn.nextInt();
			if(n > 0)
				break;
			System.out.println("양의 정수를 입력하세요.");
		}
		
		int no = 0; //자릿수
		while(n > 0) {
			n /= 10;
			no++;
		}
		
		System.out.println("입력하신 정수의 자릿수는 " + no + "입니다.");
	}

}
