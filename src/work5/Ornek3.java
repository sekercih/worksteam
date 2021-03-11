package work5;

public class Ornek3 {
interface Exportable{
	void export();
	
}
class Tool implements Exportable{
	

public void export() {
	System.out.println("Tool::export");
}
}	
class ReportTool extends Tool{

}

public static void main(String[] args) {
		 

	}

}
