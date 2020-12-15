package subway.domain;

public class Station {
    private String name;

    public Station(String name) {
        if (2 > name.length()) {
            throw new IllegalArgumentException();
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
