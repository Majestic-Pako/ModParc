package Mod2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Proyecto Nombre = new Proyecto("");
		Proyecto Ubicacion = new Proyecto("");
		Proyecto Cliente = new Proyecto("");
		Proyecto Fecha = new Proyecto(""); 
		Proyecto Calificacion = new Proyecto("");
		int[] etapas = new int[5];
		JOptionPane.showMessageDialog(null, "Bienvenido a la ConstructoraArg ");
		int opcion;
		do {
			// Nombres del Menu temporales hasta que encuentre unos mejores
			String convertir[] = { "Registro de proyectos", "Evaluacion de Etapas", "Etapas Pendientes",
					"Fecha de Vigencia de Evaluaciones", "Salir" };
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, 0, 0, null, convertir,
					convertir[0]);
			switch (opcion) {
			case 0:
				do {
					String nombre = JOptionPane.showInputDialog("Ingresa el nombre del proyecto");
					Nombre.setRegistro(nombre);
				} while (!Nombre.Pro());
				do {
					String ubicacion = JOptionPane.showInputDialog("Ingese donde es el proyecto");
					Ubicacion.setRegistro(ubicacion);
				} while (!Ubicacion.Pro());
				do {
					String cliente = JOptionPane.showInputDialog("Ingrese nombre de su cliente");
					Cliente.setRegistro(cliente);
				} while (!Cliente.Pro());
				Fecha.Day();
				JOptionPane.showMessageDialog(null,
						"Nombre del proyecto: " + Nombre.getRegistro() + "\nUbicacion del Proyecto: "
								+ Ubicacion.getRegistro() + "\nNombre del Cliente: " + Cliente.getRegistro()
								+ "\nFecha de Inicio: " + Fecha.getFecha());

				break;
			case 1:
				for (int i = 0; i < etapas.length; i++) {
					int calificacion = -1; 
					boolean flag;
					do {
						String z = JOptionPane.showInputDialog("Ingrese una calificacion para la Etapa "
								+ (i+1) + "\n La calificacion debe ser entre 1 a 10 ");
						if(z != null) {
							calificacion = Integer.parseInt(z);
							Calificacion.setNumero(calificacion);
							flag = Calificacion.Num(); 
							
							if(flag) {
								etapas[i] = calificacion;
							}
						}else {
							JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
							flag = false;
						}
						
					}while(!flag); 
					
				}
				String resultado = "Calificaciones de las etapas:\n";
			    for (int i = 0; i < etapas.length; i++) {
			        resultado += "Etapa " + (i + 1) + " con Calificacion de:  " + etapas[i] + "\n";
			    }
			    JOptionPane.showMessageDialog(null, resultado);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "En proceso...");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "En proceso...");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Cerrando sesion...");
				break;
			}
		} while (opcion != 4);
	}

}
