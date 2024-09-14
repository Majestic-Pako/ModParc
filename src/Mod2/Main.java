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
			String convertir[] = { "Registro de proyectos", "Evaluacion de Etapas","Lista de Etapas", "Etapas Pendientes",
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
				Calificacion.Evaluacion(etapas);
				break;
			case 2:
				if(Calificacion.Flag(etapas)) {
					JOptionPane.showMessageDialog(null, "Todavia no has registrado ninguna Calificacion a las Etapas");
				}else {
					JOptionPane.showMessageDialog(null, Calificacion.Mostrar(etapas));
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "En proceso...");
				break; 
			case 4:
				JOptionPane.showMessageDialog(null, "En proceso...");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Cerrando sesion...");
				break;
			}
		} while (opcion != 5);
	}

}
