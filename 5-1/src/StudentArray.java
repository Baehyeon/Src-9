import java.util.*;

public class StudentArray {
	public class Student {		// 학생 정보를 나타내는 Student 클래스 생성
		private String name;
		private String major;
		private String num;
		private double grade;
		
		public Student(String name, String major, String num, double grade) { // 기본 생성자
			this.name = name;
			this.major = major;
			this.num = num;
			this.grade = grade;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setMajor(String major) {
			this.major = major;
		}
		public String getMajor() {
			return major;
		}
		public void setNum(String num) {
			this.num = num;
		}
		public String getNum() {
			return num;
		}
		public void setGrade(double grade) {
			this.grade = grade;
		}
		public double getGrade() {
			return grade;
		}
	}

	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Student> Department = new ArrayList<Student>(); // 배열로 저장
	
	private void input() {	// 학생 정보를 입력하는 메소드 
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		
		for (int i=0; i<4; i++) { // 네명 까지 저장함
			System.out.print(">> ");
			String text = scanner.nextLine(); 					 // 문자열 한 줄로 입력받음 
			StringTokenizer st = new StringTokenizer(text, ","); // 문자열을 공백문자로 분리해서 가져옴
			String name = st.nextToken().trim(); // 문자열을 얻어온후, 문자열의 양옆(왼쪽,오른쪽)의 공백문자를 제거
			String major = st.nextToken().trim();
			String num = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, major, num, grade); // student 생성
			Department.add(student); // 배열에 저장
		}			
	}
	
	private void printData() { // 모두 출력
		Iterator<Student> dept = Department.iterator();
		
		while (dept.hasNext()) {
			Student student = dept.next();
			System.out.println("---------------------------");
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getMajor());
			System.out.println("학번:" + student.getNum());
			System.out.println("학점평균:" + student.getGrade());
			System.out.println("---------------------------");
		}		
	}

	private void information() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine(); // 학생 이름 입력
			if(name.equals("그만"))
				return; // 종료
			
			for(int i=0; i<Department.size(); i++) { // 모든 학생 검색
				Student student = Department.get(i); // i번째 학생 객체
				if(student.getName().equals(name)) { //  이름이 같은 Student 찾음
					System.out.print(student.getName() + ", ");
					System.out.print(student.getMajor() + ", ");
					System.out.print(student.getNum() + ", ");
					System.out.println(student.getGrade());
					break;
				}
			} 
		}
	}
	
	public void run() { // 모두 실행 메소드
		input();
		printData();
		information();
	}
	
	public static void main (String[] args) {
		StudentArray man = new StudentArray(); // Student 생성
		man.run(); // 실행 
	}
	
}
