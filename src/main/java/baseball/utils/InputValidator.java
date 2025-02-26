package baseball.utils;

import baseball.enums.ErrorMessage;

public class InputValidator {

    public boolean isNumeric(String input) {
        for (int i = 0; i < input.length(); i++) {
            isDigit(input, i);
        }
        return true;
    }

    public void isDigit(String input, int i) {
        if (!Character.isDigit(input.charAt(i))) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_ERROR_NOT_NUMERIC.getErrorMessage());
        }
    }

    public boolean isThreeNumber(String input) {
        if (isNumeric(input) && input.length() != 3) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_ERROR_NOT_THREE_NUMBER.getErrorMessage());
        }
        return true;
    }

}
