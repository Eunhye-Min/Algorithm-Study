package chap01;

import java.util.Scanner;

//1부터 7까지의 합 구하기
public class PracSum {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt(); //7입력
		
		int sum = 0;
		
		for(int i = 0; i <= n; i ++)
			sum += i;
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

	}

}
