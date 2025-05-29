public class TestAnimal {

	public static void main(String args[]) {
		
	Animal nAnimal[] = new Animal[6];
	
	nAnimal[0] = new Cangur("C1", 2);
	nAnimal[1] = new Lup("L1", 3);
	nAnimal[2] = new Iepure("I1", 4);
	nAnimal[3] = new Cangur("C2", 5);
	nAnimal[4] = new Iepure("I2", 1);
	nAnimal[5] = new Lup("L2", 6);
	
	int c1 = 0, c2 = 0;
	
	for(int i = 0; i <= 5; i++) {
		System.out.println(nAnimal[i].nume + " poate merge pe 2 picioare " + nAnimal[i].mergePe2Picioare());
		
		if(nAnimal[i].mergePe2Picioare()) {
			c1++;
		}
		
		if(nAnimal[i] instanceof Lup) {
			c2++;
		}
	}
	System.out.println("Nr de animale care merg pe 2 picioare: " + c1 + " si numarul animalelor de tip Lup este " + c2);
	
	}
}
