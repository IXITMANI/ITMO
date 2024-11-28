package util;

import object.Hero;

public class Maps {

    private static int time = 30;

    public static void MapTimeSkip(Hero[] hero, int n) {
        time += n;
        for (var i = 0; i < 5; i++) {
            if (hero[i].isDied()) {
                hero[i].revive();
            }
        }
    }

    public static int getTime() {
        return time;
    }
}
