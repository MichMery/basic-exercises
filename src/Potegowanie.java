
public class Potegowanie {
	public static int potega(int podstawa, int potega) {
		
		while (potega>=0){
			potega=podstawa*=potega;
			if(potega==2) {
				potega=podstawa*podstawa;
						}
			if (potega==1) {
				potega=podstawa;
			}
				if(potega==0) {
					potega=1;
				}
				
			}
				
			while (potega<0) {
				potega=1/(podstawa*=potega);
			}	
			
			return potega;
			}
}
