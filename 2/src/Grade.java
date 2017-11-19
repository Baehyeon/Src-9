import java.util.*; 

public class Grade { 
   public static void main(String[] args) { 
	  Scanner scanner = new Scanner(System.in); 
      ArrayList<String> grade =  new ArrayList<String>(); 
      
      System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) "); 
      
      for(int i=0 ; i<6 ; i++) { 		// 학점을 입력받음
         grade.add( scanner.next() ); 
      } 
      
      double score[] = new double[6];	// 학점을 넣을 배열 생성
      double sum = 0;
      
      for(int i=0 ; i<grade.size() ; i++) { 
         String str = grade.get(i);		// 학점을 받아옴 
         
         if( str.equals("A") )			// A~F 학점일 때의 점수
            score[i] = 4.0; 
         else if( str.equals("B") )
        	score[i] = 3.0;
         else if( str.equals("C") )
            score[i] = 2.0;
         else if( str.equals("D") )
            score[i] = 1.0;
         else if( str.equals("F") ) 
            score[i] = 0.0;
         
         sum += score[i];				// 학점의 총 합
      }
      
      System.out.print(sum/grade.size());
      
      scanner.close();
   } 
} 