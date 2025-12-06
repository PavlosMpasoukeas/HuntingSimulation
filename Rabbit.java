//Pavlos Basoukeas ,AM:5296
class Rabbit extends Animal{
	
	public boolean isRabbit(){
		return true;
	
	}
	
	public boolean breedingTime(int time){
		if(time %3 == 0){
			return true;
		}
		return false;
	}
	
	public Animal giveBirth(){
		return new Rabbit();
	}
	
	public String toString(){
		return "o";
	}
	
}