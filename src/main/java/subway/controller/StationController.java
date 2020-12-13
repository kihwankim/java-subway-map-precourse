package subway.controller;

import subway.controller.input.StationInputViewer;
import subway.controller.output.CommonOutputViewer;
import subway.controller.output.StationOutputViewer;
import subway.domain.StationFlag;

import java.util.Scanner;

public class StationController {
    private final StationInputViewer stationInputViewer;
    private final StationOutputViewer stationOutputViewer;

    public StationController(final Scanner scanner) {
        this.stationInputViewer = new StationInputViewer(scanner);
        this.stationOutputViewer = new StationOutputViewer();
    }

    public void runStationManagingController() {
        StationFlag stationFlag = null;
        while (stationFlag != StationFlag.BACK) {
            this.stationOutputViewer.printStationDisplay();
            CommonOutputViewer.printInputFlagDataMessage();
            stationFlag = this.handlerStationFlag();
        }
    }

    private StationFlag handlerStationFlag() {
        while (true) {
            try {
                return StationFlag.findByStationFlag(this.stationInputViewer.inputStationFlag());
            } catch (IllegalArgumentException exception) {
                CommonOutputViewer.printErrorIvalidInput();
            }
        }
    }
}
