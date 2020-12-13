package subway.controller.output;

public class StationOutputViewer {
    private static final String MESSAGE_ENTER = "\n";
    private static final String MESSAGE_STATION_DISPLAY_HEAD = "## 역 관리 화면";
    private static final String MESSAGE_REGISTER_STATION = "1. 역 등록";
    private static final String MESSAGE_DELETE_STATION = "2. 역 삭제";
    private static final String MESSAGE_SEARCH_STATION = "3. 역 조회";
    private static final String MESSAGE_BACK = "B. 돌아가기";

    public void printStationDisplay() {
        System.out.println(MESSAGE_STATION_DISPLAY_HEAD + MESSAGE_ENTER +
                MESSAGE_REGISTER_STATION + MESSAGE_ENTER +
                MESSAGE_DELETE_STATION + MESSAGE_ENTER +
                MESSAGE_SEARCH_STATION + MESSAGE_ENTER +
                MESSAGE_BACK + MESSAGE_ENTER);
    }
}
