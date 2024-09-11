import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int opcion;
		Vtv vehiculo = new Vtv("");
		String auto;
		JOptionPane.showMessageDialog(null, "Bienvenido a la VTV ingrese el vehiculo \n Ingrese como se encuentra el estado del auto");
		do {
			String convertir[]= {"Registro de autos", "Inspeccion", "Salir"};
			opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", null, 0, 0, null, convertir,
					convertir[0]);
			switch(opcion){
			case 0:
				JOptionPane.showMessageDialog(null, "a");
				break;
			case 1:
				do {
					 auto = JOptionPane.showInputDialog("Ingresa la marca del auto");
				}while(!ValidarNombre(auto));
				vehiculo.setAuto(auto);
				JOptionPane.showMessageDialog(null, "b"+ vehiculo.getAutos());
				break;
			case 2: 
				JOptionPane.showMessageDialog(null, "c");
				break;
			}
		}while(opcion != 2);
	}
	public static boolean ValidarNombre(String auto) {
		if (auto.isEmpty() || auto.length() < 3 || auto.length() > 20) {
			JOptionPane.showMessageDialog(null, "ERROR en la Cantidad de caracteres");
			return false;
		} else {
			for (int i = 0; i < auto.length(); i++) {
				if (Character.isDigit(auto.charAt(i))) {
					JOptionPane.showMessageDialog(null, "Hay un nùmero");
					return false;
				}
			}
			JOptionPane.showMessageDialog(null, "Usuario valido");
			return true;
		}
	}
}
