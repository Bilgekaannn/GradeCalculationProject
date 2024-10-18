import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        if (grade>90 && grade<=100){
            System.out.println("Grade:A");
        } else if (grade>= 80) {
            System.out.println("Grade:B");
        } else if (grade>=70){
            System.out.println("Grade:C");
        } else if (grade>=60){
            System.out.println("Grade:D");
        } else if (grade>=0){
            System.out.println("Grade:F");
        }else{
            System.out.println("Invalid grade");
        }

        scanner.close();


    }
}