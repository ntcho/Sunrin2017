class PetOwner {
	String name;
	
	Animal pet;
	
	public PetOwner(String name, Animal pet) {
		this.name = name;
		this.pet = pet;
	}

	void vaccinate(Vet vet) {
		vet.vaccinate(pet, this);
	}
}

class Vet {
	String name;
	
	public Vet(String name) {
		this.name = name;
	}

	void vaccinate(Animal animal, PetOwner petOwner) {
		println("Welcome to " + name + "'s vet!");
		if (animal.isVaccinated) {
			// already vaccinated
			print(petOwner.name + ", your ");
			if (animal instanceof Dog) {
				print("dog");
			} else if (animal instanceof Cat) {
				print("cat");
			} else {
				print("pet");
			}
			println(" doesn't need vaccination.");
		} else {
			println(petOwner.name + ", your pet needs vaccination.");
			// animal vaccinate
			animal.vaccinate();
			animal.sound();
			println(petOwner.name + ", your pet is vaccinated.");
		}
	}
	
	public static void print(Object obj) {
		System.out.print(obj.toString());
	}
	
	public static void println(Object obj) {
		System.out.println(obj.toString());
	}
}

class Animal {
	String name;
	
	String age;
	
	public Animal(String name, String age, boolean isVaccinated) {
		this.name = name;
		this.age = age;
		this.isVaccinated = isVaccinated;
	}

	boolean isVaccinated = false;
	
	void sound() {
		print("???");
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
	
	public void vaccinate() {
		isVaccinated = true;
	}
}

class Dog extends Animal {
	public Dog(String name, String age, boolean isVaccinated) {
		super(name, age, isVaccinated);
	}

	@Override
	void sound() {
		print("Bark");
	}
}

class Cat extends Animal {
	public Cat(String name, String age, boolean isVaccinated) {
		super(name, age, isVaccinated);
		// TODO Auto-generated constructor stub
	}

	@Override
	void sound() {
		print("Meow");
	}
}

public class InstanceofExample04 {
	public static void vaccinate(PetOwner owner, Vet vet, Animal animal) {
		owner.vaccinate(vet);
	}
	
	public static void main(String args[]) {
		Dog dog = new Dog("DangDang", "5", false);
		Cat cat = new Cat("Catty", "6", true);
		
		PetOwner dogOwner = new PetOwner("Steve", dog);
		PetOwner catOwner = new PetOwner("Philip", cat);
		
		Vet vet = new Vet("Vsauce");
		
		dogOwner.vaccinate(vet);
		catOwner.vaccinate(vet);
	}
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
}
