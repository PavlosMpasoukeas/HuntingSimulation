//Pavlos Basoukeas ,AM:5296
import java.util.Scanner;
class Simulation{
	
	public static void main(String args[]){
		Grid grid = new Grid();
		AnimalSimulator as = new AnimalSimulator();
		as.populate(grid);
		System.out.println(grid);
		Scanner sc = new Scanner(System.in);
		String give = sc.nextLine();
		int time = 0;
		int SIMULATION_STEPS = 1000;
		while(give.equals("") && time < SIMULATION_STEPS ){
			time++;
			as.moveAndBreedAnimals(time);
			System.out.println(grid);
			give = sc.nextLine();
		}
		
	}
}