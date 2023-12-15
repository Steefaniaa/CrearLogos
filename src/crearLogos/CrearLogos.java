package crearLogos;

import controladorLogo.ControladorLogo;
import modeloLogo.ModeloLogo;
import vistaLogo.VistaLogo;

public class CrearLogos {

	public static void main(String[] args) {
		
		System.out.println("hola");
		ModeloLogo modelo = new ModeloLogo();
		VistaLogo diseño = new VistaLogo();
		ControladorLogo controlador = new ControladorLogo(diseño,modelo);
		controlador.enseñarVista();
		

	}

}
