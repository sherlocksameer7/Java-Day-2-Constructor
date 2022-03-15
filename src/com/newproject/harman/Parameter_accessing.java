package com.newproject.harman;

public class Parameter_accessing {

    public static void main(String[] args)
    {
        Parametrized_sample input = new Parametrized_sample(70);
        System.out.println(input.x);

        Parametrized_sample input2 = new Parametrized_sample(14);
        System.out.println(input2.x);
    }
}
