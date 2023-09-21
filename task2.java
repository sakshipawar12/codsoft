import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class task2 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int totalsubjects, totalmarks =0;

        System.out.println("enter the total number of subjects: ");
        totalsubjects = scanner.nextInt();

        for (int i= 1; i<=totalsubjects; i++) {
            System.out.println("enter marks obtained in subject " + i  + "(out of 100);");
            int marks =scanner.nextInt();
            totalmarks+=marks;
        }

        double averagePercentage=((double)totalmarks/(totalsubjects  * 100))* 100;

        char grade;

        if(averagePercentage >=90){
            grade ='A';
        }else if (averagePercentage >=80){
            grade='B';
        }else if (averagePercentage >=70){
            grade='C';
        }else if (averagePercentage >=60){
            grade='D';
        }else if (averagePercentage >=50){
            grade='E';
        }else{
            grade='F';
        }
        System.out.println("\nResult:");
        System.out.println("total marks: " + totalmarks);
        System.out.println("average percentage: " + averagePercentage + "%");
        System.out.println("grade:" + grade);

        scanner.close();
    }
   
}
