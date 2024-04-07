package model;

public class Race {
    private String[] carNames;
    private int raceCount;

    public Race(String[] carNames, int raceCount) {
        this.carNames = carNames;
        this.raceCount = raceCount;
    }

    public String[] getCarNames() {
        return carNames;
    }

    public int getRaceCount() {
        return raceCount;
    }
}
