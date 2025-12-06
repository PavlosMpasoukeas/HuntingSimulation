//Pavlos Basoukeas , AM:5296
import java.util.ArrayList;
import java.util.Collections;

class Cell{
	private ArrayList<Cell> neighbors = new ArrayList<Cell>();
	private Animal animal;
	private int row;
	private int colum;
	
	public Cell(int row,int colum){
		this.row = row;
		this.colum = colum;
	}
	
	public Cell getRandomEmptyNeighbor(){
		Collections.shuffle(neighbors);
		for(int i = 0;i<neighbors.size();i++){
			Cell c = neighbors.get(i);
			if(c.isEmpty()){
				return c;
			}
		}
		return null;
	}
	
	public Cell getRandomRabbitNeighbor(){
		Collections.shuffle(neighbors);
		for(int i = 0;i<neighbors.size();i++){
			Cell c2 = neighbors.get(i);
			if(c2.containsRabbit()){
				return c2;
			}
		}
		return null;
	}
	
	public void addNeighbor(Cell cell){
		neighbors.add(cell);
		cell.neighbors.add(this); //Kai ta 2 kelia ginontai geitones metaxi tous
	}
	
	public Animal getAnimal(){
		return this.animal;
	}
	
	public void setAnimal(Animal otheranimal){
		this.animal = otheranimal;
	}
	
	public void removeAnimal(){
		this.animal = null;
	}
	public boolean isEmpty(){
		return this.animal == null;
	}
	
	public boolean containsRabbit(){
		if(!isEmpty() && animal.isRabbit()){
			return true;
		}
		return false;
	}
	
	
	public String toString(){
		if(isEmpty()){
			return "_";
		}
		return animal.toString();
	}
		
		
		
	
	
}