package com.trial2;

import com.Calculator.*;
import com.Flight.CrewMember;
import com.Flight.Flight;
import com.Flight.Passenger;

import javax.xml.namespace.QName;

public class Main {

    public static void main(String[] args) {

        //RunCalculator();
        RunFlightCheck();

    }

    public static void RunFlightCheck() {
        var passengers = new Passenger[2];
        passengers[0] = new Passenger();
        passengers[0].name = "Ahmet";
        passengers[1] = new Passenger();
        passengers[1].name = "Mehmet";

        var crew = new CrewMember[2];
        crew[0] = new CrewMember();
        crew[0].name = "Mesut";
        crew[1] = new CrewMember();
        crew[1].name = "Mert";

        Flight f = new Flight(passengers, crew);

        var persons = f.iterator();
        while(persons.hasNext())
        {
            var p = persons.next();
            System.out.println("Person => " + p.name);
        }
    }

    public static void RunCalculator() {
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
