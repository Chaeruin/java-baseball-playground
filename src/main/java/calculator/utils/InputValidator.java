package calculator.utils;

import calculator.enums.ErrorMessage;

public class InputValidator {

    public static boolean isOkToParseAndSplit(String input) {
        String[] inputSplit = input.split(",");
        for (int i = 0; i < inputSplit.length; i++) {
            try {
                Integer.parseInt(inputSplit[i]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_NOT_INTEGER.getErrorMessage());
            }
        }
        return true;
    }


}
