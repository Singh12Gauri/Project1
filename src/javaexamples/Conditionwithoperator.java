package javaexamples;

public class Conditionwithoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks=55;
		if (marks<35) {
		System.out.println("Student is fail and got " + marks);
		}
		else if (marks >=35 && marks<50) {
		System.out.println("Student is pass " +marks);
		}
		else if(marks>=50 && marks<60){
		System.out.println("Student got second class " +marks);
		}
		else {
			System.out.println("Student got first class " +marks);
		}
	
		int mark=55;
		if (mark<35) {
		System.out.println("Student is fail and got " + mark);
		}
		else if (mark >=35 || mark<50) {
		System.out.println("Student is pass " +mark);
		}
		else if(mark>=50 && mark<60){
		System.out.println("Student got second class " +mark);
		}
		else {
			System.out.println("Student got first class " +mark);
		}
	}
}
		
		
	

	
