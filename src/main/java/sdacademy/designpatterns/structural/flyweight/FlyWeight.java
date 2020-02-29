package sdacademy.designpatterns.structural.flyweight;

import java.awt.Color;
import java.util.Random;

public class FlyWeight {
    private static final int CANVAS_SIZE = 5000;
    private static final int TREES_TO_DRAW = 1000000;
    private static final int TREE_TYPE = 5;

    public static void main(String[] args) {
        Random random = new Random();
        Forest forest = new Forest();

        drawForest(random, forest);
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        printMemoryUsage();
    }

    private static void drawForest(Random random, Forest forest) {
        for(int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPE); i++) {
            forest.plantTree(random.nextInt(CANVAS_SIZE), random.nextInt(CANVAS_SIZE), "Summer oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random.nextInt(CANVAS_SIZE), random.nextInt(CANVAS_SIZE), "Autumn oak", Color.ORANGE, "Autumn oak texture stub");
            forest.plantTree(random.nextInt(CANVAS_SIZE), random.nextInt(CANVAS_SIZE), "Sunflower", Color.YELLOW, "xzzzzzz");
            forest.plantTree(random.nextInt(CANVAS_SIZE), random.nextInt(CANVAS_SIZE), "Tomato", Color.RED, "xzz");
            forest.plantTree(random.nextInt(CANVAS_SIZE), random.nextInt(CANVAS_SIZE), "Blueberry", Color.BLUE, "xz");

        }
    }

    private static void printMemoryUsage() {
        System.out.println(TREES_TO_DRAW + " trees to draw");
        System.out.println("------------------------------");
        System.out.println("Memory usage: ");
        System.out.println("Tree size(8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size(~30 bytes) * " + TREE_TYPE + "");
        System.out.println("------------------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPE * 30 / 1024 / 1024) + "MB (instead of " + (TREES_TO_DRAW * 38) / 1024 / 1024) + " MB");

    }
}
