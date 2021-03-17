package work7;

public  class App {
 
	 static String greet="welcome";
	 public  App() {
		 String greet="Hello";
		 this.greet=greet;
	 }
	 public void setGreet() {
		 String greet="Good Day";
		 
	 }
 
	public static void main(String[] args) {
		App t=new App();
		//System.out.println(greet+"56565");
		String greet ="good Luck";
		
		System.out.println(t.greet);
		

	}

}
