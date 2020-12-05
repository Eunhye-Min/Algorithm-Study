package chap02;

import java.util.Scanner;

//배열의 모든 요소 합계 구하여 반환하는 메서드 만들기
public class Prac2_3 {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++)
			sum += a[i];
		return sum;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수를 입력하세요 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("크기 " + num + "의 배열 x를 만듭니다.");
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("배열 x : ");
		for(int i=0; i<num; i++) {
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("배열 x의 요소 합 : " + sumOf(x));

	}

}
