package be.ehb.multec.data.abstractclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateMachineTest {
    @Test
    void GetOrderInfo() {
        StateMachine stateMachine = new StateMachine();
        System.err.println(stateMachine.toString());
    }

    @Test
    void Preparing() {
        StateMachine stateMachine = new StateMachine();
        stateMachine.StartMaking();
        stateMachine.NextState();
    }

    @Test
    void Finished() {
        StateMachine stateMachine = new StateMachine();
        stateMachine.Finished();
        stateMachine.NextState();
    }
}