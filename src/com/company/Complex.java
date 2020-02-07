package com.company;

public class Complex
{
    double first;
    double second;
    public Complex (double a)
    {
       first = a;
       second = 0.0;
    }
    public Complex (double a, double b)
    {
        first = a;
        second = b;
    }
    public double abs ()
    {
        double answer = Math.sqrt((first * first) + (second * second));
        return answer;
    }
    public Complex add (Complex other)
    {

    }
}
