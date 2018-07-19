package Inheritance;

class Animal {
public Animal() {
	System.out.println("ANIMAL CONS");
}
public void eat() {
	System.out.println("animal eats food");
}
}
class Men extends Animal
{
	public Men() {
		System.out.println("Men cons");
	}
	public void eat() {
		System.out.println("Men eats veg and non veg");
		super.eat();
	}
}
class Dog extends Animal
{
	public Dog() {
		System.out.println("DOG CONS");
		super.eat();
		
	}
	public void eat() {
		System.out.println("Dog eats pedigree");
		super.eat();
	}
}

class clientA{
	public static void main(String[] args) {
		Dog d= new Dog();
		d.eat();
		Men m = new Men();
		m.eat();
		Animal a = new Animal();
		a.eat();
		Animal am = new Men();
		am.eat();
		Animal ad = new Dog();
		ad.eat();
	}
}
