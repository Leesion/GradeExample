public class GradingTest2{
	public static void main(String[] args){
		
		int student_solution[][] = { 
			{1,3,2,4,3,1,4,2,2,1},
			{3,2,4,2,2,1,1,3,4,1},
			{2,4,3,2,1,2,1,3,3,4},
			{2,3,3,1,1,3,2,2,4,4},
			{3,1,1,2,4,1,2,3,1,3}
						
		};
		
		System.out.println("시작합니다.");
		
		double  student[] = new double[5];
		double score[] = {8.5, 11.5, 9.2, 10.8, 7.5, 12.5, 8.3, 11.7, 8.7, 11.3};
		int solution[] = new int[10];
		
		for(int i=0; i<10; i++){
			solution[i] = Integer.parseInt(args[i]);
		}
		
		for(int j=0; j<5; j++){
			for(int k=0; k<10; k++){
				if(student_solution[j][k] == solution[k]){
					student[j] += score[k];
				}
			}
			System.out.println("학생" + (j+1) + "의 점수 " + student[j]+"점");
		}
		System.out.println("끝납니다.");
    }
}
