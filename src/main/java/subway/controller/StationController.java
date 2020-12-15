package subway.controller;

import subway.controller.input.StationInputViewer;
import subway.controller.output.CommonOutputViewer;
import subway.controller.output.StationOutputViewer;
import subway.domain.Station;
import subway.domain.StationFlag;
import subway.repository.StationRepository;

import java.util.Scanner;

public class StationController {
    private final StationInputViewer stationInputViewer;
    private final StationOutputViewer stationOutputViewer;

    public StationController(final Scanner scanner) {
        this.stationInputViewer = new StationInputViewer(scanner);
        this.stationOutputViewer = new StationOutputViewer();
    }

    public void runStationManagingController() {
        this.stationOutputViewer.printStationDisplay();
        CommonOutputViewer.printInputFlagDataMessage();
        StationFlag stationFlag = this.handlerStationFlag();
        this.runEachStationWork(stationFlag);
    }

    private void runEachStationWork(StationFlag stationFlag) {
        if (stationFlag == StationFlag.REGISTER) {
            StationRepository.addStation(this.handlerMakingStation());
            this.stationOutputViewer.printSuccessStationName();
        }
    }

    private Station handlerMakingStation() {
        while (true) {
            try {
                stationOutputViewer.printReuqestStationName();
                return new Station(this.stationInputViewer.inputStationName());
            } catch (IllegalArgumentException exception) {
                this.stationOutputViewer.printShortStationNameLenMessage();
            }
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
