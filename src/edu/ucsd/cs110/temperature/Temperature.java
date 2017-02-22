package edu.ucsd.cs110.temperature;

/**
 * Created by markyu on 2/22/17.
 */

public abstract class Temperature {
    private final float value;

    public Temperature(float v)
    {
        value = v;
    }
    public final float getValue()
    {
        return value;
    }
    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}
