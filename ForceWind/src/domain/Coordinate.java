package domain;

/**
 *
 * @author Nindustries
 */
public class Coordinate implements Comparable {
    final int x;
    final int y;
    public Coordinate(int x, int y) { this.x = x ; this.y = y; }
    
    public boolean inRange(int x, int y, int w, int h){
        return (this.x > x && this.y > y && this.x <= x+w && this.y <= y+h);
    }
    
    @Override
    public int hashCode() { return x >> 16 & y; }
    @Override
    public boolean equals(Object o) { if (o instanceof Coordinate) { Coordinate c = (Coordinate)o; return c.x==x && c.y==y;} return false; }

    @Override
    public int compareTo(Object o) {
        int result = 0;
        if (o instanceof Coordinate){
            Coordinate c = (Coordinate) o;
            int d = c.x - this.x;
            if (d == 0)
                d = this.y - c.y;
            result = d;
        }
        return result;
    }
}
