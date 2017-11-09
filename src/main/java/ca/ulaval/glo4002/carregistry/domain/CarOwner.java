package ca.ulaval.glo4002.carregistry.domain;

import java.util.LinkedList;
import java.util.List;

public class CarOwner {

	private CarOwnerId id;
	private String name;
	private List<Car> cars = new LinkedList<>();

	public CarOwner(String name) {
		this.name = name;
	}

	public CarOwnerId getId() {
		return id;
	}

	public void setId(CarOwnerId id) {
		this.id = id;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public String getName() {
		return name;
	}

}
