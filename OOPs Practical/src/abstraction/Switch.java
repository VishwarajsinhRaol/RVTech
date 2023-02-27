package abstraction;

abstract class Switch {

	abstract void switchOn();

	abstract void switchOff();

	void use() {
		System.out.println("Light");
	}
}

class TubeLight extends Switch {

	@Override
	void switchOn() {
		System.out.println("TubeLight Turned On!!!");
	}

	@Override
	void switchOff() {
		System.out.println("TubeLight Turned Off!!!");
	}
}

class LEDLight extends Switch {

	@Override
	void switchOn() {
		System.out.println("LED Is Turned On!!!");
	}

	@Override
	void switchOff() {
		System.out.println("LED Is Turned Off!!!");
	}
}

class TestAbstraction {
	public static void main(String[] args) {
		Switch tube = new TubeLight();
		tube.use();
		tube.switchOn();
		tube.switchOff();

		System.out.println("=====================");

		Switch led = new LEDLight();
		led.use();
		led.switchOn();
		led.switchOff();
	}
}
