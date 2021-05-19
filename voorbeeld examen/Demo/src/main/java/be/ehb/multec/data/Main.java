package be.ehb.multec.data;

import be.ehb.multec.data.abstractclass.State;
import be.ehb.multec.data.abstractclass.StateMachine;
import be.ehb.multec.data.decorator.Brood;
import be.ehb.multec.data.decorator.Kip;
import be.ehb.multec.data.decorator.KipCoery;
import be.ehb.multec.data.decorator.Prepare;
import be.ehb.multec.data.iterator.MenuItem;
import be.ehb.multec.data.iterator.Restaurant;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //getKipCoery();
        //getKip();
        getPrepare();
        getMenu();
        getState();

    }

    private static void getKipCoery() {
        System.out.println("****** Get Kipcoery ******");
        Brood brood = new KipCoery();
        System.out.println(brood.getDescription()+ " " + ((KipCoery) brood).cost()+ "$");
        System.out.println("**************************");
    }

    private static void getKip() {
        System.out.println("****** Get Kip ***********");
        Brood brood = new Kip();
        System.out.println(brood.getDescription()+ " " + ((Kip) brood).cost()+ "$");
        System.out.println("**************************");
    }
    private static void getPrepare() {
        System.out.println("****** Get Prepare *******");
        Brood brood = new Prepare();
        System.out.println(brood.getDescription()+ " " + ((Prepare) brood).cost()+ "$");
        System.out.println("**************************");
    }

    private static void getMenu() {
        Restaurant restaurant = new Restaurant();
        List<MenuItem> menu = restaurant.getMenuItems();
        for (MenuItem menuItem: menu) {
            System.err.println(menuItem);
        }
    }

    private static void getState() {
        StateMachine stateMachine = new StateMachine();
        stateMachine.setState(stateMachine.WAITING);
        System.err.println( stateMachine.getState());
        stateMachine.NextState();
        System.err.println( stateMachine.getState());
    }

}
