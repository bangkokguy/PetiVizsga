package bangkokguy.development.android.petivizsga;

/**
 * Created by bangkokguy on 2018.06.14.;
 */

public class Vehicle {

    private String manufacturer;
    private String id;
    private int km;
    private int nrOfDoors;
    private int space;

    Vehicle(String manufacturer, int km, int nrOfDoors, int space) {
        setManufacturer(manufacturer);
        setKm(km);
        setNrOfDoors(nrOfDoors);
        setSpace(space);
        setId();
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setId() {
        this.id = "";
    }
    public void setKm(int km) {
        if (km > 0) {
            this.km = km;
        } else {
            throw new IllegalArgumentException("km out of range");
        }
    }
    public void setNrOfDoors(int nrOfDoors) {
        if (nrOfDoors > 0) {
            this.nrOfDoors = nrOfDoors;
        } else {
            throw new IllegalArgumentException("nrOfDoors out of range");
        }
    }
    public void setSpace(int space) {
        if (space > 9) {
            this.space = space;
        } else {
            throw new IllegalArgumentException("space out of range");
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getId() {
        return id;
    }
    public int getNrOfDoors() {
        return nrOfDoors;
    }
    public int getKm() {
        return km;
    }
    public int getSpace() {
        return space;
    }
    public float getPrice() {
        return (1 / km) * (space + nrOfDoors);
    }
}
