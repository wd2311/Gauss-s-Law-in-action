package fieldVsRadius;

public class FieldVsRadius {

	double R = 10; //cm
	double Qin = 6; //mC
	double E0 = 8.85 * Math.pow(10,-12);
	
	public static void main(String[] args){
		FieldVsRadius GO = new FieldVsRadius();
		GO.go();
	}//main
	
	private void go(){
		for(double i = 0; i < 100; i = i + 1){
			System.out.println(i + "\t" + ElectricFieldOfR(i)/1000000);
		}
	}//go
	
	private double ElectricFieldOfR(double r){
		if(r < R){
			return r * (Qin/(4*Math.PI*Math.pow(R,3)*E0));
		}else{
			return 1/Math.pow(r,2) * (Qin/(4*Math.PI*E0));
		}
	}
	
}//FieldVsRadius
