package headfirst.designpatterns.strategy;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		setflyBehavior(FlyWithWings);
		setQuackBehavior(Quack);
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
