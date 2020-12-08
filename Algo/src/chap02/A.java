package chap02;

public class A {
	private int f1;	//비공개 필드
	protected int f2;	//한정 공개 필드
	public int f3;		//공개 필드
	
	static final int S1 = 0;	//정적 상수 필드
	
	//생성자
	public A(int f1, int f2, int f3) {
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
	}
	
	//메서드 F1의 setter
	public void setF1(int f) {
		f1 =f;
	}
	
	//메서드 F1의 getter
	public int getF1() {
		return f1;
	}
	
	//공개클래스 - 클랙스 접근 제한자 public을 붙여 선언한 클래스, 다른 패키지에서 사용할 수 있는 공개 클래스
	
	//final클래스 - 클래스 접근 제한자 final을 붙여 선언한 클래스로 서브클래스를 가질 수 없음(새로운 클래스 상속 불가)
	
	//파생 클래스 - 클래스A를 직접 상위클래스로 함, 선언시 extends A를 추가, 이 때 선언한 클래스는 클래스 A의 직접 서브 클래스가 됨
	//클래스 선언에 extends가 없는 클래스의 상위 클래스는 Object가 됨(상위 클래스를 갖지 않는 유일한 클래스인 Object)
	//cf. 인터페이스 구현 - 선언에 implements X를 추가
	
	//추상클래스 - 클래스 접근 제한자 abstract를 붙여 클래스 선언, 추상 메서드를 가질 수 있음, but 불완전클래스이므로 인스턴스 만들 수 없음
	
	//
}
