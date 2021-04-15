package headfirst.designpatterns.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		setflyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
