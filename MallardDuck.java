package headfirst.designpatterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {

		setQuackBehavior(Quack);
		setflyBehavior(FlyWithWings);

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
