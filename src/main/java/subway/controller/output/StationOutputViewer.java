package subway.controller.output;

public class StationOutputViewer {
    private static final String MESSAGE_ENTER = "\n";
    private static final String MESSAGE_STATION_DISPLAY_HEAD = "## 역 관리 화면";
    private static final String MESSAGE_REGISTER_STATION = "1. 역 등록";
    private static final String MESSAGE_DELETE_STATION = "2. 역 삭제";
    private static final String MESSAGE_SEARCH_STATION = "3. 역 조회";
    private static final String MESSAGE_BACK = "B. 돌아가기";
    private static final String ERROR_PREFIX_MESSAGE = "[ERROR] ";
    private static final String MESSAGE_SHORT_NAME_LEN = "이력 길이가 짧습니다.";
    private static final String INFO_PREFIX_MESSAGE = "[INFO] ";
    private static final String SUCCESS_STATION_INPUT_MESSAGE = "지하철 역이 등록 되었습니다.";
    private static final String MESSAGE_FOR_INSERTING_STATION_NAME = "## 등록할 역 이름을 입력하세요.";
    private static final String MESSAGE_FOR_DELETING_STATION_NAME = "## 삭제할 역 이름을 입력하세요.";
    private static final String MESSAGE_SUCCESS_DELETE_STATION_NAME = "지하철 역이 삭제되었습니다.";
    private static final String MESSAGE_NON_EXISIT_STATION_NAME = "등록되지 않은 역 이름입니다.";

    public void printStationDisplay() {
        System.out.println(MESSAGE_STATION_DISPLAY_HEAD + MESSAGE_ENTER +
                MESSAGE_REGISTER_STATION + MESSAGE_ENTER +
                MESSAGE_DELETE_STATION + MESSAGE_ENTER +
                MESSAGE_SEARCH_STATION + MESSAGE_ENTER +
                MESSAGE_BACK + MESSAGE_ENTER);
    }

    public void printShortStationNameLenMessage() {
        System.out.println(ERROR_PREFIX_MESSAGE + MESSAGE_SHORT_NAME_LEN);
    }

    public void printSuccessStationName() {
        System.out.println(MESSAGE_ENTER + INFO_PREFIX_MESSAGE + SUCCESS_STATION_INPUT_MESSAGE + MESSAGE_ENTER);
    }

    public void printReuqestStationName() {
        System.out.println(MESSAGE_ENTER + MESSAGE_FOR_INSERTING_STATION_NAME);
    }

    public void printDeleteStationName() {
        System.out.println(MESSAGE_ENTER + MESSAGE_FOR_DELETING_STATION_NAME);
    }

    public void printDeleteSuccessMessage() {
        System.out.println(INFO_PREFIX_MESSAGE + MESSAGE_SUCCESS_DELETE_STATION_NAME);
    }

    public void printErrorCuzNonExisitStationName() {
        System.out.println(MESSAGE_ENTER + ERROR_PREFIX_MESSAGE + MESSAGE_NON_EXISIT_STATION_NAME + MESSAGE_ENTER);
    }
}
