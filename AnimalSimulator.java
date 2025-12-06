//Pavlos Basoukeas ,AM:5296
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

class AnimalSimulator{
	private int NUM_OF_FOXES = 5;
	private int NUM_OF_RABBITS = 100;
	private HashSet<Animal> hs = new HashSet<Animal>();
	
	public void populate(Grid grid){
		for(int i = 0;i<NUM_OF_RABBITS;i++){
			Rabbit r = new Rabbit();
			grid.addAnimal(r);
			hs.add(r);
			
		}
		
		for(int i = 0;i<NUM_OF_FOXES;i++){
			Fox f = new Fox();
			grid.addAnimal(f);
			hs.add(f);
		}
	}
	
	public void moveAndBreedAnimals(int time){
		ArrayList<Animal> ar = new ArrayList<Animal>(hs);
		Collections.shuffle(ar);
		for(int i = 0;i<ar.size();i++){
			Animal animal2 = ar.get(i).move();
			if(animal2 != null){  
				hs.remove(animal2); //AFOU PROXWRISE KAI FAGWTHIKE DEN THA BOREI META NA ANAPARAXTHEI
			}
			Animal animal = ar.get(i).breed(time);
			if(animal!=null){//an genisei odws
				hs.add(animal);//bazw sto set to mwro toy
				
			}
			
		}
		
	}
	
	
}
	
	