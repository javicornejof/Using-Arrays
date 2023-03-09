package cl.edutecno;

		import java.util.ArrayList;
	public class Visitas {

	public static void main(String[] args) { //3001 1402 1304 1505
			
					ArrayList <Integer> visitas = new ArrayList <Integer>();
					for (int i = 0; i < args.length; i++) {
					
					visitas.add(Integer.parseInt(args [i]));
						
					}
					float retorno = promedio(visitas);	
					System.out.println(retorno);
					
			}

			

		public static float promedio(ArrayList<Integer> visitasRecibidas) {
			
			int suma=0;
			for (int i = 0; i < visitasRecibidas.size(); i++) {
				suma= suma + visitasRecibidas.get(i);
					
				}
				float promedio = suma/visitasRecibidas.size();
				
				
			return promedio;
		}
	}

