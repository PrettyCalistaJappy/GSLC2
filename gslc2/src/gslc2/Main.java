package gslc2;
import java.util.Scanner;
//Differences between interface and abstract
//	Interface uses "implements".
//	Abstract uses "extends".
//	"implements" means that the sub-class of an interface must use 
//	-the method in the parent class.
//	"abstract" means that sub-class of abstract can inherit the method
//	-but it is not a must.
//	this makes it so that all method in an interface must be 
//	-applicable to all of its sub-class, so it must be abstract method.
//	you can have abstract class, but you cannot have abstract interface.

//this is a program to create a character in ORV appocalypse (zombie) AU.
		//		the character can be human or zombie or dokkaebi.
		//		each character can have normal or evolved status.
		//		evolved human have abilities.
		//		User will specify this ability.
		
		// the interface -> class:
		//		EntityStatus-> EvolvedEntity 
		// the abstract class -> class:
		//		Character-> Human, Zombie, Dokkaebi
		//
		
		// all entity/object will have name and age.
		// evolved character will need to diagnose their abilities.
		// 

public class Main {

	public static void main(String[] args) {
		//setting up the scanner
		Scanner input = new Scanner(System.in);
		//creating character...
		System.out.println("Hello, reader [BLANK]");
		System.out.println("Please create your character");
		
		System.out.println("Name: ");
		String name = input.nextLine();
		System.out.println("Age: ");
		int age = input.nextInt();
		input.nextLine();
		
		//build the character
		Character OC = new Character(name, age);
		
		//determine the character entity type
		System.out.println("What kind of entity is your character?");
		System.out.println("1. Human");
		System.out.println("2. Zombie");
		System.out.println("3. Dokkaebi");
		System.out.println("Enter number: ");
		int ent_type = input.nextInt();
		input.nextLine();
		
		//building human or zombie
		if(ent_type == 1) {//build human
			Human hum = new Human(name,age);
		}
		else if (ent_type == 2){//build zombie
			Zombie zom = new Zombie(name,age);
		}
		else if (ent_type == 3){
			Dokkaebi dok = new Dokkaebi(name,age);
		}
		else {
			System.out.println("This is not a valid option, character creation failed.");
		}
		
		//evolved/ normal character
		System.out.println("Are your character a normal entity or evolved entity?");
		System.out.println("1. Normal");
		System.out.println("2. Evolved");
		System.out.println("Enter number: ");
		int ent_status = input.nextInt();
		input.nextLine();
		
		if(ent_status == 1) {
			System.out.println("You have made a character!");
		}
		else if (ent_status == 2) {
			System.out.println("Create an ability for your evolved character!");
			System.out.println("Ability: ");
			String ability = input.nextLine();
			
			// create the evolved entity
			EvolvedEntity evo_ent = new EvolvedEntity(name,age, ability);
			
			//use ability?
			System.out.println("Great! The entity " + evo_ent.name + " has gained an ability!");
			System.out.println("Use your ability?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.println("Enter number: ");
			int abi_use = input.nextInt();
			input.nextLine();
			
			//using abilities
			if(abi_use == 1) {
				evo_ent.ability();
				System.out.println("You character has been created succesfully!");

			}
			else if (abi_use == 2){
				System.out.println("You have created your character!");
			}
			else {
				System.out.println("This is not a valid option, character creation failed.");
			}
		}
		else {
			System.out.println("This is not a valid option, character creation failed.");
		}
		
		
	}

}









