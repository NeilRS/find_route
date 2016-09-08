import java.util.ArrayList;

/**
 * Created by Neil on 9/5/2016.
 */
public class City {
    public enum State {
        UNVISITED, QUEUED, VISITED
    }


    public String name;
    public ArrayList<ConnectingCity> connectingCities = new ArrayList<>();
    private State state = State.UNVISITED;
    private int pathCost = 0;
    private City parent = null;

    public City(String name) {
        this.name = name;
        this.connectingCities = new ArrayList<>();
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

    public State getState() {
        return this.state;
    }

    public void setState(State newState) {
        this.state = newState;
    }


    public int getPathCost() {
        return pathCost;
    }

    public void setPathCost(int pathCost) {
        this.pathCost = pathCost;
    }

    public City getParent() {
        return parent;
    }

    public void setParent(City parent) {
        this.parent = parent;
    }


}
