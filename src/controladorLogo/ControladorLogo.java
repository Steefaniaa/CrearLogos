package controladorLogo;

import modeloLogo.ModeloLogo;
import vistaLogo.VistaLogo;

public class ControladorLogo {

	private VistaLogo vistaLogo;
	private ModeloLogo modeloLogo;

	public ControladorLogo(VistaLogo vistaLogo, ModeloLogo modeloLogo) {
		super();
		this.vistaLogo = vistaLogo;
		this.modeloLogo = modeloLogo;
	}
	
	public void enseñarVista() {
		
		vistaLogo.setVisible(true);
		
		
	}

}
