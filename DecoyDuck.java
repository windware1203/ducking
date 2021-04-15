package headfirst.designpatterns.strategy;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(FlyNoWay);
		setQuackBehavior(MuteQuack);
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
