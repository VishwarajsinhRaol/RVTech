package inheritance;

class Vehicle {
	void run() {
		System.out.println("Vehicle Runs...");
	}
}

class Bike extends Vehicle {
	void bike() {
		System.out.println("Royal Enfield Meteor");
	}

	void run() {
		System.out.println("Meteor Runs At 100 Km/Hr");
	}
}

class Car extends Vehicle {
	void car() {
		System.out.println("Porsche 911");
	}

	void run() {
		System.out.println("Porsche Runs At 293 Km/Hr");
	}
}

class TestInheritance {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.run();
		Vehicle v2 = new Bike();
		v2.run();
		Vehicle v3 = new Car();
		v3.run();
		Bike b = (Bike) v2;
		b.bike();
		Car c = (Car) v3;
		c.car();

	}
}