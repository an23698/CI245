package Chapter9;

import Chapter9.HW3_FanClass.Fan;

public class HW3_FanClass2 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1 toString: " + fan1);
        System.out.println("Fan 2 toString: " + fan2);
    }
}
