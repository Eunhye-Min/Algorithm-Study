package chap04;

import java.util.Scanner;

//원하는 개수만큼 값을 입력 받아 요솟수가 N인 배열에 마지막 N개를 저장
public class LastNElements {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;	//배열의 요솟수
		int[] a = new int[N];	//입력 받은 값을 저장
		int cnt = 0;			//입력 받은 개수
		int retry;				//다시 한 번?

		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt();	//N으로 나눈 나머지 이므로, cnt가 10이상일 때 0,1,2,3... 이런식
			
			System.out.println("계속 할까요? (예.1 / 아니오.0) : ");
			retry = stdIn.nextInt();
		}while(retry == 1);
		
		int i = cnt - N;  //12-10 = 2 i=2
		if(i < 0) i = 0;
		
		for( ; i<cnt; i++)
			System.out.printf("%2d번째의 정수=%d\n", i+1, a[i % N]);	//a[2], a[3], ... , a[9], a[0], a[1]
	}

}
