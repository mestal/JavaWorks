package com.trial2;

import com.*;

public class Main {

    public static void main(String[] args) {

        RunCalculater();
    }

    public static void RunCalculater() {
        CalculateBase[] calculators = {
                new Adder(1,2),
                new Substractor(5,3),
                new Multiplier(5, 5),
                new Divider(10,2)
        };

        for(CalculateBase calculator: calculators)
        {
            calculator.calculate();
            System.out.print("result: ");
            System.out.println(calculator.getResult());
        }


    }

}
