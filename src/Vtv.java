import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Vtv {
	private String auto;
	private int datos;
	private String registro;
	
	public Vtv(String auto) {
		this.auto = auto;
		this.registro = "";
	}
	public void AgReg(String registro) {
		this.registro = registro + registro + " dia " + LocalDate.now();
	}
	public String getRegistro(){
		return this.registro;
	}
	public String getAutos() {
		return this.auto;
	}
	public void setDatos(int datos) {
		this.datos = datos;
	}
	public void setAuto(String auto) {
		this.auto = auto;
	}

	
}
