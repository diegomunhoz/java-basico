package exemplo10;

public class TestaTrim {

	public static void main(String[] args) {
		
		String um = "Ol� ";
		String dois = "Mundo ";
		System.out.println("Antes do Trim: " + um + dois + ".");
		um = um.trim();
		dois = dois.trim();
		System.out.println("Depois do Trim: " + um + dois + ".");
	}

}
