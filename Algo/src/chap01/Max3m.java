package chap01;
// 3개의 정숫값 가운데 최댓값을 구하여 출력합니다.

public class Max3m {
	// a, b, c의 최댓값을 구하여 반환합니다.
	static int max3(int a, int b, int c) {	//매개변수(메서드정의시)
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1)=" + max3(3,2,1)); //실인수(메서드호출시)
		System.out.println("max3(3,2,2)=" + max3(3,2,2));
		System.out.println("max3(3,1,2)=" + max3(3,1,2));
		System.out.println("max3(3,2,3)=" + max3(3,2,3));
		System.out.println("max3(2,1,3)=" + max3(2,1,3));
		
		//이처럼 최댓값을 여러번 반복해서 구하는 경우 메서드로 처리하면 편리
	}

}
