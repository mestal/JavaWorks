package com.Flight;

import java.net.PasswordAuthentication;
import java.util.Iterator;

public class Flight implements Iterable<Person> {

    private int flightTime; //in minute

    private CrewMember[] crew;
    private Passenger[] roster;

    public Flight(Passenger[] roster, CrewMember[] crew)
    {
        this.crew = crew;
        this.roster = roster;
    }

    @Override
    public Iterator<Person> iterator() {

        //return new FlightIterator();

        return new Iterator<Person>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < crew.length + roster.length; //Attention: crew and roster is upper class members
            }

            @Override
            public Person next() {

                Person p = (index < crew.length) ?
                        crew[index] : roster[index - crew.length];
                index++;

                return p;
            }
        };
    }

    private class FlightIterator implements Iterator<Person> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < crew.length + roster.length;
        }

        @Override
        public Person next() {

            Person p = (index < crew.length) ?
                    crew[index] : roster[index];
            index++;

            return p;
        }
    }
}
