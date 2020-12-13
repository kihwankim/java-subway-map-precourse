package subway.controller.output;

public class CommonOutputViewer {
    private static final String MESSAGE_INPUT_FALG = "## 원하는 기능을 선택하세요.";
    private static final String ERROR_MESSAGE_PREFIX = "[ERROR] ";
    private static final String ERROR_INVALID_INPUT_DATA_MESSAGE = "선택할 수 없는 기능입니다.";

    public static void printInputFlagDataMessage() {
        System.out.println(MESSAGE_INPUT_FALG);
    }

    public static void printErrorIvalidInput() {
        System.out.println(ERROR_MESSAGE_PREFIX + ERROR_INVALID_INPUT_DATA_MESSAGE);
    }
}
