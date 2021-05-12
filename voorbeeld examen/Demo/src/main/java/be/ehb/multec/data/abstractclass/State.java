package be.ehb.multec.data.abstractclass;

public abstract class State {
    private GumballMachine gumballMachine;
    public State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    protected GumballMachine getGumballMachine() {
        return gumballMachine;
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
        gumballMachine.setState(state);
    }
}
