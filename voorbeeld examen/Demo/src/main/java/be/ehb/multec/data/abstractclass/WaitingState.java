package be.ehb.multec.data.abstractclass;

public class WaitingState extends State{
    public WaitingState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void InWaiting() {
        System.err.println("Your order is waiting to be prepared");
        setState(getGumballMachine().WAITING);
    }

    public void NextState() {
        System.err.println("Your order will be prepared");
        setState(getGumballMachine().PREPARING);
        getGumballMachine().StartMaking();
    }
}
