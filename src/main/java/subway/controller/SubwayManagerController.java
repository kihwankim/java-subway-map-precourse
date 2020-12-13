package subway.controller;

import subway.controller.input.SubwayManagerInputViewer;
import subway.controller.output.CommonOutputViewer;
import subway.controller.output.SubwayManagerOutputViewer;
import subway.domain.SubwayMangerFlag;

import java.util.Scanner;

public class SubwayManagerController {
    private final SubwayManagerInputViewer subwayManagerInputViewer;
    private final SubwayManagerOutputViewer subwayManagerOutputViewer;
    private final StationController stationController;

    public SubwayManagerController(final Scanner scanner) {
        this.subwayManagerInputViewer = new SubwayManagerInputViewer(scanner);
        this.subwayManagerOutputViewer = new SubwayManagerOutputViewer();
        this.stationController = new StationController(scanner);
    }

    public void runSubwayManager() {
        SubwayMangerFlag subwayMangerFlag = null;
        while (subwayMangerFlag != SubwayMangerFlag.QUIT) {
            this.subwayManagerOutputViewer.printMainDisplayMessage();
            CommonOutputViewer.printInputFlagDataMessage();
            subwayMangerFlag = this.handlerSubwayMangerFlag();
            this.controlEachWork(subwayMangerFlag);
        }
    }

    private void controlEachWork(SubwayMangerFlag subwayMangerFlag) {
        if (subwayMangerFlag == SubwayMangerFlag.STATION_MANAGE) {
            this.stationController.runStationManagingController();
        }
    }

    private SubwayMangerFlag handlerSubwayMangerFlag() {
        while (true) {
            try {
                return SubwayMangerFlag.findByFlagCode(this.subwayManagerInputViewer.inputMainSubwayManagerFlagStr());
            } catch (IllegalArgumentException illegalArgumentException) {
                CommonOutputViewer.printErrorIvalidInput();
            }
        }
    }
}
