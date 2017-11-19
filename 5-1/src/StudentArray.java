import java.util.*;

public class StudentArray {
	public class Student {		// �л� ������ ��Ÿ���� Student Ŭ���� ����
		private String name;
		private String major;
		private String num;
		private double grade;
		
		public Student(String name, String major, String num, double grade) { // �⺻ ������
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
	private ArrayList<Student> Department = new ArrayList<Student>(); // �迭�� ����
	
	private void input() {	// �л� ������ �Է��ϴ� �޼ҵ� 
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		
		for (int i=0; i<4; i++) { // �׸� ���� ������
			System.out.print(">> ");
			String text = scanner.nextLine(); 					 // ���ڿ� �� �ٷ� �Է¹��� 
			StringTokenizer st = new StringTokenizer(text, ","); // ���ڿ��� ���鹮�ڷ� �и��ؼ� ������
			String name = st.nextToken().trim(); // ���ڿ��� ������, ���ڿ��� �翷(����,������)�� ���鹮�ڸ� ����
			String major = st.nextToken().trim();
			String num = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, major, num, grade); // student ����
			Department.add(student); // �迭�� ����
		}			
	}
	
	private void printData() { // ��� ���
		Iterator<Student> dept = Department.iterator();
		
		while (dept.hasNext()) {
			Student student = dept.next();
			System.out.println("---------------------------");
			System.out.println("�̸�:" + student.getName());
			System.out.println("�а�:" + student.getMajor());
			System.out.println("�й�:" + student.getNum());
			System.out.println("�������:" + student.getGrade());
			System.out.println("---------------------------");
		}		
	}

	private void information() {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.nextLine(); // �л� �̸� �Է�
			if(name.equals("�׸�"))
				return; // ����
			
			for(int i=0; i<Department.size(); i++) { // ��� �л� �˻�
				Student student = Department.get(i); // i��° �л� ��ü
				if(student.getName().equals(name)) { //  �̸��� ���� Student ã��
					System.out.print(student.getName() + ", ");
					System.out.print(student.getMajor() + ", ");
					System.out.print(student.getNum() + ", ");
					System.out.println(student.getGrade());
					break;
				}
			} 
		}
	}
	
	public void run() { // ��� ���� �޼ҵ�
		input();
		printData();
		information();
	}
	
	public static void main (String[] args) {
		StudentArray man = new StudentArray(); // Student ����
		man.run(); // ���� 
	}
	
}
