package chap01;

import java.util.Scanner;

//직각 이등변 삼각형 출력하는 메서드 작성하기
public class Prac1_15 {
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {	//왼쪽 위가 직각인 이등변 삼각형을 출력
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++)
				System.out.print("*");
			System.out.println();
			}
		}
	
	static void triangleRU(int n) {	//오른쪽 위가 직각인 이등변 삼각형을 출력
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++)
				System.out.print(' ');
			for(int j=1; j<=n-i+1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {	//오른쪽 아래가 직각인 이등변 삼각형을 출력
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
				System.out.print(' ');
			for(int j=1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("삼각형 모양 나타내기");
		
		do {
			System.out.print("단수를 입력하세요: ");
			n = stdIn.nextInt();
			System.out.println("양수를 입력하셔야 합니다.");
		}while(n<=0);
		
		System.out.println("왼쪽 아래가 직각인 삼각형을 출력합니다");
		triangleLB(n);

		System.out.println("왼쪽 위가 직각인 삼각형을 출력합니다");
		triangleLU(n);
		
		
		System.out.println("오른쪽 위가 직각인 삼각형을 출력합니다");
		triangleRU(n);
		
		System.out.println("오른쪽 아래가 직각인 삼각형을 출력합니다");
		triangleRB(n);
		
	}

}
