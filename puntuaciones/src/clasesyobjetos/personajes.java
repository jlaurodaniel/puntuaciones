
package clasesyobjetos;
import java.util.Scanner;

public class personajes {
   int puntuacion ; 
   
   
public static void main ( String [] args){
Scanner input = new Scanner(System.in);
    
personajes mago= new personajes ();
System.out.println ("puntuacion del mago? : ");
mago.puntuacion=input.nextInt();


personajes constructor =new personajes() ;
System.out.println ("puntuacion del constructor? : ");
constructor.puntuacion=input.nextInt();



personajes guerrero =new personajes ();
System.out.println ("puntuacion del guerrero? : ");
guerrero.puntuacion=input.nextInt();


//Busqueda y orden de la puntuacion mas grande ,media y menor 

if ((mago.puntuacion>constructor.puntuacion )&&(constructor.puntuacion>guerrero.puntuacion)){
System.out.println("El mago tiene mayor puntuacion con "+mago.puntuacion +" puntos "
+"El constructor tiene "+constructor.puntuacion+" puntos "
+"El guerrero es el que menos  tiene ,tiene "+guerrero.puntuacion+"puntos");
}


else if ((mago.puntuacion>guerrero.puntuacion )&&(guerrero.puntuacion>constructor.puntuacion)){
System.out.println(
"El mago tiene mayor puntuacion con "          +mago.puntuacion +" puntos "
+"El guerrero tiene "                           +guerrero.puntuacion+" puntos "
+"El constructor es el que menos  tiene ,tiene "+constructor.puntuacion+"puntos");
}

else if ((constructor.puntuacion>mago.puntuacion )&&(mago.puntuacion>guerrero.puntuacion)){
System.out.println(
"El constructor tiene mayor puntuacion con "          +constructor.puntuacion +" puntos "
+"El mago tiene "                           +mago.puntuacion+" puntos "
+"El guerrero es el que menos  tiene ,tiene "+guerrero.puntuacion+"puntos");
}    

else if ((constructor.puntuacion>guerrero.puntuacion )&&(guerrero.puntuacion>mago.puntuacion)){
System.out.println(
"El constructor tiene mayor puntuacion con "          +constructor.puntuacion +" puntos "
+"El guerrero tiene "                           +guerrero.puntuacion+" puntos "
+"El mago es el que menos  tiene ,tiene "+mago.puntuacion+"puntos");
}


else if ((guerrero.puntuacion>mago.puntuacion )&&(mago.puntuacion>constructor.puntuacion)){
System.out.println(
"El guerrero tiene mayor puntuacion con "          +guerrero.puntuacion +" puntos "
+"El mago tiene "                           +mago.puntuacion+" puntos "
+"El constructor es el que menos  tiene ,tiene "+constructor.puntuacion+"puntos");
}

else{
    System.out.println(
"El guerrero tiene mayor puntuacion con "          +guerrero.puntuacion +" puntos "
+"El constructor tiene "                           +constructor.puntuacion+" puntos "
+"El mago es el que menos  tiene ,tiene "+mago.puntuacion+"puntos");
}

  }
}
