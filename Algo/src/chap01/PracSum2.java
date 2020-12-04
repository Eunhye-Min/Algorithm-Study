package chap01;

import java.util.Scanner;

//1부터 10까지의 합, 가우스의 덧셈으로 구하기
public class PracSum2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 가우스의 덧셈으로 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<= 5; i++)
			sum += (1+n);
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

	}

}
