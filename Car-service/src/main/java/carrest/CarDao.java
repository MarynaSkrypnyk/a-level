package carrest;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public final class CarDao {
    @Getter
    private static final CarDao INSTANCE = new CarDao();
    private final List<Car> carList = new ArrayList<>();

    public void saveCar(Car car) {
        carList.add(car);
    }

    public Car update(Car car) {
        return carList.set(car.getId(), car);
    }

    public Car getById(int id) {
        return carList.stream().filter(car -> car.getId() == id).findAny().orElseThrow();
    }

    public Car deleteById(int id) {
        Car foundCar = carList.stream().filter(car -> car.getId() == id).findAny().orElseThrow();
        carList.remove(foundCar);
        return foundCar;
    }

    public List<Car> getAll() {
        return new ArrayList<>(carList);
    }

    private CarDao() {
    }
}
