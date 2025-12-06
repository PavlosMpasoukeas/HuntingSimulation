//Pavlos Basoukeas ,AM:5296
class Fox extends Animal{
	private int stepsUntilHaveAte = 0;
	
	public boolean isRabbit(){	
		return false;
	}
	
	public boolean breedingTime(int time){
		if(time %8 == 0){
			return true;
		}
		return false;
	}
	
	public Animal giveBirth(){
		return new Fox();		
	}
	
	public String toString(){
		return "X";
	}
	
	public Animal move(){
		Cell c3 = getCell().getRandomRabbitNeighbor();
		if(c3 == null){//an den iparhei keli me kouneli
			stepsUntilHaveAte++;
			if(stepsUntilHaveAte>=3){
				this.die();
				return this;
			}
			return super.move(); 
			
		}
		stepsUntilHaveAte = 0;
		Animal dead = c3.getAnimal();
		dead.die();
		getCell().removeAnimal();//afaireite h alepou apto palio ths keli
		c3.setAnimal(this);//adikathistw me thn alepou sto keli
		this.setCell(c3);//enimerwnw to keli 
		return dead;
	}
}
		