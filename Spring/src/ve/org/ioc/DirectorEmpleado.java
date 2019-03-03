package ve.org.ioc;

public class DirectorEmpleado implements Empleados {

	//Creacion de campo  tipo creacionInforme (interfaz)
	private CreacionInforme informeNuevo;
	
	//Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiona la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: " + informeNuevo.getInforme();
	}

	private String email;
	private String nombreEmpresa;
}
