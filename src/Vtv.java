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
		this.registro = registro + auto + " Paso la Vtv "+ "\nEl dia " + fecha + 
						"\nProxima inspeccion: " + fecha.plusYears(1) ;
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
		int x = JOptionPane.showConfirmDialog(null, "Indique el resulatdo de la prueba " + seccion, seccion,
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
		if(motor.equals("Aceptado") && frenos.equals("Aceptado") && suspension.equals("Aceptado")) {
			this.AgReg("El vehiculo: ");
			return this.getRegistro();
		}else {
			return "No paso las pruebas de la Vtv";
		}
	}

}
