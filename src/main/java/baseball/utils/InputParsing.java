package baseball.utils;

import baseball.domain.Numbers;

public class InputParsing {

    public Numbers parseNumbers(String input) {
        if (InputValidator.isThreeNumber(input)) {
            String[] inputs = input.split("");
            int first = Integer.parseInt(inputs[0]);
            int second = Integer.parseInt(inputs[1]);
            int third = Integer.parseInt(inputs[2]);
            return new Numbers(first, second, third);
        }
        return null;
    }
}
