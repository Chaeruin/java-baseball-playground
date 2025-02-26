package baseball.utils;

import baseball.enums.ErrorMessage;

public class InputValidator {

    public static boolean isNumeric(String input) {
        for (int i = 0; i < input.length(); i++) {
            isDigit(input, i);
        }
        return true;
    }

    public static void isDigit(String input, int i) {
        if (!Character.isDigit(input.charAt(i))) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_ERROR_NOT_NUMERIC.getErrorMessage());
        }
    }

    public static boolean isThreeNumber(String input) {
        if (isNumeric(input) && input.length() != 3) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_ERROR_NOT_THREE_NUMBER.getErrorMessage());
        }
        return true;
    }

    public static boolean isNotDuplicate(String input) {
        int first = input.charAt(0) - '0';
        int second = input.charAt(1) - '0';
        int third = input.charAt(2) - '0';
        return !(first == second || first == third || second == third);
    }

}
