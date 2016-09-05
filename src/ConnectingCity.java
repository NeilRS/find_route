/**
 * Created by Neil on 9/5/2016.
 */
public class ConnectingCity {
    private City city;
    private int distance;

    public ConnectingCity(City city, int distance) {
        this.city = city;
        this.distance = distance;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "connectingCity{" +
                "city=" + city +
                ", distance=" + distance +
                '}';
    }
}
