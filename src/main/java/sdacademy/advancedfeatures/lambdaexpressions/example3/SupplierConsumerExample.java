package sdacademy.advancedfeatures.lambdaexpressions.example3;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierConsumerExample {

    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> new Random().nextInt();
        int randomNumber = randomSupplier.get();
        System.out.println(randomNumber);

        Consumer<Double> printWithPrefixConsumer = d -> System.out.println("Value" + d);
        printWithPrefixConsumer.accept(10.5);
    }
}
