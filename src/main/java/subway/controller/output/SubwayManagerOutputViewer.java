package subway.controller.output;

public class SubwayManagerOutputViewer {
    private static final String MESSAGE_ENTER = "\n";
    private static final String MESSAGE_MAIN_DISPLAY_HEAD = "## 메인 화면";
    private static final String MESSAGE_STATION_MANAGEMENT_FLAG = "1. 역 관리";
    private static final String MESSAGE_LINE_MANAGEMENT_FLAG = "2. 노선 관리";
    private static final String MESSAGE_INTERVAL_MANAGEMENT_FLAG = "3. 구간 관리";
    private static final String MESSAGE_QUIT_FLAG = "Q. 종료";

    public void printMainDisplayMessage() {
        StringBuilder mainDisplayChoosingDashboardPrintMessage = new StringBuilder();
        mainDisplayChoosingDashboardPrintMessage.append(MESSAGE_MAIN_DISPLAY_HEAD).append(MESSAGE_ENTER)
                .append(MESSAGE_STATION_MANAGEMENT_FLAG).append(MESSAGE_ENTER)
                .append(MESSAGE_LINE_MANAGEMENT_FLAG).append(MESSAGE_ENTER)
                .append(MESSAGE_INTERVAL_MANAGEMENT_FLAG).append(MESSAGE_ENTER)
                .append(MESSAGE_QUIT_FLAG).append(MESSAGE_ENTER);
        System.out.println(mainDisplayChoosingDashboardPrintMessage.toString());
    }
}
