package sdacademy.advancedfeatures.generics.excercises.excercise1;

import java.util.ArrayList;
import java.util.List;

public class Generic<T> {
    private List<T> list;

    Generic() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void storeValue(T value) {
        list.add(value);
    }
}


