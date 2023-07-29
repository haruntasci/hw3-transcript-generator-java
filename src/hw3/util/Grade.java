package hw3.util;

public enum Grade {
    A("A", 4),
    B("B", 3),
    C("C", 2),
    D("D", 1),
    F("F", 0);

    private final String stringValue;
    private final int numericValue;

    public String getStringValue() {
        return stringValue;
    }

    public int getNumericValue() {
        return numericValue;
    }

    Grade(String str, int num) {
        stringValue = str;
        numericValue = num;
    }

    @Override
    public String toString() {
        return "Grade " + stringValue + " corresponds to numeric grade " + numericValue;
    }
}
