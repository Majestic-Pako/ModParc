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
		if (numero >= 1 && numero <= 10) {
			JOptionPane.showMessageDialog(null, "Calificacion Registrada");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "No cumple las condiciones pedidas");
			return false;
		}
	}

	public void Evaluacion(int[] etapas) {
		for (int i = 0; i < etapas.length; i++) {
			int calificacion = -1;
			boolean flag;
			do {
				String z = JOptionPane.showInputDialog("Ingrese una calificacion para la Etapa " + (i + 1)
						+ "\n La calificacion debe ser entre 1 a 10 ");
				if (z != null) {
					calificacion = Integer.parseInt(z);
					setNumero(calificacion);
					flag = Num();

					if (flag) {
						etapas[i] = calificacion;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
					flag = false;
				}

			} while (!flag);

		}
		String resultado = "Calificaciones de las etapas:\n";
		for (int i = 0; i < etapas.length; i++) {
			resultado += "Etapa " + (i + 1) + " con Calificacion de:  " + etapas[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, resultado);
	} 
	public boolean Flag(int[] etapas) {
		for (int calificacion : etapas) {
			if(calificacion > 0) {
				return false;
			}
		}
		return true;
	} 
	public String Mostrar(int[] etapas) {
		String resultado = "Calificaciones de las etapas:\n";
		for (int i = 0; i < etapas.length; i++) {
			resultado += "Etapa " + (i + 1) + " con Calificacion de:  " + etapas[i] + "\n";
		}
		return resultado;
	} 

}
