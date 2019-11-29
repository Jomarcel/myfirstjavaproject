package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Minimum Float Value = " + myMinFloatValue);
        System.out.println("Float Max Float Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double. MAX_VALUE;



        System.out.println("Minimum Double Value = " + myMinDoubleValue);
        System.out.println("Max Double Value = " + myMaxDoubleValue);

        int myIntValue = 9 / 8;
        float myFloatValue = 9f / 5f;
        double myDoubleValue = 9d / 5d;

        System.out.println("MyIntValue " + myIntValue);
        System.out.println("MyFloatValue " + myFloatValue);
        System.out.println("MyDoubleValue " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;

        System.out.println("Converted Kilograms = " + convertedKilograms);



    }
}
