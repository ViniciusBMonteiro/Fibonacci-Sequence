package programa;

public class Main {
	
	public static void main(String[] args) {
		
		int fiboAnt = 0;
		int fiboPos = 1;
		
		for(int i = 1; i < 20; i++) {
			System.out.println(fiboAnt);
			int fiboAux = fiboAnt + fiboPos;
			fiboPos = fiboAnt;
			fiboAnt = fiboAux;
			
		}
		
	}

}
