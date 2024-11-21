import Enums.Action;
import Enums.Mood;
import Enums.Places;
import Enums.Properties;
import Object.*;

/*
 * Слуги доложили принцу, что на бал приехала прекрасная богатая незнакомка.
 * Он поспешил встретить ее и проводить во дворец.
 * Легкий шепот изумления и восторга пробежал по залу. Все взгляды были прикованы к красавице.
 * Старый король шепнул королеве, что он уже много лет не видел такого чуда.
 * Дамы внимательно рассматривали ее наряд, стараясь не упустить ни одной мелочи, чтобы завтра же заказать себе такой же, если им только это удастся.
 * Принц пригласил ее на танец.
 * Одно удовольствие было смотреть, как она танцует.
 * Подали ужин, но принц совсем забыл про еду, его глаза не отрывались от глаз прекрасной незнакомки.
 * Она села рядом со своими сводными сестрами и угостила их экзотическими фруктами из корзинки, которую преподнес ей принц.
 * Они зарделись от удовольствия, удостоившись такой чести, но не узнали Золушку.
 */

public class Main {
    public static void main(String[] args) {
        Entity servant = new Entity("Слуга", Places.nearCastle);
        Entity prince = new Entity("Принц", Places.hall);
        Entity stranger = new Entity("Незнакомка", Places.street);
        Entity king = new Entity("Король", Places.hall);
        Entity queen = new Entity("Королева", Places.hall);
        Entity peoples = new Entity("Народ", Places.hall);
        Entity sisters = new Entity("Сёстры", Places.table);
        sisters.reasoning("Cinderella");
        //Слуги доложили принцу, что на бал приехала прекрасная богатая незнакомка.
        stranger.properties(Properties.BEAUTIFUL);
        stranger.doSomething(Action.went, Places.nearCastle);
        servant.doSomething(Action.see, stranger);
        servant.doSomething(Action.went, Places.hall);
        servant.doSomething(Action.say, prince);
        System.out.println();
        //Он поспешил встретить ее и проводить во дворец.
        prince.doSomething(Action.went, stranger);
        prince.doSomething(Action.went, stranger, Places.hall);
        System.out.println();
        //Легкий шепот изумления и восторга пробежал по залу. Все взгляды были прикованы к красавице.
        Entity whisper = new Entity("Шёпот");
        whisper.properties(Properties.LIGHT);
        whisper.doSomething(Action.fly, Places.hall);
        peoples.doSomething(Action.see, stranger);
        peoples.attitude(Mood.shocked);
        System.out.println();
        // Старый король шепнул королеве, что он уже много лет не видел такого чуда.
        king.doSomething(Action.see, stranger);
        king.reasoning("уже много лет не видел такого чуда");
        king.doSomething(Action.say, queen);
        System.out.println();
        //Дамы внимательно рассматривали ее наряд, стараясь не упустить ни одной мелочи, чтобы завтра же заказать себе такой же, если им только это удастся.
        peoples.doSomething(Action.see, stranger);
        peoples.reasoning("завтра же заказать себе такой же");
        System.out.println();
        //Принц пригласил ее на танец.
        prince.doSomething(Action.dance, stranger);
        System.out.println();
        // Одно удовольствие было смотреть, как она танцует.
        peoples.doSomething(Action.see, stranger);
        peoples.attitude(Mood.good);
        System.out.println();
        // Подали ужин, но принц совсем забыл про еду, его глаза не отрывались от глаз прекрасной незнакомки.
        Thing supper = new Thing("Ужин", Places.kitchen);
        servant.doSomething(Action.went, Places.kitchen);
        servant.doSomething(Action.serving, supper);
        prince.doSomething(Action.see, supper);
        prince.doSomething(Action.forgot);
        prince.doSomething(Action.see, stranger);
        System.out.println();
        // Она села рядом со своими сводными сестрами и угостила их экзотическими фруктами из корзинки, которую преподнес ей принц.
        sisters.properties(Properties.STEP);
        Thing fruits = new Thing("Фрукты",Places.kitchen, 101);
        prince.doSomething(Action.went,Places.kitchen);
        prince.doSomething(Action.serving, fruits);
        stranger.doSomething(Action.went, sisters);
        sisters.doSomething(Action.eat,fruits);
        System.out.println();
        // Они зарделись от удовольствия, удостоившись такой чести, но не узнали Золушку.
        sisters.attitude(Mood.blush);
        sisters.doSomething(Action.know,stranger);
    }
}