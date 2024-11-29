import enums.Items;
import enums.Places;
import object.*;
import util.*;
//Radiant(Pudge, Monkey King, Spirit Breaker, Kez, Hoodwink)
//dire(Crystal Maiden, Lina, Luna, AntiMage, Shadow Shaman)
/*
Мк дает SS с мида, что ЦМ gang нижний лайн.
Команда radiant начинает стягиваться на нижний лайн
Пудж хукнул ее.
Команда пуджа замерзла из-за аганимного ультимейта цм.
Dire внимательно смотрели как умирает команда radiant.
Пудж начал хавать Цм.
Spirit breaker дал сыр Pudge, но сам погиб.
Шаман застилил крипа у ам.
Ам сломал ПТ.
Прошло время...
Цм возрадилась и заметила что у нее много голды.
Цм купила сестрам по муншарду.
Time = 40min, Ам купил бф => цм сломала шмотки.
*/

public class Main {
    public static void main(String[] args) {
        CrystalMaiden crystalMaiden = new CrystalMaiden(
                "Crystal Maiden",
                Places.MID_LINE,
                1250,
                54
        );
        Lina lina = new Lina(
                "Lina",
                Places.TAVERN,
                2000,
                59
        );
        Luna luna = new Luna(
                "Luna",
                Places.TOP_LINE,
                2900,
                56
        );
        AntiMage antiMage = new AntiMage(
                "AntiMage",
                Places.FOREST,
                2200,
                57
        );
        ShadowShaman shadowShaman = new ShadowShaman(
                "Shadow Shaman",
                Places.FOREST,
                2400,
                72
        );
        Pudge pudge = new Pudge("Pudge",
                Places.BOTTOM_LINE,
                3000,
                76
        );
        SpiritBreaker spiritBreaker = new SpiritBreaker(
                "Spirit Breaker",
                Places.TOP_LINE,
                2810,
                69
        );
        MonkeyKing monkeyKing = new MonkeyKing(
                "Monkey King",
                Places.MID_LINE,
                2400,
                57
        );
        Kez kez = new Kez(
                "Kez",
                Places.FOREST,
                2600,
                55
        );
        Hoodwink hoodwink = new Hoodwink(
                "Hoodwink",
                Places.BOTTOM_LINE,
                2450,
                53
        );
        Creep koboldForeman = new Creep(
                400,
                21
        );

        Hero[] dire = {crystalMaiden, lina, luna, antiMage, shadowShaman};
        Hero[] radiant = {pudge, monkeyKing, kez, hoodwink, spiritBreaker};
        Hero[] characters = {crystalMaiden, lina, luna, antiMage, shadowShaman, pudge, monkeyKing, kez, hoodwink, spiritBreaker};

        crystalMaiden.go(Places.BOTTOM_LINE);
        monkeyKing.miss(crystalMaiden);
        pudge.meatHook(crystalMaiden);
        spiritBreaker.go(Places.BOTTOM_LINE);
        kez.go(Places.BOTTOM_LINE);
        crystalMaiden.freezingField(radiant);
        spiritBreaker.UseCheese(pudge);
        crystalMaiden.frostbite(spiritBreaker);
        pudge.dismember(crystalMaiden);
        shadowShaman.farm(koboldForeman);
        antiMage.brokenItem(Items.POWER_TREADS);
        Maps.MapTimeSkip(characters, 9);
        System.out.println("crystalMaiden has " + crystalMaiden.getGold() + " gold");
        crystalMaiden.buyFor(Items.MOONSHARD, lina);
        crystalMaiden.buyFor(Items.MOONSHARD, luna);
        Maps.MapTimeSkip(characters, 1);
        if (Maps.getTime() == 40) {
            antiMage.buy(Items.BATTLE_FURY);
            crystalMaiden.brokenItems();
        }
    }
}