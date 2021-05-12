package be.ehb.multec.data.abstractclass;

public class PreparingState extends State{
    public PreparingState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void StartMaking() {
        System.err.println("Your order is being prepared");
        setState(getGumballMachine().PREPARING);
    }

    public void NextState() {
        System.err.println("Your order is almost finished");
        setState(getGumballMachine().FINISHED);
        getGumballMachine().Finished();
    }
}