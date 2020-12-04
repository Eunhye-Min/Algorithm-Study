package chap01;

import java.util.Scanner;

//정수a,b의 값을 입력한 후 b-a의 값을 구하기
public class PracWhile {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		int b;
		
		do {
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			System.out.println("a보다 큰 값을 입력하쇼.");
		}while(b <= a);
		
		System.out.println("b-a는 " + (b-a) + "입니다.");
		
		
		

	}

}
