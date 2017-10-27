package com.company.Exceptions;

/**
 * Created by Toll on 08.07.2017.
 */

// Demonstrate throw.
class Test03 {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc." + e);
            throw e; // re-throw the exception
        }
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught inside main." + e);
        }
    }
}
