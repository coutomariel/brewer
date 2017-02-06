package com.coutomariel.breuer.config.init;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.coutomariel.breuer.config.WebConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	// Define como o framework encontra as classes de controller
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	// Define a partir de que ponto da aplicação, a requisição é enviada ao
	// dispatcher
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	//Forçando o encoding UTF8
		@Override
		protected Filter[] getServletFilters() {
			CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
			characterEncodingFilter.setEncoding("UTF-8");
			characterEncodingFilter.setForceEncoding(true);
			
			return new Filter[] { characterEncodingFilter };
		}

}
