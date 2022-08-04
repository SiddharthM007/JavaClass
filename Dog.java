package mypackage;

public class Dog {
	String name;
	String breed;
	int age;
	String colour;
	public Dog(String name,String breed,int age,String colour) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public String getColour() {
		return colour;
	}
	public String toString() {
		return ("Hi my name is "+this.getName() +", \nMy breed is" +this.getBreed()+" ,\nMy age is"
				+this.getAge());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog scott = new Dog("Scott","German shepp",8,"black");
		System.out.println(scott.toString());

	}

}
