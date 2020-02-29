package sdacademy.advancedfeatures.generics.excercises.excercise2;

import java.util.List;

public class Generic {

    public static <T> T lastListItem(List<T> list) {
 return list.get(list.size() - 1);
    }
}
