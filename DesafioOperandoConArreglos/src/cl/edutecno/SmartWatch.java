package cl.edutecno;



import java.util.ArrayList;



public class SmartWatch {



public static void main(String[] args) {

 

ArrayList<Integer> pasos = new ArrayList<Integer>();

 

for (int i = 0; i < args.length; i++) {

pasos.add(Integer.parseInt(args[i]));

}

 

ArrayList<Integer> pasos_limpios = clearSteps(pasos);

 

System.out.println(pasos_limpios);



}

 

 

private static ArrayList<Integer> clearSteps(ArrayList<Integer> pasos) {

System.out.println(pasos);

ArrayList<Integer> pasos_filtrados = new ArrayList<Integer>();

for (Integer temp : pasos) {

 

if (!(temp < 200 || temp >=100000)) {

pasos_filtrados.add(temp);

}

}

return pasos_filtrados;

}

 

}