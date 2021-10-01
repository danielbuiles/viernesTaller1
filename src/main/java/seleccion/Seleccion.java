/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccion;

import java.util.ArrayList;
import java.util.Scanner;
import jugador.Jugador;

/**
 *
 * @author Daniel
 */
public class Seleccion {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion;
        int contador=0;
        int nroCamiseta;
        String nombre;
        String apellido;
        String posicion;
        int  edad;
        String equipo;
        
        
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        
        do{
            System.out.println("");
            System.out.println("");
            System.out.println("Bienvenido");
            System.out.println("***************");
            
            System.out.println("1. Agregar Jugador");
            System.out.println("2. Buscar Jugador");
            System.out.println("3. editar informacion de jugador por id");
            System.out.println("4. Mostrar la convocatoria");
            System.out.println("5. salir");
            
            opcion=entrada.nextInt();
            System.out.println("\n \n");
            
            switch(opcion){
                case 1 -> {
                    System.out.println("Registro de Jugador "+contador+":");
                    
                    System.out.println("nro de Camisata: ");
                    nroCamiseta = entrada.nextInt();
                    
                    System.out.println("Nombre: ");
                    nombre = entrada.next();
                    
                    System.out.println("Apellido: ");
                    apellido=entrada.next();
                    
                    System.out.println("Posicion: ");
                    posicion=entrada.next();
                    
                    System.out.println("Edad: ");
                    edad=entrada.nextInt();
                    
                    System.out.println("Equipo: ");
                    equipo=entrada.next();
                    
                    jugadores.add(contador,new Jugador(contador,nroCamiseta,nombre,apellido,posicion,edad,equipo));
                    
                    contador++;
                }
                case 2 -> {
                    System.out.println("id para buscar: ");
                    int id = entrada.nextInt();
                    boolean existe =false;
                    
                    for (Jugador jugadore : jugadores) {
                        if (jugadore.getId() == id) {
                            existe=true;
                            System.out.println("camiseta: " + jugadore.getNroCamiseta() + "\n" + "Nombre: " + jugadore.getNombre() + "\n" + "Apellido: " + jugadore.getApellido() + "\n" + "Posicion: " + jugadore.getPosicion() + "\n" + "Edad: " + jugadore.getEdad() + "\n" + "Equipo: " + jugadore.getEquipo());
                        }
                    }
                    if(!existe){
                        System.out.println("\n el jugador buscando no esta en la base de datos \n");
                    }
                }

                case 3 -> {
                    System.out.println("id para buscar: ");
                    int id = entrada.nextInt();
                    boolean existe =false;
                    
                    for (Jugador jugadore : jugadores) {
                        if (jugadore.getId() == id) {
                            System.out.println("nroCamiseta: ");
                            jugadore.setNroCamiseta(entrada.nextInt());
                            
                            System.out.println("nombre: ");
                            jugadore.setNombre(entrada.next());
                            
                            System.out.println("apellido: ");
                            jugadore.setNombre(entrada.next());
                            
                            System.out.println("posicion: ");
                            jugadore.setPosicion(entrada.next());
                            
                            System.out.println("edad: ");
                            jugadore.setEdad(entrada.nextInt());
                            
                            System.out.println("equipo: ");
                            jugadore.setEquipo(entrada.next());
                        }
                    }
                    if(!existe){
                        System.out.println("\n el jugador buscando no esta en la base de datos \n");
                    }
                }
                case 4 -> {
                    for (Jugador jugadore : jugadores) {
                        System.out.println("camiseta: " + jugadore.getNroCamiseta() + "\n" + "Nombre: " + jugadore.getNombre() + "\n" + "Apellido: " + jugadore.getApellido() + "\n" + "Posicion: " + jugadore.getPosicion() + "\n" + "Edad: " + jugadore.getEdad() + "\n" + "Equipo: " + jugadore.getEquipo());
                        System.out.println("");
                        System.out.println("");
                    }
                }
                    
                case 5 -> {
                    System.out.println("Gracias por usar nuestro software ;D");
                    System.exit(0);
                }
                    
                default -> System.out.println("elegir una opcion disponible 1-5");
            }

        }while(opcion!=5);
    }
    
    public void agregarJugador(){
        
    }
    
}
