package application;

public class Day57_JavaSingletonPattern {
    private Day57_JavaSingletonPattern() {}
    public String str;
    private static Day57_JavaSingletonPattern instance = null;
    public static Day57_JavaSingletonPattern getSingleInstance() {
        if (instance == null) {
            instance = new Day57_JavaSingletonPattern();
        }
        return instance;
    }
}
