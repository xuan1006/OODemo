package org.example;

public class NumberChecker  {

    public String check(int i) {
        if(i>0)
            return "Positive";
        else if(i<0)
            return "Negative";
        return "Zero";
    }
}
