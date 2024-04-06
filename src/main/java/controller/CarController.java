package controller;

import model.Car;
import model.Cars;

public class CarController {
    private Cars cars;
    private String[] carNames = {"붕붕이", "씽씽이", "주전차"};
    public void saveCars(){
        for(String carName: carNames){
            cars.save(new Car(carName));
        }
    }
    public void moveCars(){
        cars.move();
    }
}
