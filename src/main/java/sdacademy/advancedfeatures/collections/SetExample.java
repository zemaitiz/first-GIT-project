package sdacademy.advancedfeatures.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> travelRoute = new HashSet<>();
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("London");
        travelRoute.add("Paris");
        travelRoute.add("Karmelava");
        travelRoute.add("London");
        travelRoute.remove("London");

        for (String city : travelRoute) {
            System.out.println(city);
        }
    }
}
