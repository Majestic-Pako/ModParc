package Mod2;

import java.time.LocalDate;
import java.util.Random;

import javax.swing.JOptionPane;

public class Proyecto {
	private String registro;
	private LocalDate fecha;
	private int numero;

	public Proyecto(String registro) {
		this.registro = registro;
	}

	public String getRegistro() {
		return this.registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean Pro() {
		if (registro.isEmpty() || registro.length() < 3 || registro.length() > 30) {
			JOptionPane.showMessageDialog(null, "ERROR");
			return false;
		} else {
			for (int i = 0; i < registro.length(); i++) {
				if (Character.isDigit(registro.charAt(i))) {
					JOptionPane.showMessageDialog(null, "Se encoontro un numero");
					return false;
				}
			}
			JOptionPane.showMessageDialog(null, "Datos Aceptados");
			return true;
		}
	}

	public void Day() {
		Random x = new Random();
		int mes = x.nextInt(12) + 1;
		int año = 2024;
		int dia = x.nextInt(28) + 1;
		this.fecha = LocalDate.of(año, mes, dia);
	}
	public boolean Num() {
		if(numero >= 1 && numero <=10) {
			JOptionPane.showMessageDialog(null, "Calificacion Registrada");
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "No cumple las condiciones pedidas");
			return false;
		}
	}
}
