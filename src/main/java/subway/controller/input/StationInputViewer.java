package subway.controller.input;

import java.util.Scanner;

public class StationInputViewer {
    private final Scanner scanner;

    public StationInputViewer(final Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputStationFlag() {
        return scanner.nextLine().trim();
    }
}
