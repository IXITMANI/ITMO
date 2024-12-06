package exceptions;

public class IsNotDeadException extends Exception {
    private final String name;
    public IsNotDeadException(String name){
        this.name = name;
    }

    @Override
    public String getMessage(){
        return name + " is not dead";
    }
}
