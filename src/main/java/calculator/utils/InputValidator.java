package calculator.utils;

import calculator.enums.ErrorMessage;

public class InputValidator {

    public static boolean isOkParseToIntAndSplit(String input) {
        String[] inputSplit = input.split("");
        for (int i = 0; i < inputSplit.length; i+=2) {
            try {
                Integer.parseInt(inputSplit[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_NOT_INTEGER.getErrorMessage());
            }
        }
        return true;
    }

    public static boolean isOperator(String input) {
        String[] inputSplit = input.split("");
        for (int i = 1; i < inputSplit.length; i+=2) {
            if (!(inputSplit[i].equals("+") || inputSplit[i].equals("-") || inputSplit[i].equals("/") ||
                    inputSplit[i].equals("*"))) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_NOT_OPERATOR.getErrorMessage());
            }
        }
        return true;
    }


}
