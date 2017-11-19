import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class CitySearch {
	public class City {		// ���� ������ ��Ÿ���� City Ŭ���� ����
		private String name;
		private int lati;
		private int longt;
		
		public City(String name, int lati, int longt) { // �⺻ ������
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
	private HashMap<String, City> dept = new HashMap<String, City>(); // �ؽø� ����
	
	private void input() {
		System.out.println("����, �浵, ������ �Է��ϼ���");
		
		for (int i=0; i<4; i++) { // 4���� ���� ������
			System.out.print(">> ");
			String text = scanner.nextLine();						// ���ڿ� �� �ٷ� �Է¹��� 
			StringTokenizer st = new StringTokenizer(text, ",");	// ���ڿ��� ���鹮�ڷ� �и��ؼ� ������
			String name = st.nextToken().trim();		// ���ڿ��� ������, ���ڿ��� �翷(����,������)�� ���鹮�ڸ� ����
			int lati = Integer.parseInt(st.nextToken().trim());
			int longt = Integer.parseInt(st.nextToken().trim());
			
			City city = new City(name, lati, longt);
			dept.put(name, city); // �ؽøʿ� ����
		}			
	}
	
	private void printData() { 		 // ��� ���
		Set<String> key = dept.keySet();		// Ű set
		Iterator<String> it = key.iterator();
		
		while (it.hasNext()) {
			String name = it.next(); // �̸� �˾Ƴ�
			City city = dept.get(name); // �̸��� Ű���Ͽ� �ؽø����� Student ��ü ��
			
			System.out.print(city.getName() + " ");
			System.out.print(city.getLati() + " ");
			System.out.println(city.getLongt() + " ");
		}		
	}

	private void information() {
		while(true) {
			System.out.print("���� �̸� >> ");
			String name = scanner.nextLine(); // ���� �̸� �Է�
			
			if(name.equals("�׸�"))
				return; // ����
			
			City city = dept.get(name); // �ؽøʿ��� �̸��� Ű�� �˻�
			if(city == null) { // �̸��� �ؽøʿ� ���ٸ�
				System.out.println(name + "�� �����ϴ�.");
			}
			else { // �ؽø� City ��ü
				System.out.print(city.getName() + " ");
				System.out.print(city.getLati() + " ");
				System.out.println(city.getLongt() + " ");
			}
		}
	}
	
	public void run() { // ��� ���� �޼ҵ�
		input();
		System.out.println("---------------------------");
		printData();
		System.out.println("---------------------------");
		information();
	}
	
	public static void main (String[] args) {
		CitySearch city = new CitySearch(); // City Hash ����
		city.run(); // ���� 
	}
}
