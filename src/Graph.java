import java.util.ArrayList;

/**
 * Created by Neil on 9/5/2016.
 */
public class Graph {
    private ArrayList<City> cities = new ArrayList<>();

    public Graph() {
        this.cities = new ArrayList<>();
    }

    public City addCity(String cityName) {

        cities.add(new City(cityName));

        return getCity(cityName);
    }

    public City getCity(String name) {
        for (City city:cities) {
            if(city.name.equals(name)) {
                return city;
            }
        }
        return null;
    }

    public int sizeOf() {
        return this.cities.size();
    }

}
