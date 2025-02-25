package calculator.enums;

public enum ErrorMessage {

    INVALID_INPUT_NOT_INTEGER("[ERROR] 입력에 숫자가 아닌 것이 포함되어 있습니다."),
    INVALID_INPUT_NOT_OPERATOR("[ERROR] 입력에 연산자가 아닌 것이 포함되어 있습니다.");


    private String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
