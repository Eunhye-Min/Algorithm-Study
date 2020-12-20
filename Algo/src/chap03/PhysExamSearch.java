package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//신체검사 데이터 배열에서 이진검색하기
public class PhysExamSearch {

	//신체검사 데이터를 정의합니다.
	static class Physcdata{
		private String name;	//이름
		private int height;		//키
		private double vision;	//시력
		
		//생성자
		public Physcdata(String name, int height, double vision) {
			super();
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		//문자열을 반환하는 메서드(정보확인용)
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		//HeightOrderComparator 클래스의 인스턴스를 생성 - 오름차순으로 정렬하기 위한 comparator
		public static final Comparator<Physcdata> HEIGHT_ORDER = new HeightOrderComparator();
		
		//Comparator 인터페이스와 compare메서드를 구현한 클래스를 작성
		private static class HeightOrderComparator implements Comparator<Physcdata>{

			@Override
			public int compare(Physcdata d1, Physcdata d2) {
				return (d1.height > d2.height) ? 1 :
						(d1.height < d2.height) ? -1 : 0;
			}
		}
 	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Physcdata[] x = {		//키의 오름차순으로 정렬되어 있습니다.
				new Physcdata("이나령", 162, 0.3),
				new Physcdata("유지훈", 168, 0.4),
				new Physcdata("김한결", 169, 0.8),
				new Physcdata("홍준기", 171, 1.5),
				new Physcdata("전서현", 173, 0.7),
				new Physcdata("이호연", 174, 1.2),
				new Physcdata("이수민", 175, 2.0),
		};
		
		System.out.print("몇 cm인 사람을 찾고 있나요? : ");
		int height = stdIn.nextInt();
		int idx = Arrays.binarySearch(
				x,								//배열 x에서
				new Physcdata("", height, 0.0),	//키가 height인 요소를
				Physcdata.HEIGHT_ORDER			//HEIGHT_ORDER에 의해 검색
				);

		if(idx < 0)
			System.out.println("요소가 없습니다.");
		else
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터: " + x[idx]);	//자동으로 toString 메서드가 호출됨.
	}

}
