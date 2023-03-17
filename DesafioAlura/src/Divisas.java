import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Divisas {
	private String nombre;
	private String simbolo;
	private String nombrePlural;
	private double equivalencia;
	private String cambioAPeso;
	private String CambioDePeso;
	
	public Divisas(String nombre, String simbolo, String nombrePlural, double equivalencia, String cambioAPeso, String CambioDePeso) {
		super();
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.nombrePlural = nombrePlural;
		this.equivalencia = equivalencia;
		this.cambioAPeso = cambioAPeso;
		this.CambioDePeso = CambioDePeso;
		
	}
	public String getNombre() {
		return nombre;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public String getNombrePlural() {
		return nombrePlural;
	}
	public double getEquivalencia() {
		return equivalencia;
	}
	public String getCambioAPeso() {
		return cambioAPeso;
	}
	public String getCambioDePeso() {
		return CambioDePeso;
	}
	public void cambiarAPesos(double input) {
		double ouput= input*equivalencia;	
		DecimalFormat formatearMoneda = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null, input+" pesos argentinos son: "+formatearMoneda.format(ouput)+" "+nombrePlural);
	}
	
	public void cambiarDesdePesos(double input) {
		double ouput= input/equivalencia;	
		DecimalFormat formatearMoneda = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null, input+" "+nombrePlural+" son: "+formatearMoneda.format(ouput)+" pesos argentinos");	
				
	}

}
