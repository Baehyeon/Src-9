import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class CitySearch {
	public class City {		// 도시 정보를 나타내는 City 클래스 생성
		private String name;
		private int lati;
		private int longt;
		
		public City(String name, int lati, int longt) { // 기본 생성자
			this.name = name;
			this.lati = lati;
			this.longt = longt;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setLati(int lati) {
			this.lati = lati;
		}
		public int getLati() {
			return lati;
		}
		public void setLongt(int longt) {
			this.longt = longt;
		}
		public int getLongt() {
			return longt;
		}
	}
	
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, City> dept = new HashMap<String, City>(); // 해시맵 저장
	
	private void input() {
		System.out.println("도시, 경도, 위도를 입력하세요");
		
		for (int i=0; i<4; i++) { // 4개의 도시 저장함
			System.out.print(">> ");
			String text = scanner.nextLine();						// 문자열 한 줄로 입력받음 
			StringTokenizer st = new StringTokenizer(text, ",");	// 문자열을 공백문자로 분리해서 가져옴
			String name = st.nextToken().trim();		// 문자열을 얻어온후, 문자열의 양옆(왼쪽,오른쪽)의 공백문자를 제거
			int lati = Integer.parseInt(st.nextToken().trim());
			int longt = Integer.parseInt(st.nextToken().trim());
			
			City city = new City(name, lati, longt);
			dept.put(name, city); // 해시맵에 저장
		}			
	}
	
	private void printData() { 		 // 모두 출력
		Set<String> key = dept.keySet();		// 키 set
		Iterator<String> it = key.iterator();
		
		while (it.hasNext()) {
			String name = it.next(); // 이름 알아냄
			City city = dept.get(name); // 이름을 키로하여 해시맵으로 Student 객체 얻어냄
			
			System.out.print(city.getName() + " ");
			System.out.print(city.getLati() + " ");
			System.out.println(city.getLongt() + " ");
		}		
	}

	private void information() {
		while(true) {
			System.out.print("도시 이름 >> ");
			String name = scanner.nextLine(); // 도시 이름 입력
			
			if(name.equals("그만"))
				return; // 종료
			
			City city = dept.get(name); // 해시맵에서 이름을 키로 검색
			if(city == null) { // 이름이 해시맵에 없다면
				System.out.println(name + "는 없습니다.");
			}
			else { // 해시맵 City 객체
				System.out.print(city.getName() + " ");
				System.out.print(city.getLati() + " ");
				System.out.println(city.getLongt() + " ");
			}
		}
	}
	
	public void run() { // 모두 실행 메소드
		input();
		System.out.println("---------------------------");
		printData();
		System.out.println("---------------------------");
		information();
	}
	
	public static void main (String[] args) {
		CitySearch city = new CitySearch(); // City Hash 생성
		city.run(); // 실행 
	}
}
