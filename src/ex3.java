import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.printf("당신의 점수를 입력해주세요");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score > 90) {
            grade = 'A';
            if(score >=95) {
                opt = '+';
            } else {
                opt = '-';
            }

        }else{
            grade = 'B';

        }
        System.out.printf("당신의 점수는 %d이며 학점은 %c%c입니다", score, opt, grade);




    }
}
