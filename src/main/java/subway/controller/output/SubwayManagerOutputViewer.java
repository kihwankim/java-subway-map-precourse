package subway.controller.output;

public class SubwayManagerOutputViewer {
    private static final String MESSAGE_ENTER = "\n";
    private static final String MESSAGE_MAIN_DISPLAY_HEAD = "## 메인 화면";
    private static final String MESSAGE_STATION_MANAGEMENT_FLAG = "1. 역 관리";
    private static final String MESSAGE_LINE_MANAGEMENT_FLAG = "2. 노선 관리";
    private static final String MESSAGE_INTERVAL_MANAGEMENT_FLAG = "3. 구간 관리";
    private static final String MESSAGE_PRINT_ALL_STATION_LINE_FLAG = "4. 지하철 노선도 출력";
    private static final String MESSAGE_QUIT_FLAG = "Q. 종료";
    private static final String ERROR_MESSAGE_PREFIX = "[ERROR] ";
    private static final String ERROR_INVALID_INPUT_DATA_MESSAGE = "선택할 수 없는 기능입니다.";

    public void printMainDisplayMessage() {
        StringBuilder mainDisplayChoosingDashboardPrintMessage = new StringBuilder();
        mainDisplayChoosingDashboardPrintMessage.append(MESSAGE_MAIN_DISPLAY_HEAD).append(MESSAGE_ENTER)
                .append(MESSAGE_STATION_MANAGEMENT_FLAG).append(MESSAGE_ENTER)
                .append(MESSAGE_LINE_MANAGEMENT_FLAG).append(MESSAGE_ENTER)
                .append(MESSAGE_INTERVAL_MANAGEMENT_FLAG).append(MESSAGE_ENTER)
                .append(MESSAGE_PRINT_ALL_STATION_LINE_FLAG).append(MESSAGE_ENTER)
                .append(MESSAGE_QUIT_FLAG).append(MESSAGE_ENTER);
        System.out.println(mainDisplayChoosingDashboardPrintMessage.toString());
    }

    public void printErrorIvalidInput() {
        System.out.println(ERROR_MESSAGE_PREFIX + ERROR_INVALID_INPUT_DATA_MESSAGE);
    }
}
