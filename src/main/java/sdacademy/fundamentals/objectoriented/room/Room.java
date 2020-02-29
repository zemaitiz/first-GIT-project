package sdacademy.fundamentals.objectoriented.room;

public class Room {
    private int width;
    private int lentgth;

    public Room (int width, int height) {
        this.width = width;
        this.lentgth = height;
    }

    public int getWidth() {
        return width;
    }

    public int getLentgth() {
        return lentgth;
    }
}
