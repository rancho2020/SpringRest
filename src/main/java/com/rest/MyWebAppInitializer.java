package com.rest;

import com.rest.config.AppConfig;
import org.h2.server.web.WebServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{};
   }

   @Override
   protected Class<?>[] getServletConfigClasses() {
      return new Class[] { AppConfig.class };
   }

   @Override
   protected String[] getServletMappings() {
      return new String[] { "/" };
   }
   
   @Override
   public void onStartup(ServletContext servletContext) 
     throws ServletException {
     super.onStartup(servletContext);
     ServletRegistration.Dynamic servlet = servletContext
       .addServlet("h2-console", new WebServlet());
     servlet.setLoadOnStartup(2);
     servlet.addMapping("/console/*");
     //http://localhost:8080/SpringRestApp/console/login.jsp?jsessionid=3fd644061f376a8b539a5cde3a1f79b0
   }
}