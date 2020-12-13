package subway.domain;

import java.util.Arrays;

public enum StationFlag {
    REGISTER("1"), DELETE("2"), SEARCH("3"), BACK("B");

    private final String flag;

    StationFlag(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return this.flag;
    }

    public static StationFlag findByStationFlag(String flag) {
        return Arrays.stream(StationFlag.values())
                .filter(stationFlag -> stationFlag.getFlag().equals(flag))
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
    }
}
