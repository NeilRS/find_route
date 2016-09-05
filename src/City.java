import java.util.ArrayList;

/**
 * Created by Neil on 9/5/2016.
 */
public class City {
    public String name;
    private ArrayList<ConnectingCity> connectingCities = new ArrayList<>();
    private boolean visitedflag = false;

    public City(String name) {
        this.name = name;
        this.connectingCities = new ArrayList<>();
    }

    public City(String name, City connectingCity, int connectingCityDistance) {
        this.name = name;
        this.connectingCities = new ArrayList<>();
        this.addConnectingCity(connectingCity, connectingCityDistance);
    }

    public void addConnectingCity(City city, int distance) {
        this.connectingCities.add(new ConnectingCity(city, distance));
    }

    public int connectingDistance(City connectingCity) {
        for(ConnectingCity city:connectingCities) {
            if(city.getCity().name.equals(connectingCity.name)) {
                return city.getDistance();
            }
        }
        return -1;
    }

    public boolean visited() {
        return visitedflag;
    }

    public void setVisitedTrue() {
        this.visitedflag = true;
    }



}
