package chap01;

import java.util.Scanner;

//n단의 피라미드 출력 - 각 i층마다 숫자i로 나타내기
public class Prac1_17 {
	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
				System.out.print(' ');
			for(int j=1; j<=2*i -1; j++)
				System.out.print(i);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("숫자로 나타내는 n단의 피라미드 출력하기");
		
		while(true) {
			System.out.print("단수 n을 입력하세요. :");
			n = stdIn.nextInt();
			if(n > 0)
				break;
			System.out.println("양수를 입력해야 합니다.");
		}
		
		System.out.println("피라미드를 출력합니다.");
		npira(n);
	}

}
