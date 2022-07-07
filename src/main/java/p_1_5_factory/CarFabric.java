package p_1_5_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class CarFabric {

    public abstract void createCar();

    public CarFabric() {
        createCar();
    }

    private List<Car> ls = new ArrayList<>();

    public List<Car> getLs() {
        return ls;
    }

    public void setLs(List<Car> ls) {
        this.ls = ls;
    }
}
