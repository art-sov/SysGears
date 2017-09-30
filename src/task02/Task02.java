package task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02 {

    public static void main(String[] args) {
        String track01 = "slot_a";
        String addPlace = "slot_b";
        String track02 = "slot_c";
        String str;
        int plateCount = 0;

        System.out.println("Введите количество плит от 3 до 8");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            str = reader.readLine();
            plateCount = Integer.parseInt(str);

            if(plateCount < 3 || plateCount > 8){
                System.out.println("Не верное количество плит");
                reader.close();
                return;
            }
            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        Reload reload = new Reload();
        reload.fromTrackToTrack(plateCount, track01, track02, addPlace);
    }
}
