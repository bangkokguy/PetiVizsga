package bangkokguy.development.android.petivizsga;

/**
 * Created by bangkokguy on 2018.06.14.;
 */

public class Subway extends TrackBased {

    private int nrOfTrains;

    Subway(String manufacturer, int km, int nrOfDoors, int space, int railWidth, int nrOfTrains) {
        super(manufacturer, km, nrOfDoors, space, railWidth);
        setNrOfTrains(nrOfTrains);
    }

    public void setNrOfTrains(int nrOfTrains) {

        this.nrOfTrains = nrOfTrains;
    }

    public int getNrOfTrains() {
        return nrOfTrains;
    }
}
