package ve.org.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cargamos el archivo XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("appContext2.xml");

		//Hacer una peticion de bean al contenedor Spring
		SecretarioEmpleado 	julio 	= contexto.getBean("miSecretario",SecretarioEmpleado.class);
		SecretarioEmpleado 	cesar 	= contexto.getBean("miSecretario",SecretarioEmpleado.class);
		System.out.println("------------ Patron Singleton ------------");
		System.out.println(julio);
		System.out.println(cesar);
		
		if (julio == cesar) {
			System.out.println("Apunta al mismo objeto");
		}else {
			System.out.println("No es el mismo objeto");
		}
		/**
		 * Al imprimir en consola, podemos ver que los dos objetos apuntan
		 * a la misma referencia de la memoria... esto es por el patron Singleton
		 * 
		 * ve.org.ioc.SecretarioEmpleado@50b494a6 
		 * ve.org.ioc.SecretarioEmpleado@50b494a6
		 * 
		 * */
		System.out.println("------------ Patron Prototype ------------");
		SecretarioEmpleado 	maria 	= contexto.getBean("miSecretarioPrototype",SecretarioEmpleado.class);
		SecretarioEmpleado 	pedro 	= contexto.getBean("miSecretarioPrototype",SecretarioEmpleado.class);
		System.out.println(maria);
		System.out.println(pedro);
		if (maria == pedro) {
			System.out.println("Apunta al mismo objeto");
		}else {
			System.out.println("No es el mismo objeto");
		}
		/**
		 * Al imprimir en consola, podemos ver que los dos objetos apuntan
		 * a diferentes referencias de la memoria... esto es por el patron prototype
		 * 
		 * ve.org.ioc.SecretarioEmpleado@3cef309d 
		 * ve.org.ioc.SecretarioEmpleado@32709393
		 * 
		 * */
		
	}

}
