import java.util.*;
import java.util.Scanner;
import java.util.ArrayList; 
import mapa.coordenadas;

class Main {
  public static void mapa() {

    ArrayList<coordenadas> lista = new ArrayList<coordenadas>();
  
    int numerodeLadosPo;
    double lat, lonj;

    Scanner input = new Scanner(System.in);

    System.out.println("======================================");
    System.out.println("Ingrese Numero de lados de su poligono");
    System.out.println("======================================");

    numerodeLadosPo = input.nextInt();

    for(int a = 0; a < numerodeLadosPo; a++){
      System.out.println("Ingrese su latitud " + (a + 1));
      lat = input.nextDouble();
      System.out.println("Ingrese la longitud " + (a + 1));
      lonj = input.nextDouble();

    coordenadas coo = new coordenadas();
      coo.latitud = lat;
      coo.longitud = lonj;

      lista.add(a, coo);

    }

    System.out.println("===========================");
    System.out.println("Su link es: ");
    System.out.println("===========================");

    System.out.println("https://www.keene.edu/campus/maps/tool/?coordinates=");
    for(int b = 0; b <= numerodeLadosPo; b++){
      if(b != numerodeLadosPo){
        System.out.print(lista.get(b).latitud);
        System.out.print("%2C%20");
        System.out.print(lista.get(b).longitud);
        System.out.print("%0A");
      }else{
        System.out.print(lista.get(0).latitud);
        System.out.print("%2C%20");
        System.out.print(lista.get(0).longitud);

      }
    }
    
  }
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("Tarea coordenadas");
    System.out.println("===========================");
    System.out.println("");
    mapa();

  }
}

