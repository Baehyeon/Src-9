import java.util.*;

public class Nation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		
		while(true) { // "그만"이 입력될 때까지 반복
			System.out.print("나라 이름, 인구 >> ");		
			String nation = scanner.next();		 // 나라 입력 받음
			
			if(nation.equals("그만"))
				break; // 입력 종료
			
			int population = scanner.nextInt();  // 인구 입력 받음
			nations.put(nation, population); // 해시맵으로 나라이름과 인구 저장
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String nation = scanner.next(); // 인구를 검색하기 위해 나라 입력
			
			if(nation.equals("그만"))
				break; // 프로그램 종료 
			
			Integer num = nations.get(nation); // 인구 가져옴
			if(num == null)
				System.out.println(nation + " 나라는 없습니다.");
			else 
				System.out.println(nation + "의 인구는 " + num); 
		}
		
		scanner.close();
	}

}
