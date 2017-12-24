package com.company;

public class Main {

    public static final byte FAHRENHEIT = 1;
    public static final byte CELSIUS = 2;

    public static void main(String[] args) {
        float inputDataValue = 54f;
        float converted = convertTemperature(inputDataValue,(byte)2);
        System.out.println(converted);
    }

    private static float convertTemperature(float value, byte type){
        if(type == FAHRENHEIT){
            return ((value - 32) * 5 / 9);
        }else if (type == CELSIUS) {
            return ((value * 9/5) + 32);
        }else return 0;
    }
}
