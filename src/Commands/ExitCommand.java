package Commands;

public class ExitCommand implements Command{
    @Override
    public void execute() {
        System.exit(0);
    }

    @Override
    public String descr() {
        return "exit - Это как alt + f4(дает много монеток)";
    }
}
