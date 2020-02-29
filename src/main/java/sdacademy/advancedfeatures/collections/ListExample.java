package sdacademy.advancedfeatures.collections;

import java.util.ArrayList;

import java.util.List;


public class ListExample {

    public static void main(String[] args) {
        List<String> travelRoute = new ArrayList<>();
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
