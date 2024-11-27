package Util;

import Object.Persons;

public class Maps {
    public static void MapTimeSkip(Persons[] persons, int n) {
        for (var i = 0; i < 5; i++){
            persons[i].skipTime(n);
            if (persons[i].isDie()){
                persons[i].revive();
            }
        }
    }
}
