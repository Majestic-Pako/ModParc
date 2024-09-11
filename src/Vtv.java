import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Vtv {
	private String auto;
	private String datos;
	private String registro;

	public Vtv(String auto) {
		this.auto = auto;
		this.registro = "";
	}

	public void AgReg(String registro) {
		LocalDate fecha = LocalDate.now();
		this.registro = registro + auto + "\nPaso la Vtv " + "\nEl dia " + fecha + "\nProxima inspeccion: "
				+ fecha.plusYears(1);
	}

	public void DegReg(String registro) {
		LocalDate fecha = LocalDate.now();
		this.registro = registro + auto + "\nNo paso la Vtv " + "\n El dia " + fecha + "\nTiene un lapso hasta "
				+ fecha.plusMonths(1) + "\nPara volver a intentarlo sin coste nuevo";
	}

	public String getRegistro() {
		return this.registro;
	}

	public String getAutos() {
		return this.auto;
	}

	public String getDatos() {
		return this.datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}

	public static String Elecciones(String seccion) {
		int x = JOptionPane.showConfirmDialog(null, "Indique el resultado de la prueba " + seccion, seccion,
				JOptionPane.YES_NO_CANCEL_OPTION);
		if (x == JOptionPane.YES_OPTION) {
			return "Aceptado";
		} else if (x == JOptionPane.NO_OPTION) {
			return "Rechazado";
		} else {
			return "No se selecciono ninguna opcion";
		}

	}

	public String Final(String motor, String frenos, String suspension) {
		if (motor.equals("Aceptado") && frenos.equals("Aceptado") && suspension.equals("Aceptado")) {
			this.AgReg("El vehiculo: ");
			return this.getRegistro();
		} else {
			this.DegReg("El vehiculo: ");
			return this.getRegistro();
		}
	}

	public boolean ValidarNombre() {
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
