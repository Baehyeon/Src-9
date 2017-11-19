import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;

public class Amount {
	public static void print(Vector<Integer> v) { // 컬렉션을 매개변수로 받는 메소드 
		Iterator<Integer> it = v.iterator();	// Iterator를 이용한 모든 정수 출력 
												// Iterator 객체 얻기
		int sum = 0;
		
		while(it.hasNext()) {	// 벡터 v의 모든 값을 얻어 더함
			int n = it.next();
			sum += n;
		}
		
		System.out.print("현재 평균 " + sum/v.size());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();	// 정수 값만 다루는 벡터 생성
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			
			int rain = scanner.nextInt(); // 강수량을 입력받음 
			
			if(rain == 0)	// 0 입력하면 종료
				break;
			else
				v.add(rain);
			
			for(int i=0; i<v.size(); i++) {	// 입력하는 값 출력
				System.out.print(v.get(i) + " ");
			}
			
			System.out.println();
			print(v);				// 평균을 출력
			System.out.println();		
		}
		
		scanner.close();
	}
}
