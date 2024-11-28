package enums;

public enum Items {
    Nothing(0),
    BATTLE_FURY(4100),
    GLIMMER_CAPE(2150),
    AGHANIM_SCEPTER(4200),
    MOONSHARD(4000),
    BLACK_KING_BAR(4050),
    POWER_TREADS(1400),
    MASK_OF_MADNESS(1900),
    KAYA_AND_SANGE(4200),
    ARMLET_OF_MORDIGGIAN(2500);


    final int cost;

    Items(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}