package com.utilizandoBeans.utilizandoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
			
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		livro.setCodigo("001");
		livro.setNome("Código limpo.");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Grupo dos 4");
		
		livro.exibir();
		
		((AbstractApplicationContext) factory).close();
	}

}
