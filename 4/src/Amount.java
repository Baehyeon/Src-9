import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;

public class Amount {
	public static void print(Vector<Integer> v) { // �÷����� �Ű������� �޴� �޼ҵ� 
		Iterator<Integer> it = v.iterator();	// Iterator�� �̿��� ��� ���� ��� 
												// Iterator ��ü ���
		int sum = 0;
		
		while(it.hasNext()) {	// ���� v�� ��� ���� ��� ����
			int n = it.next();
			sum += n;
		}
		
		System.out.print("���� ��� " + sum/v.size());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();	// ���� ���� �ٷ�� ���� ����
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			
			int rain = scanner.nextInt(); // �������� �Է¹��� 
			
			if(rain == 0)	// 0 �Է��ϸ� ����
				break;
			else
				v.add(rain);
			
			for(int i=0; i<v.size(); i++) {	// �Է��ϴ� �� ���
				System.out.print(v.get(i) + " ");
			}
			
			System.out.println();
			print(v);				// ����� ���
			System.out.println();		
		}
		
		scanner.close();
	}
}
