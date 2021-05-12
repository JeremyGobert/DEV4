package be.ehb.multec.data.abstractclass;

public class FinishedState extends State{
    public FinishedState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void Finished() {
        System.err.println("Your order is ready, please come and get it you lazy fat shit");
        setState(getGumballMachine().FINISHED);
    }
}