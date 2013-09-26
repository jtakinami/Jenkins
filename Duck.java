public class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public void performFly(){
		flyBehavior.fly();
	}
	public void performQuack(){
		quackBehavior.quack();
	}
	public void swin(){
		System.out.println("All ducks float, even decoys!!");
	}	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
}
