package com.post.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class MyWebInitiallizer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses(){
		return null;
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {WebConfig.class}
		
		@Override
		protected String[] getServletMappings() {
			return new String[] {"/"};
	
		}
}