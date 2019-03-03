package ve.org.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		//creacion de objeti tipo empleado
		Empleados emp1 = new DirectorEmpleado();
		
		//uso de los objetos creados
		System.out.println(emp1.getTareas());
	*/ 
		
		//Cargamos el archivo XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("appContext.xml");
		//Instanciamos un objeto de tipo empleado
		Empleados emp = contexto.getBean("miEmpleado",Empleados.class);
		DirectorEmpleado 	dir 	= contexto.getBean("miDirector",DirectorEmpleado.class);
		SecretarioEmpleado 	sec 	= contexto.getBean("miSecretario",SecretarioEmpleado.class);
		SecretarioEmpleado 	sec2 	= contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		//Utilizar el objeto
		System.out.println(emp.getTareas()); 
		System.out.println(emp.getInforme()); 
		System.out.println(); 
		System.out.println(dir.getTareas()); 
		System.out.println(dir.getInforme());
		System.out.println("Email: " + dir.getEmail()); 
		System.out.println("Empresa: " + dir.getNombreEmpresa());
		System.out.println(); 
		System.out.println(sec.getTareas()); 
		System.out.println(sec.getInforme());
		System.out.println("Email: " + sec.getEmail()); 
		System.out.println("Empresa: " + sec.getNombreEmpresa());
		System.out.println(); 
		System.out.println(sec2.getTareas()); 
		System.out.println(sec2.getInforme());
		System.out.println("Email: " + sec2.getEmail()); 
		System.out.println("Empresa: " + sec2.getNombreEmpresa());
		
		//Cerramos el archivo XML
		contexto.close();
		
	}

}
