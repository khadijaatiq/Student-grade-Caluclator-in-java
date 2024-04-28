import java.util.*;
public class Grades {

    static {
        System.out.println("If marks are greater than 100 or less than 0 they will be considered as 0");
        System.out.println("input marks carefully");
    }

    public static void main(String[] args) {
        int subjects, sum=0;
        double average=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        subjects=sc.nextInt();
        int [ ] grades = new int [subjects];
        for (int i =0; i<subjects; i++){
            System.out.println("Enter the marks of subject " + i+1);
            grades[i] = sc.nextInt();
            if (grades[i]<0 || grades[i]>100){
                grades[i] = 0;
            }
            sum+=grades[i];
        }
        System.out.println("Total marks: " + sum);
        average = sum/subjects;
        System.out.println("Average: " + average);
        if (average>=80 && average<=100){
            System.out.println("Grade: A+");
        }else if (average>=70 && average<=79){
            System.out.println("Grade: A");
        }else if (average>=60 && average<=69){
            System.out.println("Grade: B");
        }else if (average>=50 && average<=59){
            System.out.println("Grade: D");
        }else {
            System.out.println("Grade: F");
        }
    }

}
