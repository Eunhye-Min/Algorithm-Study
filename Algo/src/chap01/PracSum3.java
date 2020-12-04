package chap01;

import java.util.Scanner;

//a부터 b까지의 합 구하기
public class PracSum3 {
	
	static int sumof(int a, int b) {
		int min; // a, b의 작은 쪽의 값
		int max; // a, b의 큰 쪽의 값

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		
		int sum = 0; //합
		for(int i= min; i <= max; i++) {
			sum += i;
			i++;
		}

		return sum;
		}
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		
		System.out.println("a부터 b까지의 모든 정수의 합은: " + sumof(a, b));
	}

}
