package chap04;
//int형 스택
public class IntStack {
	private int max;	//스택 용량
	private int ptr;	//스택 포인터
	private int[] stk;	//스택 본체
	
	//실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	//생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];			//스택 본체용 배열을 생성
		}catch(OutOfMemoryError e) {	//생성할 수 없음(배열 본체 생성에 실패)
			max = 0;					//이렇게 하면, 다른 메서드가 존재하지 않는 배열에 잘못 접근하는 것을 막을 수 있음
		}
	}
	
	//스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException{
		if(ptr >= max)	//스택이 가득차면
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	//스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0)	//스택이 비어 있으면
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
}
