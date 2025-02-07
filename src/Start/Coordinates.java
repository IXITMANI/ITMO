package Start;

public class Coordinates {
    private Integer x; //Поле не может быть null
    private Integer y; //Поле не может быть null
    public Coordinates(int[] coordinates){
        this.x = coordinates[0];
        this.y = coordinates[1];
    }

    @Override
    public String toString(){
        return x.toString() + " " + y.toString();
    }
}