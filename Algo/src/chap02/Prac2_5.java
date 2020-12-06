package chap02;

import java.util.Scanner;

//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성
public class Prac2_5 {
	static void rcopy(int[] a, int [] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[b.length-1-i];
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = stdIn.nextInt();	//배열 b의 요솟수
		
		int[] b = new int[nb]; //요솟수가 nb인 배열 b
		
		for(int i=0; i<nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		int[] a = new int[nb];	//요솟수가 nb인 배열 a
		
		System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사합니다.");
		
		rcopy(a, b);
		
		System.out.println("배열 a의 요소 출력");
		
		for(int i=0; i<a.length; i++) {
			System.out.print("a[" + i + "] : " + a[i] + " ");
		}
	}

}
