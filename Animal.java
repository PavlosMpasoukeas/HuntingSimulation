//Pavlos Basoukeas ,AM:5296
abstract class Animal{
	private Cell cell;
	
	public abstract boolean isRabbit();
	
	public abstract boolean breedingTime(int time);
	
	public abstract Animal giveBirth();
	
	public Cell getCell(){
		return cell;
	}
	
    public void setCell(Cell other){
		this.cell = other;
	}
	
	public void die(){
		cell.removeAnimal();
	}
	
	public Animal move(){
		Cell nextCell = cell.getRandomEmptyNeighbor();
		if(nextCell!= null){
			cell.removeAnimal();
			nextCell.setAnimal(this);
			this.setCell(nextCell);
		}
		return null;
	}
	
	public Animal breed(int time){
		if(cell == null){
			return null;
		}
		if(isRabbit()){
			Cell c4 = cell.getRandomEmptyNeighbor();
			if(c4 == null){//kouneli den gennaei me zwo sto geitoniko keli
				return null;
			}
		if(breedingTime(time)){
				Animal newborn = giveBirth();
				c4.setAnimal(newborn);//anaparagetai
				newborn.setCell(c4);
				return newborn;
			}
			return null;
		}
		Cell c6 = cell.getRandomEmptyNeighbor();
		if(c6 == null){//alepou den gennaei an iparhei kapoio zwo sto geitoniko keli
			return null;
		}
		if(breedingTime(time)){
			Animal newborn2 = giveBirth();
			c6.setAnimal(newborn2);
			newborn2.setCell(c6);
			return newborn2;
		}
		return null;
	}
		
}
