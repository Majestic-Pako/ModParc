package Mod2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bienvenido a la ConstructoraArg ");
		int opcion;
		do {
			//Nombres del Menu temporales hasta que encuentre unos mejores
			String convertir[] = {"Registro de proyectos", "Evaluacion de Etapas", "Etapas Pendientes",
									"Fecha de Vigencia de Evaluaciones", "Salir"}; 
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, 0, 0, null, convertir,
					convertir[0]);
			switch (opcion) {
			case 0:
				JOptionPane.showMessageDialog(null, "a");
				break;
			case 1: 
				JOptionPane.showMessageDialog(null, "b");
				break;
			case 2: 
				JOptionPane.showMessageDialog(null, "c");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "d");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "e");
				break;
			}
		}while( opcion != 4);
	}

}
