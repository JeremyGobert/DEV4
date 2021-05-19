package be.ehb.multec.data.abstractclass;

public class WaitingState extends State{
    public WaitingState(StateMachine stateMachine) {
        super(stateMachine);
    }

    @Override
    public void InWaiting() {
        System.err.println("Your order is waiting to be prepared");
        setState(getStateMachine().WAITING);
    }

    public void NextState() {
        System.err.println("Your order will be prepared");
        setState(getStateMachine().PREPARING);
        getStateMachine().StartMaking();
    }
}
