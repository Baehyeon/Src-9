import java.util.*;

public class Nation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		
		while(true) { // "�׸�"�� �Էµ� ������ �ݺ�
			System.out.print("���� �̸�, �α� >> ");		
			String nation = scanner.next();		 // ���� �Է� ����
			
			if(nation.equals("�׸�"))
				break; // �Է� ����
			
			int population = scanner.nextInt();  // �α� �Է� ����
			nations.put(nation, population); // �ؽø����� �����̸��� �α� ����
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String nation = scanner.next(); // �α��� �˻��ϱ� ���� ���� �Է�
			
			if(nation.equals("�׸�"))
				break; // ���α׷� ���� 
			
			Integer num = nations.get(nation); // �α� ������
			if(num == null)
				System.out.println(nation + " ����� �����ϴ�.");
			else 
				System.out.println(nation + "�� �α��� " + num); 
		}
		
		scanner.close();
	}

}
