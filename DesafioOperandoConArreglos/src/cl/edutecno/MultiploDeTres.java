package cl.edutecno;

		import java.util.ArrayList;
	public class MultiploDeTres {

	public static void main(String[] args) { //10 20 30 33 21 8 2 61
			
					ArrayList <Integer> multiplos = new ArrayList <Integer>();
					for (int i = 0; i < args.length; i++) {
					
					multiplos.add(Integer.parseInt(args [i]));
						
					}
					float retorno = suma(multiplos);	
					System.out.println("suma de multiplos de 3 : ");
					System.out.println(retorno);
					
			}

			

		public static float suma(ArrayList<Integer> MultiplosDeTres) {
			
			int suma=0;
			for (int i = 0; i < MultiplosDeTres.size(); i++) {
				if (MultiplosDeTres.get(i) %3==0) {
					suma= suma + MultiplosDeTres.get(i);	
				}
					
				}
			float retorno= promedio1(MultiplosDeTres);
			System.out.println("promedio : ");
			System.out.println(retorno);
				
			return suma;
			
			
		}
	
	public static float promedio1(ArrayList<Integer> MultiplosTres) {
		
		int suma=0;
		for (int i = 0; i < MultiplosTres.size(); i++) {
			suma= suma + MultiplosTres.get(i);
				
			}
			float promedio = suma/MultiplosTres.size();
			
			
		return promedio;
		}
	
	public static float promedio(ArrayList<Integer> MultiplosTres) {
		
		int suma=0;
		for (int i = 0; i < MultiplosTres.size(); i++) {
			suma= suma + MultiplosTres.get(i);
				
			}
			float promedio = suma/MultiplosTres.size();
			
			System.out.println(promedio);
		return promedio;
		
	}
	
}
