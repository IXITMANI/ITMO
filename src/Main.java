import Enums.Action;
import Enums.Places;
import Enums.Properties;
import Object.*;

/*
 * Слуги доложили принцу, что на бал приехала прекрасная богатая незнакомка.
 * Он поспешил встретить ее и проводить во дворец.
 * Легкий шепот изумления и восторга пробежал по залу.
 * Все взгляды были прикованы к красавице.
 * Старый король шепнул королеве, что он уже много лет не видел такого чуда.
 * Дамы внимательно рассматривали ее наряд, стараясь не упустить ни одной мелочи, чтобы завтра же заказать себе такой же, если им только это удастся.
 * Принц пригласил ее на танец.
 * Одно удовольствие было смотреть, как она танцует.
 * Подали ужин, но принц совсем забыл про еду, его глаза не отрывались от глаз прекрасной незнакомки.
 * Она села рядом со своими сводными сестрами и угостила их экзотическими фруктами из корзинки, которую преподнес ей принц. Они зарделись от удовольствия, удостоившись такой чести, но не узнали Золушку.
 * */

public class Main {
    public static void main(String[] args) {
        Entity servant = new Entity("Слуга", Places.castle);
        Entity prince = new Entity("Принц", Places.castle);
        Entity stranger = new Entity("Незнакомка", Places.street);
        Entity whisper = new Entity("Шёпот", Places.None);
        stranger.properties(Properties.BEAUTIFUL);
        servant.doSomething(Action.say, prince);
        stranger.goSomewhere(Places.nearCastle);
        stranger.getPlace();
        prince.doSomething(Action.went, stranger);
        prince.goSomewhere(Places.street);
        prince.getPlace();
        prince.goSomewhere(Places.castle, stranger);
        whisper.properties(Properties.LIGHT);
        whisper.doSomething(Action.run, Places.castle);

    }
}