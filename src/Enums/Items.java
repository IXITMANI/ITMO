package Enums;

public enum Items {
    Nothing(0),
    BattleFury(4100),
    GlimmerCape(2150),
    AghanimScepter(4200),
    Moonshard(4000),
    BlackKingBar(4050),
    PowerTreads(1400),
    MaskOfMadness(1900),
    KayaAndSange(4200),
    ArmletOfMordiggian(2500);


    int cost;

    Items(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}