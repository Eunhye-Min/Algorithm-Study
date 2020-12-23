package chap04;
//하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택 클래스 만들기
//Prac4_3
public class IntStackShare {
	private int max;	//스택의 용량(StackA와 StackB의 합계)
	private int ptrA;	//스택 포인터A
	private int ptrB;	//스택 포인터B
	private int[] stk;	//스택 본체
	
	public enum AorB{
		StackA, StackB
	};
	
	//실행 예외 : 스택이 비어 있음
	public class EmptyIntStackShareException extends RuntimeException{
		public EmptyIntStackShareException() {}
	}
	
	//실행 예외 : 스택이 가득 차있음
	public class OverflowIntStackShareException extends RuntimeException{
		public OverflowIntStackShareException() {}
	}
	
	//생성자
	public IntStackShare(int capacity) {
		ptrA = 0;
		ptrB = capacity - 1;
		max = capacity;
		try {
			stk = new int[max];	//스택 본체용 배열을 생성
		}catch(OutOfMemoryError e){	//생성할 수 없습니다.
			max = 0;
		}
	}
	
	//스택에 x를 푸시
	public int push(AorB sw, int x) throws OverflowIntStackShareException{
		if (ptrA >= ptrB+1)	//스택이 가득 참
			throw new OverflowIntStackShareException();
		switch(sw) {
			case StackA:
				stk[ptrA++] = x;
				break;
			case StackB:
				stk[ptrB--] =x;
				break;
		}
		return x;
	}
	
	//스택에서 데이터를 팝(꼭대기의 데이터를 꺼냄)
	public int pop(AorB sw) throws EmptyIntStackShareException{
		int x = 0;
		switch(sw) {
			case StackA:
				if(ptrA <= 0)		//스택 A가 비어 있음
					throw new EmptyIntStackShareException();
				x = stk[--ptrA];
				break;
			case StackB:
				if(ptrB >= max -1)	//스택 B가 비어 있음
					throw new EmptyIntStackShareException();
				x = stk[++ptrB];
				break;
		}
		return x;
	}
	
	//스택에서 데이터를 피크(꼭대기의 데이터를 살펴봄)
	public int peek(AorB sw) throws EmptyIntStackShareException{
		int x = 0;
		switch(sw) {
			case StackA:
				if(ptrA <= 0)	//스택 A가 비어 있음
					throw new EmptyIntStackShareException();
				x = stk[ptrA-1];
				break;
			case StackB:
				if(ptrB >= max-1)	//스택 B가 비어 있음
					throw new EmptyIntStackShareException();
				x = stk[ptrB+1];
				break;
		}
		return x;
	}
	
	//스택에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	public int indexOf(AorB sw, int x) {
		switch(sw) {
			case StackA:
				for(int i=ptrA-1; i>=0; i--) {
					if(stk[i] == x)
						return i;	//검색성공
					break;
				}
			case StackB:
				for(int i=ptrB+1; i<max; i++) {
					if(stk[i] == x)
						return i;	//검색성공
					break;
				}
		}
		return -1;	//검색실패
	}

	//스택을 비움
	public void clear(AorB sw) {
		switch(sw) {
		case StackA:
			ptrA = 0;
			break;
		case StackB:
			ptrB = max-1;
			break;
		}
	}
	
	//스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//스택에 쌓여 있는 데이터 수를 반환
	public int size(AorB sw) {
		switch(sw) {
		case StackA:
			return ptrA;
		case StackB:
			return max -ptrB -1;
		}
		return 0;
	}
	
	//스택이 비어 있는가?
	public boolean isEmpty(AorB sw) {
		switch(sw) {
		case StackA:
			return ptrA <= 0;
		case StackB:
			return ptrB >= max-1;
		}
		return true;
	}
	
	//스택이 가득 찼는가?
	public boolean isFull() {
		return ptrA >= ptrB +1;
	}
	
	//스택안의 데이터를 바닥->꼭대기의 차례로 나타냄
	public void dump(AorB sw) {
		switch(sw) {
		case StackA:
			if(ptrA <= 0)
				System.out.println("스택이 비었습니다.");
			else {
				for(int i=0; i<ptrA; i++) {
					System.out.print(stk[i] + " ");
				}
				System.out.println();
			}
			break;
		case StackB:
			if(ptrB >= max-1)
				System.out.println("스택이 비었습니다.");
			else {
				for(int i=max-1; i>ptrB; i--) {
					System.out.print(stk[i] +" ");
				}
				System.out.println();
			}
			break;
		}
	}
}
