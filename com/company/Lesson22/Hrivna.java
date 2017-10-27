package com.company.Lesson22;

import java.math.BigInteger;

/**
 * Created by Toll on 31.08.2017.
 */
public class Hrivna extends Money {
    public Hrivna(BigInteger money) {
        super(money);
    }

    @Override
    String getCurrencyName() {
        return  "HRN";
    }
}
