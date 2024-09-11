import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Vtv vehiculo = new Vtv("");
		Vtv Motor = new Vtv("");
		Vtv Frenos = new Vtv("");
		int opcion;
		String auto;
		String motor;
		String frenos;
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
				JOptionPane.showMessageDialog(null, "Vehiculo registrado  "+ vehiculo.getAutos());
				motor = Vtv.Elecciones("Motor");
                Motor.setDatos(motor);
                
                frenos = Vtv.Elecciones("frenos");
                Frenos.setDatos(frenos);
                String res = "El vehículo " + vehiculo.getAutos() + " tiene un estado de motor: " + Motor.getDatos() + "y"+Frenos.getDatos();
                JOptionPane.showMessageDialog(null, res);
                
				break;
			case 2: 
				JOptionPane.showMessageDialog(null, "c");
				break;
			}
		}while(opcion != 2);
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
