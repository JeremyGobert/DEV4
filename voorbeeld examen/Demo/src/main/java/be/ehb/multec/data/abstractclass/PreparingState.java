package be.ehb.multec.data.abstractclass;

public class PreparingState extends State{
    public PreparingState(StateMachine stateMachine) {
        super(stateMachine);
    }

    @Override
    public void StartMaking() {
        System.err.println("Your order is being prepared");
        setState(getStateMachine().PREPARING);
    }

    public void NextState() {
        System.err.println("Your order is almost finished");
        setState(getStateMachine().FINISHED);
        getStateMachine().Finished();
    }

}