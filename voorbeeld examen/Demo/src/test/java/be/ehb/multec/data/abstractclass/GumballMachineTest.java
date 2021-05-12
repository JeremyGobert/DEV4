package be.ehb.multec.data.abstractclass;

import org.junit.jupiter.api.Test;

import java.util.Random;

class GumballMachineTest {
    @Test
    void GetOrderInfo() {
        GumballMachine gumballMachine = new GumballMachine();
        gumballMachine.InWaiting();
        gumballMachine.NextState();
        gumballMachine.StartMaking();
        gumballMachine.NextState();
        gumballMachine.Finished();
        gumballMachine.NextState();
    }

    @Test
    void Preparing() {
        GumballMachine gumballMachine = new GumballMachine();
        gumballMachine.StartMaking();
        gumballMachine.NextState();
    }

    @Test
    void Finished() {
        GumballMachine gumballMachine = new GumballMachine();
        gumballMachine.Finished();
        gumballMachine.NextState();
    }

}