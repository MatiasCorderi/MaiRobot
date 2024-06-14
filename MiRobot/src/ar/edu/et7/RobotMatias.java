package ar.edu.et7;

import robocode.Robot;


//TODO Renombrar este archivo y el nombre de la clase, 
//el nombre debe incluir el apellido del alumno

public class RobotMatias extends Robot {
	
	public void run() {
		
		while(true) {
			
			//TODO modificar este bloque de código y recargar 
			//en Robocode presionando Restart
            ahead(300);

            turnGunRight(660);

            back(200);

            turnGunRight(860);		}
	}
}
