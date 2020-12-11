package subway;

import subway.controller.SubwayManagerController;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        new SubwayManagerController(scanner).runSubwayManager();
    }
}
