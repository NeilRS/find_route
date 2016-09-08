import java.util.Comparator;

/******
 * Based on information from http://stackoverflow.com/questions/683041/java-how-do-i-use-a-priorityqueue
 */

public class PathCostComparator implements Comparator<City>
{
    @Override
    public int compare(City x, City y)
    {
        if (x.getPathCost() < y.getPathCost()) {
            return -1;
        }
        if (x.getPathCost() > y.getPathCost()) {
            return 1;
        }
        return 0;
    }
}
