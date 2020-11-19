import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하시오");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';

        } else if (score >=80) {
            grade = 'b';

        } else if (score >=70) {
            grade = 'C';

        } else {
            grade = 'D';

        }
        System.out.println("당신의 학점은" + grade + " 입니다");


    }
}
