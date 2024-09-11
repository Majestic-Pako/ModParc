import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String datos = "";
		Vtv vehiculo = new Vtv("");
		Vtv Motor = new Vtv("");
		Vtv Frenos = new Vtv("");
		Vtv Suspension = new Vtv("");
		int opcion;
		String auto;
		JOptionPane.showMessageDialog(null, "¡Bienvenido al Sistema de Verificación Técnica Vehicular (VTV)!\n"
				+ "Aquí podrá registrar su vehículo y realizar las pruebas correspondientes de manera rápida y sencilla.");
		do {
			String convertir[] = { "Ultimo Registro", "Inspeccion", "Salir" };
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, 0, 0, null, convertir,
					convertir[0]);
			switch (opcion) {
			case 0:
				if (datos.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Todavia no has registrado ningun Vehiculo");
				} else {
					JOptionPane.showMessageDialog(null, datos);
				}
				break;
			case 1:
				do {
					auto = JOptionPane.showInputDialog("Ingresa la marca del auto");
					vehiculo.setAuto(auto);
				} while (!vehiculo.ValidarNombre());
				JOptionPane.showMessageDialog(null, "Vehiculo registrado  " + vehiculo.getAutos());
				String motor = Vtv.Elecciones("Motor");
				Motor.setDatos(motor);

				String frenos = Vtv.Elecciones("frenos");
				Frenos.setDatos(frenos);

				String suspension = Vtv.Elecciones("Sistema de Suspension");
				Suspension.setDatos(suspension);

				String res = "Vehículo " + vehiculo.getAutos() + "\nPruebas Realizadas: " + "\nEstado de motor: "
						+ Motor.getDatos() + "\nEstado de Frenos: " + Frenos.getDatos() + "\nEstado de Suspension: "
						+ Suspension.getDatos();
				JOptionPane.showMessageDialog(null, res);

				String fin = vehiculo.Final(motor, frenos, suspension);
				JOptionPane.showMessageDialog(null, fin);
				datos = "Vehiculo: " + vehiculo.getAutos() + "\nInforme: " + vehiculo.getRegistro();
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Informe Terminado. Hasta pronto.");
				break;
			}
		} while (opcion != 2);
	}

}
