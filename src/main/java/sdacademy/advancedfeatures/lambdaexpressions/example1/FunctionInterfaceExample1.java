package sdacademy.advancedfeatures.lambdaexpressions.example1;

import java.util.function.Predicate;

public class FunctionInterfaceExample1 {

    public static void main(String[] args) {
        Runnable myRunnable = () -> System.out.println("Running a runnable");
        myRunnable.run();
// Predicate - salyga, kuri grazina true arba false, priklausomai nuo paduotu parametru.
        Predicate<String> startWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startWithABCTest.test("ABCDEF"));
    }

}
