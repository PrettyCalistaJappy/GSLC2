package gslc2;

public class EvolvedEntity implements EntityStatus{
	String ability;
	String name;
	int age;
	
	public EvolvedEntity(String name, int age, String ability) {
		this.name = name;
		this.age = age;
		this.ability = ability;
	}
	
	@Override
	public void ability() {
		System.out.println(this.name + " uses " + this.ability + "!!!");
	}
	
}
