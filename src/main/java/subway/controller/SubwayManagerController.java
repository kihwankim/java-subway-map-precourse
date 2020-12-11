package subway.controller;

import subway.controller.input.SubwayManagerInputViewer;
import subway.controller.output.CommonOutputViewer;
import subway.controller.output.SubwayManagerOutputViewer;
import subway.domain.SubwayMangerFlag;

import java.util.Scanner;

public class SubwayManagerController {
    private final SubwayManagerInputViewer subwayManagerInputViewer;
    private final SubwayManagerOutputViewer subwayManagerOutputViewer;

    public SubwayManagerController(final Scanner scanner) {
        this.subwayManagerInputViewer = new SubwayManagerInputViewer(scanner);
        this.subwayManagerOutputViewer = new SubwayManagerOutputViewer();
    }

    public void runSubwayManager() {
        SubwayMangerFlag subwayMangerFlag = null;
        while (subwayMangerFlag != SubwayMangerFlag.QUIT) {
            this.subwayManagerOutputViewer.printMainDisplayMessage();
            CommonOutputViewer.printInputFlagDataMessage();
            subwayMangerFlag = SubwayMangerFlag.findByFlagCode(this.subwayManagerInputViewer.inputMainSubwayManagerFlagStr());
        }
    }
}
