package task01;

import org.json.simple.JSONObject;

public class TemperatureConverter {

    public void convertTemp(int temperature, char scale){
        JSONObject result = new JSONObject();

        switch (scale){
            case 'F':
                int celsius = (temperature - 32) * 5/9;
                int kelvin = celsius - 273;
                result.put("C", celsius);
                result.put("K", kelvin);
                break;

            case 'C':
                int fahrenheit = temperature * 9/5 + 32;
                kelvin = temperature - 273;
                result.put("F", fahrenheit);
                result.put("K", kelvin);
                break;

            case 'K':
                celsius = temperature + 273;
                fahrenheit = celsius * 9/5 + 32;
                result.put("C", celsius);
                result.put("F", fahrenheit);
                break;

            default:
                System.out.println("The temperature scale is't correct");
        }
        System.out.println(result);
    }

    public void parsingTemp(String str){
        char lastChar = Character.toUpperCase(str.charAt(str.length() - 1));
        String tempString = str.substring(0, str.length() - 1);
        int tempInt = 0;
        try {
            tempInt = (int)Double.parseDouble(tempString);
        }
        catch(NumberFormatException e){
            System.out.println("The temperature is incorrectly entered");
        }
        convertTemp(tempInt, lastChar);
    }
}
