/**
 * Created by Neil on 9/5/2016.
 * last updated 9/9/2016
 * list of cities that are connected to another city and their distances.
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

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "connectingCity{" +
                "city=" + city +
                ", distance=" + distance +
                '}';
    }
}
