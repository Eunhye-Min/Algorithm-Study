package chap02;

import java.util.Scanner;

//배열 b의 모든 요소 배열 a에 복사하는 메서드 copy 작성하기
public class Prac2_4 {
	static void copy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		 
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		for(int i=0; i<nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		int[] a = new int[nb];
		
		System.out.println("배열 b의 모든 요소를 배열 a에 복사합니다.");
		copy(a, b);

	}

}
