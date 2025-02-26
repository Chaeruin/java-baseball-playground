package baseball.enums;

public enum ErrorMessage {
    INPUT_ERROR_NOT_NUMERIC("[ERROR] 숫자가 아닌 입력이 존재합니다."),

    INPUT_ERROR_NOT_THREE_NUMBER("[ERROR] 3자리 숫자가 아닙니다.");

    private String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
