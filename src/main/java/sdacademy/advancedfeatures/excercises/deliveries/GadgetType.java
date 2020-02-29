package sdacademy.advancedfeatures.excercises.deliveries;


import java.util.HashMap;
import java.util.Map;

public enum GadgetType {
    PHONE("telefonas"),
    LAPTOP("nesiojamas kompiuteris"),
    TV("televizorius"),
    PERSONAL_COMPUTER("stacionarus kompiuteris"),
    MICRO_CONTROLLER("mikro kontroleris");

    private final String name;
    private static final Map<String, GadgetType> enumByGadgetType = new HashMap<>();

    static {
        for (GadgetType enumValue : values()) {
            enumByGadgetType.put(enumValue.name, enumValue);
        }
    }

    GadgetType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
