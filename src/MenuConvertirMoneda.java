import javax.swing.JOptionPane;

public class MenuConvertirMoneda {
	
	String titulo = "Conversor de Monedas";
	
	public void SelectorConversor() {
		String[] conversores = {"Pesos a Dolar", "Pesos a Euros", "Pesos a Libras", "Pesos a Yen", "Pesos a Won"
								, "Dolar a Pesos", "Euros a Pesos", "Libras a Pesos", "Yen a Pesos", "Won a Pesos"};
		String valorStr = "";
		Double valorDbl = 0.0;
		String respuesta = "";
		EjecutarConversionMoneda ecm = new EjecutarConversionMoneda();
		Boolean seguir = true;
		while (seguir){
			valorStr = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir.\n  - No utilice puntos o comas para marcar miles.\n  - Utilice ',' para los decimales.",titulo,JOptionPane.PLAIN_MESSAGE);
			try {
				if(valorStr.contains(".")) {
					throw new NumberFormatException();
				}
				if (valorStr.contains(",")) {
					String valorStr2 = "";
					valorStr2 = valorStr;
					valorStr = valorStr2.replace(",", ".");
					System.out.println(valorStr);
				}
				valorDbl = Double.parseDouble(valorStr);
				if (valorDbl <= 0.0) {
					throw new ExcepcionMenorOIgualACero("Valor menor o igual a cero.");
				}
				String opcionDeConversor = JOptionPane.showInputDialog(null,"Seleccione el tipo de cambio que desea calcular: ",titulo,JOptionPane.PLAIN_MESSAGE,null,conversores,"Seleccionar").toString();
				respuesta = ecm.ConversorMonetario(opcionDeConversor, valorDbl, valorStr);
				JOptionPane.showMessageDialog(null, respuesta, "Conversor de Unidades", JOptionPane.INFORMATION_MESSAGE, null);
				int opcionSeleccionada = JOptionPane.showConfirmDialog(null,"¿Desea realizar una nueva conversión monetaria?",titulo,JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if(JOptionPane.NO_OPTION == opcionSeleccionada) {
					seguir = false;
				}
			}
			catch(NumberFormatException err){
				String msjError = "";
				if (valorStr.isEmpty()) {
					msjError = "No ha ingresado un valor a convertir.";
				}else {
					msjError = "El valor ingresado no es un número válido.";
				}
				JOptionPane.showMessageDialog(null,msjError, titulo, JOptionPane.ERROR_MESSAGE, null);
			}
			catch(ExcepcionMenorOIgualACero err) {
				JOptionPane.showMessageDialog(null,"El valor a convertir debe ser mayor a cero.", titulo, JOptionPane.ERROR_MESSAGE, null);
			}
			catch(NullPointerException err) {
				int opcionSeleccionada = JOptionPane.showConfirmDialog(null,"¿Desea salir del conversor de monedas?",titulo,JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if(JOptionPane.YES_OPTION == opcionSeleccionada) {
					seguir = false;
				}
			}
			catch(Exception err){
				System.out.println(err);
				System.out.println(err.getClass().getSimpleName());
				JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Por favor intentelo nuevamente", titulo, JOptionPane.ERROR_MESSAGE, null);
			}
		}
	}
	
	
}