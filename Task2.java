package codesoft;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths=80;
		int english=70;
		int physics=60;
		int chemistry=90;
		int biology=80;
		
		double totalmark=500.0;
		
		int sum_of_all_subjects= maths+english+physics+chemistry+biology;
		
		System.out.println("the total marks obtained by the student"+sum_of_all_subjects);
		//2
		double avgPercentage=(sum_of_all_subjects/totalmark)*100;
		
		System.out.println("average percentage is "+avgPercentage +"%");
		
		if(avgPercentage>=90) {
			System.out.println("grade is O");
		}
		else if(avgPercentage>=80 && avgPercentage<90) {
			System.out.println("grade is a");
		}
		else if(avgPercentage>=70 && avgPercentage<80) {
			System.out.println("grade is b");
		}
		else if(avgPercentage>=60 && avgPercentage<70) {
			System.out.println("grade is c");
		}
		else if(avgPercentage>=50 && avgPercentage<60) {
			System.out.println("grade is d");
		}
		else if(avgPercentage>=40 && avgPercentage<50) {
			System.out.println("grade is e");
		}
		else if (avgPercentage<40){
			System.out.println("grade f");
		}
	}

}
