import java.util.Scanner;
public class RunAnimal {
    public static void main(String[] args) {
    	Scanner iskan = new Scanner(System.in);
    	
    	System.out.println("Choose an animal. Press for B for Bird, C for Cat, or D for Dog: ");
    	String letter = iskan.nextLine();
    	
    	if(letter.equalsIgnoreCase("B")){
    		Bird bird = new Bird();
    		bird.eat();
    		bird.sleep();
    		bird.makeSound();
    	}
    	else if(letter.equalsIgnoreCase("C")){
    		Cat cat = new Cat();
    		cat.eat();
    		cat.sleep();
    		cat.makeSound();
    	}
    	else if(letter.equalsIgnoreCase("D")){
    		Dog dog = new Dog();
    		dog.eat();
    		dog.sleep();
    		dog.makeSound();
    	}
    	else{
    		System.out.println("Invalid letter! Please Try Again.");
    	}
    }
}
