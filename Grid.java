//Pavlos Basoukeas ,AM:5296
import java.util.Random;
class Grid{
	private final int size = 20;
	private Cell[][] grd;
	
	public Grid(){
		grd = new Cell[size][size];
		for(int i = 0;i<size;i++){
			for(int j = 0;j<size;j++){
				Cell cell = new Cell(i,j);//DHMIOURGW TA KELIA ME SIDETAGMENES(i,j)
				grd[i][j] = cell;		  //prosthetw to kathe keli ston pinaka
			}
		}
		
		for(int i = 0;i<size;i++){
			for(int j = 0;j<size;j++){
				if(i > 0){
					grd[i][j].addNeighbor(grd[i - 1][j]);//PANW GEITONAS
				}
				if(i < size -1){
					grd[i][j].addNeighbor(grd[i + 1][j]);//KATW GEITONAS
				}
				if(j> 0){
					grd[i][j].addNeighbor(grd[i][j - 1]);//ARISTERA GEITONAS
				}
				if(j < size -1){
					grd[i][j].addNeighbor(grd[i][j + 1]);//DEXIA GEITONAS
				}
			}
		}
	}
	
	public void addAnimal(Animal animal){
		int x = 0;
		Random random = new Random();
		while(x < 999){
			int i = random.nextInt(20);
			int j = random.nextInt(20);
			Cell cell = grd[i][j];//παιρνω τυχαιο κελι
		    if(cell.isEmpty()){//An  brei adeio keli
				cell.setAnimal(animal);//to prosthetei se tihaia adeio keli
				animal.setCell(cell);//enimerwnei kai to keli tou animal
				return;
			}
			x++;
		}
		
	}
	
	public String toString(){
		String y = "";
		for(int i = 0;i<size;i++){
			for(int j = 0;j<size;j++){
				
				y+= grd[i][j]+" ";
			}
			y+="\n";
		}
		return y;
	}
	
	
	
	
}
	