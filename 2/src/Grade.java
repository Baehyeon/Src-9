import java.util.*; 

public class Grade { 
   public static void main(String[] args) { 
	  Scanner scanner = new Scanner(System.in); 
      ArrayList<String> grade =  new ArrayList<String>(); 
      
      System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) "); 
      
      for(int i=0 ; i<6 ; i++) { 		// ������ �Է¹���
         grade.add( scanner.next() ); 
      } 
      
      double score[] = new double[6];	// ������ ���� �迭 ����
      double sum = 0;
      
      for(int i=0 ; i<grade.size() ; i++) { 
         String str = grade.get(i);		// ������ �޾ƿ� 
         
         if( str.equals("A") )			// A~F ������ ���� ����
            score[i] = 4.0; 
         else if( str.equals("B") )
        	score[i] = 3.0;
         else if( str.equals("C") )
            score[i] = 2.0;
         else if( str.equals("D") )
            score[i] = 1.0;
         else if( str.equals("F") ) 
            score[i] = 0.0;
         
         sum += score[i];				// ������ �� ��
      }
      
      System.out.print(sum/grade.size());
      
      scanner.close();
   } 
} 