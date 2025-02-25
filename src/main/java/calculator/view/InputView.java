package calculator.view;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public String getInput() {
        System.out.println("연산할 문자열을 입력하시오 (숫자만, 구분자는 쉼표 (띄어쓰기 금지))");
        return scanner.nextLine();
    }
}
