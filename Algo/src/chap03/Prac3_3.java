package chap03;
//요솟수 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞 부터 순서대로 저장하고,
//일치하는 요솟수 반환하는 메서드 작성하기

import java.util.Scanner;

public class Prac3_3 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0; //key와 같은 요솟수
		for(int i=0; i<n; i++) {
			if(a[i] == key)
				idx[count++] = i;	//요소의 인덱스를 idx에 저장
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];	//요솟수 num인 배열 x
		int[] y = new int[num];	//요솟수 num인 배열 y
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("찾는 값 : ");
		int ky = stdIn.nextInt();
		
		int count = searchIdx(x, num, ky, y);
		
		if(count == 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			for(int i=0; i<count; i++)
				System.out.println("그 값은 x[" + y[i] + "]에 있습니다.");

	}

}
