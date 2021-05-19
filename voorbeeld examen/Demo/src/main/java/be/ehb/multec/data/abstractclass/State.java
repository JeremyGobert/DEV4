package be.ehb.multec.data.abstractclass;

import java.util.Objects;

public abstract class State {
    private StateMachine stateMachine;
    public State(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    protected StateMachine getStateMachine() {
        return stateMachine;
    }

    protected void StartMaking() {
        System.err.println("Imposssible to accept quarter");
    }

    protected void InWaiting() {
        System.err.println("Imposssible to eject quarter");
    }

    protected void Finished() {
        System.err.println("No use in turning crank");
    }

    protected void NextState() {
        System.err.println("fuck");
    }

    protected void setState(State state) {
        stateMachine.setState(state);
    }

}
