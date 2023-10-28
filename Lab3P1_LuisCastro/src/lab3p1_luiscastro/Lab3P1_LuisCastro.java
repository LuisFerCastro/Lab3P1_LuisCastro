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
                double vida_Sylv = 280.0;
                double ataq_Sylv = 80.0;
                double def_Sylv = 0.15;
                double vida_Gyar = 300.0;
                double ataq_Gyar = 50.0;
                double def_Gyar = 0.10;
                double vida_Gira = 300.0;
                double ataq_Gira = 70.0;
                double def_Gira = 0.25;
                double vida_Drag = 250.0;
                double ataq_Drag = 75.0;
                double def_Drag = 0.20;
                int ganador = 0;
                System.out.println("Ingrese que modo de pelea desea: ");
                System.out.println("1. Hasta la muerte.");
                System.out.println("2. Por rondas.");
                int opcion_pelea = leer.nextInt();
                switch(opcion_pelea){
                    case 1:
                        System.out.println("Estadisticas de los pokemones.");
                        System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                        System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                        System.out.println("Giratina Vida:300 Ataque:70 Defensa: 25%");
                        System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                            
                        System.out.println("Ingrese una pelea determinada: ");
                        System.out.println("1. Sylveon vs Dragonite");
                        System.out.println("2. Gyarados vs Giratina");
                        System.out.println("3. Dragonite vs Giratina");
                        System.out.println("4. Giratina vs Sylveon");
                        
                        int opcion3 = leer.nextInt();
                        switch(opcion3){
                            case 1:
                                while(vida_Sylv > 0|| vida_Drag >0){
                                    vida_Sylv -= ataq_Drag-(ataq_Drag*def_Sylv);
                                    if(vida_Sylv < 0){
                                        vida_Sylv = 0.0;
                                        System.out.println("Pokemon 2 es el ganador.");
                                        break;
                                    }
                                    vida_Drag -= ataq_Sylv-(ataq_Sylv*def_Drag);
                                    if(vida_Drag <0){
                                        vida_Drag= 0.0;
                                        System.out.println("Pokemon 1 es el ganador.");
                                        break;
                                    }
                                    System.out.println("Vida de pokemon 1: "+vida_Sylv);
                                    System.out.println("Vida de pokemon 2: "+vida_Drag);
                                }
                                    break;//fin batalla 1
                            case 2:
                                while(vida_Gyar > 0|| vida_Gira >0){
                                    vida_Gyar -= ataq_Gira-(ataq_Gira*def_Gyar);
                                    if(vida_Gyar < 0){
                                        vida_Gyar = 0.0;
                                        System.out.println("Pokemon 2 es el ganador.");
                                        break;
                                    }
                                    vida_Gira -= ataq_Gyar-(ataq_Gyar*def_Gira);
                                    if(vida_Gira <0){
                                        vida_Gira= 0.0;
                                        System.out.println("Pokemon 1 es el ganador.");
                                        break;
                                    }
                                    System.out.println("Vida de pokemon 1: "+vida_Gyar);
                                    System.out.println("Vida de pokemon 2: "+vida_Gira);
                                }
                                    break;//fin batalla 2
                            case 3:
                                while(vida_Drag > 0|| vida_Gira >0){
                                    vida_Drag -= ataq_Gira-(ataq_Gira*def_Drag);
                                    if(vida_Drag < 0){
                                        vida_Drag = 0.0;
                                        System.out.println("Pokemon 2 es el ganador.");
                                        break;
                                    }
                                    vida_Gira -= ataq_Drag-(ataq_Drag*def_Gira);
                                    if(vida_Gira <0){
                                        vida_Gira= 0.0;
                                        System.out.println("Pokemon 1 es el ganador.");
                                        break;
                                    }
                                    System.out.println("Vida de pokemon 1: "+vida_Drag);
                                    System.out.println("Vida de pokemon 2: "+vida_Gira);
                                }
                                    break;//fin batalla 3
                            case 4:
                                while(vida_Gira > 0|| vida_Sylv >0){
                                    vida_Gira -= ataq_Sylv-(ataq_Sylv*def_Gira);
                                    if(vida_Gira < 0){
                                        vida_Gira = 0.0;
                                        System.out.println("Pokemon 2 es el ganador.");
                                        break;
                                    }
                                    vida_Sylv -= ataq_Gira-(ataq_Gira*def_Sylv);
                                    if(vida_Sylv <0){
                                        vida_Sylv= 0.0;
                                        System.out.println("Pokemon 1 es el ganador.");
                                        break;
                                    }
                                    System.out.println("Vida de pokemon 1: "+vida_Gira);
                                    System.out.println("Vida de pokemon 2: "+vida_Sylv);
                                }
                                    break;//fin batalla 4
                        }//fin batallas muerte subita
                    case 2:
                        System.out.println("Ingrese el numero de rondas: ");
                                int n_rondas = leer.nextInt();
                                while(n_rondas>10||n_rondas<0){
                                    System.out.println("Numero rondas invalidas. Solo se puede menor a 10.");
                                    System.out.println("Ingrese de nuevo: ");
                                    n_rondas = leer.nextInt();
                                }
                                System.out.println("Estadisticas de los pokemones.");
                                System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                                System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                                System.out.println("Giratina Vida:300 Ataque:70 Defensa: 25%");
                                System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                            
                                System.out.println("Ingrese una pelea determinada: ");
                                System.out.println("1. Sylveon vs Dragonite");
                                System.out.println("2. Gyarados vs Giratina");
                                System.out.println("3. Dragonite vs Giratina");
                                System.out.println("4. Giratina vs Sylveon");
                                
                                int opcion4 = leer.nextInt();
                                switch(opcion4){
                                    case 1:
                                        for(int contador = 1; contador <= n_rondas; contador++){
                                            System.out.println("------- Ronda "+contador+" -------");
                                            System.out.println("Vida de pokemon 1: "+vida_Sylv);
                                            System.out.println("Vida de pokemon 2: "+vida_Drag);
                                            System.out.println();
                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            double danno_Sylv = ataq_Sylv*def_Drag;
                                            double danno_Drag = ataq_Drag*def_Sylv;
                                            
                                            vida_Sylv = vida_Sylv - (ataq_Drag-danno_Drag);
                                            vida_Drag = vida_Drag - (ataq_Sylv-danno_Sylv);
                                            if(vida_Sylv < 0.0){
                                                System.out.println("Vida de pokemon 1: 0.0");
                                                System.out.println("Vida de pokemon 2: "+vida_Drag);
                                                ganador = 1;
                                                break;
                                            }else{
                                                if(vida_Drag < 0.0){
                                                    System.out.println("Vida de pokemon 1:"+vida_Sylv);
                                                    System.out.println("Vida de pokemon 2: 0.0");
                                                    ganador = 2;
                                                    break;
                                                }
                                                else{
                                                    System.out.println("Vida del pokemon 1: "+vida_Sylv);
                                                    System.out.println("Vida del pokemon 2: "+vida_Drag);
                                                }
                                            }
                                        }
                                        System.out.println("*******Fin de la batalla*******");
                                        switch(ganador){
                                            case 1:
                                                System.out.println("Pokemon 1 ha sido el ganador.");
                                                break;
                                            case 2:
                                                System.out.print("El pokemon 2 ha sido el ganador.");
                                                break;
                                        }
                                        break; //fin batalla 1
                                    case 2:
                                        for(int contador = 1; contador <= n_rondas; contador++){
                                            System.out.println("------- Ronda "+contador+" -------");
                                            System.out.println("Vida de pokemon 1: "+vida_Gyar);
                                            System.out.println("Vida de pokemon 2: "+vida_Gira);
                                            System.out.println();
                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            double danno_Gyar = ataq_Gyar*def_Gira;
                                            double danno_Gira = ataq_Gira*def_Gyar;
                                            
                                            vida_Gyar = vida_Gyar - (ataq_Gira-danno_Gira);
                                            vida_Gira = vida_Gira - (ataq_Gyar-danno_Gyar);
                                            if(vida_Gyar < 0.0){
                                                System.out.println("Vida de pokemon 1: 0.0");
                                                System.out.println("Vida de pokemon 2: "+vida_Gira);
                                                ganador = 1;
                                                break;
                                            }else{
                                                if(vida_Gira < 0.0){
                                                    System.out.println("Vida de pokemon 1: "+vida_Gyar);
                                                    System.out.println("Vida de pokemon 2: 0.0");
                                                    ganador = 2;
                                                    break;
                                                }
                                                else{
                                                    System.out.println("Vida del pokemon 1: "+vida_Gyar);
                                                    System.out.println("Vida del pokemon 2: "+vida_Gira);
                                                }
                                            }
                                        }
                                        System.out.println("*******Fin de la batalla*******");
                                        switch(ganador){
                                            case 1:
                                                System.out.println("Pokemon 1 ha sido el ganador.");
                                                break;
                                            case 2:
                                                System.out.print("El pokemon 2 ha sido el ganador.");
                                                break;
                                        }
                                        break; //fin batalla 2
                                    case 3:
                                        for(int contador = 1; contador <= n_rondas; contador++){
                                            System.out.println("------- Ronda "+contador+" -------");
                                            System.out.println("Vida de pokemon 1: "+vida_Drag);
                                            System.out.println("Vida de pokemon 2: "+vida_Gira);
                                            System.out.println();
                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            double danno_Drag = ataq_Drag*def_Gira;
                                            double danno_Gira = ataq_Gira*def_Drag;
                                            
                                            vida_Drag = vida_Drag - (ataq_Gira-danno_Gira);
                                            vida_Gira = vida_Gira - (ataq_Drag-danno_Drag);
                                            if(vida_Drag < 0.0){
                                                System.out.println("Vida de pokemon 1: 0.0");
                                                System.out.println("Vida de pokemon 2: "+vida_Gira);
                                                ganador = 1;
                                                break;
                                            }else{
                                                if(vida_Gira < 0.0){
                                                    System.out.println("Vida de pokemon 1: "+vida_Drag);
                                                    System.out.println("Vida de pokemon 2: 0.0");
                                                    ganador = 2;
                                                    break;
                                                }
                                                else{
                                                    System.out.println("Vida del pokemon 1: "+vida_Drag);
                                                    System.out.println("Vida del pokemon 2: "+vida_Gira);
                                                }
                                            }
                                        }
                                        System.out.println("*******Fin de la batalla*******");
                                        switch(ganador){
                                            case 1:
                                                System.out.println("Pokemon 1 ha sido el ganador.");
                                                break;
                                            case 2:
                                                System.out.print("El pokemon 2 ha sido el ganador.");
                                                break;
                                        }
                                        break;//fin batalla 3
                                    case 4:
                                        for(int contador = 1; contador <= n_rondas; contador++){
                                            System.out.println("------- Ronda "+contador+" -------");
                                            System.out.println("Vida de pokemon 1: "+vida_Gira);
                                            System.out.println("Vida de pokemon 2: "+vida_Sylv);
                                            System.out.println();
                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            double danno_Gira = ataq_Gira*def_Sylv;
                                            double danno_Sylv = ataq_Sylv*def_Gira;
                                            
                                            vida_Gira = vida_Gira - (ataq_Sylv-danno_Sylv);
                                            vida_Sylv = vida_Sylv - (ataq_Gira-danno_Gira);
                                            if(vida_Gira < 0.0){
                                                System.out.println("Vida de pokemon 1: 0.0");
                                                System.out.println("Vida de pokemon 2: "+vida_Sylv);
                                                ganador = 1;
                                                break;
                                            }else{
                                                if(vida_Sylv < 0.0){
                                                    System.out.println("Vida de pokemon 1: "+vida_Gira);
                                                    System.out.println("Vida de pokemon 2: 0.0");
                                                    ganador = 2;
                                                    break;
                                                }
                                                else{
                                                    System.out.println("Vida del pokemon 1: "+vida_Gira);
                                                    System.out.println("Vida del pokemon 2: "+vida_Sylv);
                                                }
                                            }
                                        }
                                        System.out.println("*******Fin de la batalla*******");
                                        switch(ganador){
                                            case 1:
                                                System.out.println("Pokemon 1 ha sido el ganador.");
                                                break;
                                            case 2:
                                                System.out.print("El pokemon 2 ha sido el ganador.");
                                                break;
                                        }
                                        break;//fin batalla 4
                                        
                    }//fin peleas por rondas
                break;
                }// fin opcion peleas
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
