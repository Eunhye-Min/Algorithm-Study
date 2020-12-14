package chap03;

import java.util.Scanner;

//이진검색(key와 같은 맨 앞 요소 찾기)

public class Prac3_5 {
	//배열 a의 n개의 요소에서 key와 같은 요소를 이진검색
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;	//검색범위 맨 앞의 인덱스
		int pr = n-1;	//검색범위 맨 뒤의 인덱스
		
		do {
			int pc = (pl+pr)/2;	//중앙요소의 index
			if(a[pc] == key) {
				for(; pc>pl; pc--)	//key와 같은 맨 앞의 요소를 찾습니다
					if(a[pc-1] < key)
						break;
				return pc;	//검색성공
			}else if(a[pc] < key)
				pl = pc+1;	//검색범위를 앞쪽 절반으로 좁힘
			else
				pr = pc-1;	//검색범위를 뒤쪽 절반으로 좁힘
		}while(pl <= pr);
		return -1;	//검색실패
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];	//요솟수가 num인 배열
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.print("x[0] : ");	//맨 앞 요소를 입력
		x[0] = stdIn.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "] :");
				x[i] = stdIn.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("찾는 값 : ");	//키 값 입력
		int ky = stdIn.nextInt();
		
		int idx = binSearch(x, num, ky);	//배열 x에서 값이 ky인 요소를 검색
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+ "은[는] x[" + idx + "]에 있습니다.");
	}
}
