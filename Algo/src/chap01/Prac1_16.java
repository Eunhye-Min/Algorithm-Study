package chap01;

import java.util.Scanner;

//n단의 피라미드 출력하는 메서드 작성하기
public class Prac1_16 {
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
				System.out.print(" ");
			for(int j=1; j<= 2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("n단의 피라미드 출력하기");
		
		do {
			System.out.print("단수를 입력하세요. : ");
			n = stdIn.nextInt();
		}while(n<=0);

		System.out.println("피라미드를 출력합니다.");
		spira(n);
	}

}
