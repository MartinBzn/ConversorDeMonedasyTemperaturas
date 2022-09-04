import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		
		String[] conversores = {"Conversor de Monedas", "Conversor de Temperatura"};
		MenuConvertirMoneda menuConvertirMoneda = new MenuConvertirMoneda();
		MenuConvertirTemperatura menuConvertirTemperatura = new MenuConvertirTemperatura();
		Boolean seguir = true;
		Object opcion = new Object();
		String opcionDeConversor = "";
		
		while(seguir) {
			
			opcion = JOptionPane.showInputDialog(null,"Seleccione un tipo de Conversor por favor: ","Conversores"
					,JOptionPane.PLAIN_MESSAGE,null,conversores,"Seleccionar");
			
			if (opcion != null) {
				opcionDeConversor = opcion.toString();
				switch(opcionDeConversor) {
				case "Conversor de Monedas":
					menuConvertirMoneda.SelectorConversor();
					break;
				case "Conversor de Temperatura":
					menuConvertirTemperatura.SelectorConversor();
					break;
				}
			}else{
				JOptionPane.showMessageDialog(null, "Programa Finalizado",
						  "Conversor de Unidades", JOptionPane.INFORMATION_MESSAGE);
				seguir = false;
			}
		}
	}
}