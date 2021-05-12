package be.ehb.multec.data.abstractclass;

public class GumballMachine {
    public final State WAITING;
    public final State PREPARING;
    public final State FINISHED;
    private State state;
    /*private int numberOfGumballs;*/

    /*public int getNumberOfGumballs() {
        return numberOfGumballs;
    }*/


    /*public GumballMachine(int numberOfGumballs)*/
    public GumballMachine() {
        WAITING = new WaitingState(this);
        PREPARING = new PreparingState(this);
        FINISHED = new FinishedState(this);
        state = WAITING;
        /*refill(numberOfGumballs);*/
    }

    /*public void refill(int numberOfGumballs) {
        if (this.numberOfGumballs == 0 && numberOfGumballs > 0) {
            this.numberOfGumballs = numberOfGumballs;
            state = NO_QUARTER;
        }
    }*/

    void setState(State state) {
        this.state = state;
    }

    /*public boolean isEmpty() {
        return numberOfGumballs == 0;
    }*/

    /*void releaseBall() {
        if (!isEmpty()) {
            System.err.println("Gumball coming your way");
            numberOfGumballs--;
        }
    }*/

    public void StartMaking() {
        state.StartMaking();
    }

    public void InWaiting() {
        state.InWaiting();
    }

    public void Finished() {
        state.Finished();
    }

    public void NextState() {
        state.NextState();
    }
}
