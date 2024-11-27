import Enums.Items;
import Enums.Places;
import Object.*;
import Util.*;
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
        CrystalMaiden crystalMaiden = new CrystalMaiden("Crystal Maiden", Places.MidLine, 1250);
        Lina lina = new Lina("Lina", Places.Tavern, 2000);
        Luna luna = new Luna("Luna", Places.TopLine, 2900);
        AntiMage antiMage = new AntiMage("AntiMage", Places.Forest, 2200);
        ShadowShaman shadowShaman = new ShadowShaman("Shadow Shaman", Places.Forest, 2400);
        Pudge pudge = new Pudge("Pudge", Places.BottomLine, 3000);
        SpiritBreaker spiritBreaker = new SpiritBreaker("Spirit Breaker", Places.TopLine, 2810);
        MonkeyKing monkeyKing = new MonkeyKing("Monkey King", Places.MidLine, 2400);
        Kez kez = new Kez("Kez", Places.Forest, 2600);
        Hoodwink hoodwink = new Hoodwink("Hoodwink", Places.BottomLine, 2450);

        Persons[] dire = {crystalMaiden, lina, luna, antiMage, shadowShaman};
        Persons[] radiant = {pudge, monkeyKing, kez, hoodwink, spiritBreaker};
        Persons[] characters = {crystalMaiden, lina, luna, antiMage, shadowShaman, pudge, monkeyKing, kez, hoodwink, spiritBreaker};

        crystalMaiden.go(Places.BottomLine);
        monkeyKing.miss(crystalMaiden);
        monkeyKing.go(Places.BottomLine);
        pudge.MeatHook(crystalMaiden);
        spiritBreaker.go(Places.BottomLine);
        kez.go(Places.BottomLine);
        crystalMaiden.FreezingField(radiant);
        spiritBreaker.UseCheese(pudge);
        crystalMaiden.Frostbite(spiritBreaker);
        pudge.Dismember(crystalMaiden);
        shadowShaman.killCreep();
        antiMage.brokenItem(Items.PowerTreads);
        Maps.MapTimeSkip(characters, 9);
        System.out.println("crystalMaiden has " + crystalMaiden.getGold() + " gold");
        crystalMaiden.buyFor(Items.Moonshard, lina);
        crystalMaiden.buyFor(Items.Moonshard, luna);
        Maps.MapTimeSkip(characters, 1);
        antiMage.buy(Items.BattleFury);
        crystalMaiden.brokenItems();
    }
}