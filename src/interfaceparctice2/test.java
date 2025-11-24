package interfaceparctice2;

public class test {
	public static void main(String[] args) {
		Swim swim1=  new Swim() {
			
			@Override
			public void swim() {
				// TODO Auto-generated method stub
				System.out.println("rewrite the swim()");
			}
			
			@Override
			public void jump()
			{
				System.out.println("rewrite the jump()");
			}
		};
		swim1.jump();
		Swim.eat();
	}
}
