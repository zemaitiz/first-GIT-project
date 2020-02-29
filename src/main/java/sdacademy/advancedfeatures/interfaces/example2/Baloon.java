package sdacademy.advancedfeatures.interfaces.example2;

import java.util.Random;

public class Baloon extends AirTransport implements Fly {


    public Baloon(int speed) {
        super(speed);
    }

    @Override
    public int maxSpeed() {
        return 100 / super.getSpeed() * new Random().nextInt();
    }

    @Override
    public boolean canFly(String condition) {
        return condition.equals("good");
    }


}

