package task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task01 {
    public static void main(String[] args) {

        String str = "";

        System.out.println("Enter the temperature: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            str = reader.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.parsingTemp(str);
    }
}
