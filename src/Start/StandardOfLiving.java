package Start;

public enum StandardOfLiving {
    ULTRA_HIGH(0),
    VERY_HIGH(1),
    MEDIUM(2),
    LOW(3),
    VERY_LOW(4);

    public int level;
    StandardOfLiving(int level){
        this.level=level;
    }

    public int getLevel() {
        return level;
    }
}