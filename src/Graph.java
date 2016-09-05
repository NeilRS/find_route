import java.util.ArrayList;

/**
 * Created by Neil on 9/5/2016.
 */
public class Graph {
    private ArrayList<City> cities = new ArrayList<>();

    public Graph(ArrayList<City> cities) {
        this.cities = cities;
    }

    public Graph(String cityName) {
        this.cities = new ArrayList<>();
        this.addCity(cityName);
    }

    public void addCity(String cityName) {
        cities.add(new City(cityName));
    }

    public City getCity(String name) {
        for (City city:cities) {
            if(city.name.equals(name)) {
                return city;
            }
        }
        return null;
    }

}
