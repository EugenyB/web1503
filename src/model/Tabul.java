package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eugen on 15.03.2017.
 */
public class Tabul {
    private double start;
    private double finish;
    private double step;

    public Tabul(double start, double finish, double step) {
        this.start = start;
        this.finish = finish;
        this.step = step;
    }

    public List<XY> getPoints() {
        List<XY> result = new ArrayList<>();
        int n = (int) ((finish-start)/step + 1);
        for (int i=0; i<n; i++) {
            double x = start + i * step;
            double y = Math.sin(x);
            result.add(new XY(x,y));
        }
        return result;
    }
}
