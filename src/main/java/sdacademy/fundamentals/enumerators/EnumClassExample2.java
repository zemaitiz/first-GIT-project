package sdacademy.fundamentals.enumerators;

public enum EnumClassExample2 {
    Audi(2, "A6", true),
    VW(3, "Golf", false),
    TOYOTA(2, "Avensis", true),
    BMW(5,"X5",false);


    private final int engineSize;
    private final String carName;
    private final boolean runAndDrive;

    EnumClassExample2(int engineSize, String carName, boolean runAndDrive) {
        this.engineSize = engineSize;
        this.carName = carName;
        this.runAndDrive = runAndDrive;
    }

    public int getEngineSize() {return engineSize;}
    public String getCarName() {return carName;}
    public boolean isRunAndDrive() {return runAndDrive;}
}


