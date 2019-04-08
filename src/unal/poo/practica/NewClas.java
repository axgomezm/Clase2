package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class NewClas
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);

            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 0, Direction.EAST,10);
           move(5);
           left(3);
           move(5);
            left(3);
           move(4);
           left(3);
           move(4);
            left(3);
           move(3);
            left(3);
           move(3);
            left(3);
            move(2);
            left(3);
            move(2);
            left(3);
            move(1);
            left(3);
            move(1);
           
           
                  
        }
        public static void move(int x){
        for(int i=0;i<x;i++)
            estudiante.move();
        }
        public static void left(int x){
        for(int i=0;i<x;i++)
            estudiante.turnLeft();
        }
        
}

