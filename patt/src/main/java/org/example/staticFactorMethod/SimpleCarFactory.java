package org.example.staticFactorMethod;

public class SimpleCarFactory implements CarFactory{
        public Car createCar(CarType type) {
            Car car = null;

            switch (type) {
                case LADA:
                    car = new Lada();
                    break;
                case JUK:
                    car = new Juk();
                    break;
                case BMW:
                    car = new BMW();
                    break;
            }
            return car;
        }
    }
