/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_luiscastro;

import java.util.Scanner;

/**
 *
 * @author lfern
 */
public class Lab3P1_LuisCastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("*****Menu*****");
        System.out.println("1. Ejercicio 1: Sucesiones y mas sucesiones.");
        System.out.println("2. Ejercicio 2: Pocket Monsters.");
        System.out.println("3. Ejercicio 3: Asterisco en casa!");
        System.out.println("Elija una opcion: ");
        int opcion = leer.nextInt();
        
        while(opcion>0 && opcion<4){
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el numero inicial: ");
                    int num_in = leer.nextInt();
                    System.out.print("Ingrese la diferencia: ");
                    int diferencia = leer.nextInt();
                    System.out.print("Ingrese la cantidad de numeros a visualizar: ");
                    int cant_num = leer.nextInt();
                    int valor = 0;
                    int diferencia2 = diferencia;
                    
                    for(int contador=1; contador <= cant_num; contador++){
                        if(contador == 1){
                            System.out.print(num_in+", ");
                        }else{
                            if(contador == 2){
                                valor = num_in + diferencia;
                                System.out.print(valor+", ");
                                diferencia +=1;
                            }else{
                                if(contador !=1 && contador !=2 && contador != cant_num){
                                    valor =  valor + diferencia;
                                    System.out.print(valor+", ");
                                    diferencia +=1; 
                                }else{
                                    if(contador == cant_num){
                                        valor = valor + diferencia;
                                        System.out.print(valor+" ");
                                    }
                                }
                            }
                        }
                    }//fin for
                    System.out.println();
                    System.out.print("Que numero desea ver mas adelante en la sucesion: ");
                    int num_deseado = leer.nextInt();
                    int valor_deseado = 0;
                    for(int contador2=1; contador2 < num_deseado; contador2++)
                        if(contador2==1){
                            valor_deseado = num_in + diferencia2;
                            diferencia2 +=1;
                        }else{
                            valor_deseado = valor_deseado + diferencia2;
                            diferencia2 +=1;
                        }
                    System.out.print("El numero seria: "+valor_deseado);
                    System.out.println("");
                    break; //fin case 1
                case 2:
                    System.out.println("Opcion 2.");
                    break;
                case 3:
                    System.out.println("Ingrese un numero impar y mayor a 7: ");
                    int num_impar = leer.nextInt();
                    while(num_impar%2 == 0 || num_impar < 7){
                        System.out.println("Opcion invalida, ingrese de nuevo.");
                        num_impar = leer.nextInt();
                    }
                    for(int contador = 1; contador <= num_impar; contador++){
                        for(int contador2 = 1; contador2<= num_impar; contador2++) {
                            if(contador == 1||contador == num_impar){
                                System.out.print("*");
                            }else if (contador2 == 1|| contador2 == num_impar){
                                    System.out.print("*");   
                            }
                            else if(contador2 == (num_impar/2) + 1 && contador !=1 && contador != num_impar){
                                System.out.print("|");
                            }
                            else if(contador == contador2 && contador2 !=1 && contador !=1 && contador !=num_impar && contador != (num_impar/2) + 1){
                                System.out.print(">");
                            }
                            else if(contador + contador2 == num_impar + 1 && contador != (num_impar/2)+ 1 && contador !=1 && contador !=num_impar){
                                System.out.print(">");
                            }else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }//fin switch externo
        System.out.println("*****Menu*****");
        System.out.println("1. Ejercicio 1: Sucesiones y mas sucesiones.");
        System.out.println("2. Ejercicio 2: Pocket Monsters.");
        System.out.println("3. Ejercicio 3: Asterisco en casa!");
        System.out.println("Si desea continuar elija una opcion: ");
        
        opcion = leer.nextInt();
        }//fin while externo
    }//fin del main   
}//fin de la clase
