package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator=new WomanGameCalculator() {
			@Override
			public void hesapla() {
				
			}
		};
		
		GameCalculator gameCalculator= new WomanGameCalculator() {
		};
}
}
