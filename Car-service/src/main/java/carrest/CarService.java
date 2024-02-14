package carrest;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private final CarDao carDao = CarDao.getINSTANCE();

    public void save(Car car) {
        carDao.saveCar(car);
    }
    public Car update(Car car) {
        return carDao.update(car);
    }
    public Car delete(int id) {
        return carDao.deleteById(id);
    }
    public Car get(int id) {
        return carDao.getById(id);
    }

    public List<Car> getAll() {
        return new ArrayList<>(carDao.getAll());
    }
}
