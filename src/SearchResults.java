/**
 * Created by Neil on 9/5/2016.
 */
public class SearchResults {
    private int distance = -1;
    private City[] route;

    public SearchResults(int routeLength) {
        this.route = new City[routeLength];
    }

    public void addCity(City city, int distance) {
        if(this.distance == -1) {
            this.distance = distance;
        }
        else {
            this.distance = this.distance + distance;
        }

        for(int i = 0;i < route.length;i++) {
            if (route[i] == null) {
                route[i] = city;
                i = route.length;
            }
        }
    }

    public void printRoute() {
        if(distance == -1) {
            System.out.println("Distance: infinity");
            System.out.println("route:");
            System.out.println("none");
            return;
        }
        System.out.println("Distance: " + Integer.toString(distance) + " km");
        System.out.println("route:");
        for(int i = 0;i < route.length;i++) {
            if (route[i+1] == null) {
                i = route.length;
            }
            else {
                System.out.println(route[i].name + " to " + route[i+1].name + ", " + Integer.toString(route[i].connectingDistance(route[i+1])) + " km");
            }
        }
    }
}