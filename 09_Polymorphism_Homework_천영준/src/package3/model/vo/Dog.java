package package3.model.vo;

public class Dog extends Animal{
	public static String Place = "애견카페";
	private int weight;
	
	public Dog() {
		
	}
	public Dog(String name, String kinds, int weight) {
		
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
		
	}

}
