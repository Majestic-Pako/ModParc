import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Vtv vehiculo = new Vtv("");
		Vtv Motor = new Vtv("");
		Vtv Frenos = new Vtv("");
		Vtv Suspension = new Vtv("");
		int opcion;
		String auto;
		String motor;
		String frenos;
		String suspension;
		JOptionPane.showMessageDialog(null,
				"Bienvenido a la VTV ingrese el vehiculo \n Ingrese como se encuentra el estado del auto");
		do {
			String convertir[] = { "Registro de autos", "Inspeccion", "Salir" };
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, 0, 0, null, convertir,
					convertir[0]);
			switch (opcion) {
			case 0:
				JOptionPane.showMessageDialog(null, "El Vehiculo: "+vehiculo.getAutos()+
												"\nInforme: " +vehiculo.getRegistro());
				break;
			case 1:
				do {
					auto = JOptionPane.showInputDialog("Ingresa la marca del auto");
				} while (!ValidarNombre(auto));
				vehiculo.setAuto(auto);
				JOptionPane.showMessageDialog(null, "Vehiculo registrado  " + vehiculo.getAutos());
				motor = Vtv.Elecciones("Motor");
				Motor.setDatos(motor);

				frenos = Vtv.Elecciones("frenos");
				Frenos.setDatos(frenos);

				suspension = Vtv.Elecciones("Sistema de Suspension");
				Suspension.setDatos(suspension);

				String res = "Vehículo " + vehiculo.getAutos() + "\nPruebas Realizadas: " + "\nEstado de motor: "
						+ Motor.getDatos() + "\nEstado de Frenos: " + Frenos.getDatos() + "\nEstado de Suspension: "
						+ Suspension.getDatos();
				JOptionPane.showMessageDialog(null, res);
				
				String fin = vehiculo.Final(motor, frenos, suspension);
				JOptionPane.showMessageDialog(null, fin);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Informe Terminado. Hasta pronto.");
				break;
			}
		} while (opcion != 2);
	}

	public static boolean ValidarNombre(String auto) {
		if (auto.isEmpty() || auto.length() < 3 || auto.length() > 25) {
			JOptionPane.showMessageDialog(null, "ERROR en la Cantidad de caracteres");
			return false;
		} else {
			for (int i = 0; i < auto.length(); i++) {
				if (Character.isDigit(auto.charAt(i))) {
					JOptionPane.showMessageDialog(null, "Hay un nùmero");
					return false;
				}
			}
			JOptionPane.showMessageDialog(null, "Marca valida");
			return true;
		}
	}
}
