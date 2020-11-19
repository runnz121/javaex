import java.sql.SQLOutput;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("숫자 입력하시오");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input ==0) {
            System.out.println("입력한 숫자는 0이다");

        }else {
            System.out.println("입력한 숫자는 0이 아니다");
        }

    }
}
