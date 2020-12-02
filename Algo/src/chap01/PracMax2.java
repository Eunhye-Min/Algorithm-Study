package chap01;

public class PracMax2 {
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min3(a,b,c) : " + min3(7,6,5));
		System.out.println("min3(-100,-10000,0) : " + min3(-100,-10000,0));
	}

}
