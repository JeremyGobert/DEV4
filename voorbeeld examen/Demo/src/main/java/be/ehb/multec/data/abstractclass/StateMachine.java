package be.ehb.multec.data.abstractclass;

public class StateMachine {
    public final State WAITING;
    public final State PREPARING;
    public final State FINISHED;
    private State state;


    @Override
    public String toString() {
        return "" +state.toString() ;
    }

    public StateMachine() {
        WAITING = new WaitingState(this);
        PREPARING = new PreparingState(this);
        FINISHED = new FinishedState(this);
        state = WAITING;
    }

    public void setState(State state) {
        this.state = state;
    }

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

    public String getState() {
        String stateName = toString();
        String result = "";
        if(state == WAITING){
            result = "WAITING";
        }else if(state == PREPARING){
            result = "PREPARING";
        }else {
            result = "FINISHED";
        }

        return result;
    }


}
