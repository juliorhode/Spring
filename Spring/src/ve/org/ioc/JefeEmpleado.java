package ve.org.ioc;

public class JefeEmpleado implements Empleados{

	
	
	public JefeEmpleado(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el Jefe con arreglos : " + informeNuevo.getInforme();
	}
	
	private CreacionInforme informeNuevo;
}
