import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        suma(17,18,32);

        coche MyCoche = new coche();
        MyCoche.quitar_puerta();
        MyCoche.addPuertas();
    }
    public static void suma(int a, int b, int c){
        int suma;
        suma = a+b+c;
        System.out.println("La suma de los 3 numeros es: "+suma);
    }
}
class coche{
    int puertas= 4;
    public void quitar_puerta(){
        if(puertas>0){
            puertas=puertas-1;
            System.out.println("El numero de pueras es: "+puertas);
        }
        else
            System.out.println("No hay mas puertas que quitar");
    }

    public void addPuertas(){
        Scanner read = new Scanner(System.in);
        System.out.println("Cuantas puertas desea agregar");
        int a = read.nextInt();
        puertas=puertas+a;
        System.out.println("El numero de puertas es: "+puertas);

    }

}

