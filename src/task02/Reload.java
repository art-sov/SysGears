package task02;

public class Reload {

    public void fromTrackToTrack(int n, String track01, String track02, String addPlace){
        if(n > 0){
            fromTrackToTrack(n - 1, track01, addPlace, track02);
            System.out.println("#" + n + " " + track01 + " -> " + track02);
            fromTrackToTrack(n - 1, addPlace, track02, track01);
        }
    }
}
