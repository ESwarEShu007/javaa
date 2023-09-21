package basicprograms;

import java.util.*;
import java.io.*;

class BiCycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    String define_me() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());

        // Use super to call the define_me method from the superclass BiCycle
        String temp = super.define_me();

        System.out.println("My ancestor is a cycle who is " + temp);
    }
}

class Super_keyword {
    public static void main(String[] args) {
        MotorCycle M = new MotorCycle();
    }
}
