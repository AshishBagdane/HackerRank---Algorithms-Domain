package algorithms.implementation.easy;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuffer output = new StringBuffer();
        while(N-- != 0) {
            int grade = sc.nextInt();
            output.append(getFinalGrade(grade)).append('\n');
        }
        sc.close();
        System.out.println(output);
    }
    
    static int getFinalGrade(int grade) {
        if(grade < 38) {
            return grade;
        }else{
            int multipleOfFive = getMultipleOfFive(grade);
            if((multipleOfFive - grade) < 3) {
                return multipleOfFive;
            }else{
                return grade;
            }
        }
    }
    
    static int getMultipleOfFive(int grade) {
        while(grade % 5 != 0) {
            grade++;
        }
        return grade;
    }
}
