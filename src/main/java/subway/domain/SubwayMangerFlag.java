package subway.domain;

import java.util.Arrays;

public enum SubwayMangerFlag {
    STATION_MANAGE("1"), LINE_MANAGE("2"), SECTION_MANAGE("3"), ALL_PRINT("4"), QUIT("Q");

    private final String flag;

    SubwayMangerFlag(String flag) {
        this.flag = flag;
    }

    private String getFlag() {
        return this.flag;
    }

    public static SubwayMangerFlag findByFlagCode(String flagCode) {
        return Arrays.stream(SubwayMangerFlag.values())
                .filter(subwayMangerFlag -> subwayMangerFlag.getFlag().equals(flagCode))
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
    }
}
