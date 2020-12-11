package subway.controller.input;

import java.util.Scanner;

public class SubwayManagerInputViewer {
    private final Scanner scanner;

    public SubwayManagerInputViewer(final Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputMainSubwayManagerFlagStr() {
        return scanner.nextLine().trim();
    }
}
