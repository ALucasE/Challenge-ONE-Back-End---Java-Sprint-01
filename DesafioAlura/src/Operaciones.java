
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Operaciones{
		private static double resultado;

		//MENU DE DIVISAS	
		public static void abrirMenuDivisas(Divisas moneda1,Divisas moneda2,Divisas moneda3,Divisas moneda4,Divisas moneda5) {	
			boolean continuar = true;
			while(continuar) {
				
				//Menu de opciones
				String [] opciones = {moneda1.getCambioAPeso(),moneda2.getCambioAPeso(),moneda3.getCambioAPeso(),moneda4.getCambioAPeso(),moneda5.getCambioAPeso(),moneda1.getCambioDePeso(),moneda2.getCambioDePeso(),moneda3.getCambioDePeso(),moneda4.getCambioDePeso(),moneda5.getCambioDePeso()};
				String change = (String) JOptionPane.showInputDialog(null,"Seleccione una opcion","Conversor de Divisas",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
				
				//Input
				double input = 0;
				boolean bandera=true;
				while (bandera) {
					try {
						input=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto"));
						bandera=false;
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no valido - Internte de nuevo");
					}				
				}
				
				//operaciones peso a divisa
				if (change.equals(moneda1.getCambioAPeso())) {
					moneda1.cambiarAPesos(input);
				}else if(change.equals(moneda2.getCambioAPeso())){
					moneda2.cambiarAPesos(input);
				}else if(change.equals(moneda3.getCambioAPeso())){
					moneda3.cambiarAPesos(input);
				}else if(change.equals(moneda4.getCambioAPeso())){
					moneda4.cambiarAPesos(input);
				}else if(change.equals(moneda5.getCambioAPeso())){
					moneda5.cambiarAPesos(input);
					
				//operaciones divisas a pesos
				}else if(change.equals(moneda1.getCambioDePeso())){
					moneda1.cambiarDesdePesos(input);
				}else if(change.equals(moneda2.getCambioDePeso())){
					moneda2.cambiarDesdePesos(input);
				}else if(change.equals(moneda3.getCambioDePeso())){
					moneda3.cambiarDesdePesos(input);
				}else if(change.equals(moneda4.getCambioDePeso())){
					moneda4.cambiarDesdePesos(input);
				}else if(change.equals(moneda5.getCambioDePeso())){
					moneda5.cambiarDesdePesos(input);
				}	
				
				//Menu continuar
				int seguir=JOptionPane.showConfirmDialog(null,"¿Desea continuar?","Confirmar",JOptionPane.YES_NO_CANCEL_OPTION);
				if(seguir==JOptionPane.NO_OPTION ||seguir==JOptionPane.CANCEL_OPTION) {
					continuar = false;
					JOptionPane.showMessageDialog(null, "Cerrando programa");
				}
			}		
		}
		
		public static void abrirMenuTemperatura() {
			boolean continuar = true;
			while(continuar) {
				//Menu de opciones
				String[] options = {"Celcius a Fahrenheit", "Fahrenheit a Celcius"};
				int option= JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				//Input
				double input = 0;
				boolean bandera=true;
				while (bandera) {
					try {
						input=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
						bandera=false;
					}catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no valido - Internte de nuevo");
					}				
				}
				
				//operaciones de cambio de temperatura
				DecimalFormat formatearTemperatura = new DecimalFormat("#.##");
				if (option==0) {
					resultado=(input*9/5)+32;
					JOptionPane.showMessageDialog(null, input+"º Celcius son: "+formatearTemperatura.format(resultado)+"º Fahrenheit");
				}else if(option==1){
					resultado=(input-32)*5/9;
					JOptionPane.showMessageDialog(null, input+"º Fahrenheit son: "+formatearTemperatura.format(resultado)+"º Celcius");
				}
				
				//Menu continuar
				int seguir=JOptionPane.showConfirmDialog(null,"¿Desea continuar?","Confirmar",JOptionPane.YES_NO_CANCEL_OPTION);
				if(seguir==JOptionPane.NO_OPTION ||seguir==JOptionPane.CANCEL_OPTION) {
					continuar = false;
					JOptionPane.showMessageDialog(null, "Cerrando programa");
				}
			}
		}
}
		
