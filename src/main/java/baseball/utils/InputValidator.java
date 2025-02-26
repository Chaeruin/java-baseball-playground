package baseball.utils;

public class InputValidator {

    public boolean isNumeric(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                throw new IllegalArgumentException();
            }
        }
        return true;
    }

}
