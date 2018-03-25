package org.generics;
//Which of the following changes (taken separately) would allow this code to compile?
public class exp1 {

}
interface Hungry<E>
{
	void munch(E x);	
}
interface Canivore<E extends Animal> extends Hungry<E>
{
	
}
//original
// interface Herbivore<E extends Plant> extends Hungry<E>
//change 1: this is OK! because 'Sheep' is 'Animal'
interface Herbivore<E extends Animal> extends Hungry<E>
{
	
}
abstract class Plant
{
	
}
class Grass extends Plant
{
	
}
abstract class Animal
{
	
}
//original:Won't compile because we are passing 'Sheep' as a parameter to Herbivore which excepts anything which is 'Plant'
//Hence we have to make changes in the class either Sheep or in Herbivore. 
class Sheep extends Animal implements Herbivore<Sheep>

//change 2:Not compile. Because the type Sheep must implement the inherited abstract method Hungry<Plant>.munch(Plant)
//class Sheep extends Animal implements Herbivore<Plant>

//change 3: Not compile! Similar reason as change 2 .The method munch(Sheep) of type Sheep must override or implement a supertype method
//class Sheep extends Plant implements Canivore<Wolf>
{

//	@Override
	public void munch(Sheep x) {
	//change 4:Not compile. Similar to change 3,2 .The type Sheep must implement the inherited abstract method Hungry<Sheep>.munch(Sheep)
	//public void munch(Wolf x) {
		// TODO Auto-generated method stub
		
	}
	
}
class Wolf extends Animal implements Canivore<Sheep>
{

	@Override
	public void munch(Sheep x) {
		// TODO Auto-generated method stub
		
	}
	
}

