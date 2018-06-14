package bangkokguy.development.android.petivizsga;

/**
 * Created by bangkokguy on 2018.06.14.;
 */

public class TrackBased extends Vehicle {

    private int railWidth;

    TrackBased(String manufacturer, int km, int nrOfDoors, int space, int railWidth) {
        super(manufacturer, km, nrOfDoors, space);
        setRailWidth(railWidth);
    }

    public void setRailWidth(int railWidth) {
        this.railWidth = railWidth;
    }

    public int getRailWidth() {
        return railWidth;
    }

    @Override
    public float getPrice() {
        return (railWidth * super.getKm());
    }

}
