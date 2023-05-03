package com.spring.web.flow.config;

import com.spring.web.flow.BookingFlowHandler;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.webflow.mvc.servlet.FlowHandlerAdapter;
import org.springframework.webflow.mvc.servlet.FlowHandlerMapping;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.webflow.view.AjaxThymeleafViewResolver;
import org.thymeleaf.spring6.webflow.view.FlowAjaxThymeleafView;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.WebApplicationTemplateResolver;
import org.thymeleaf.web.IWebApplication;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

@Configuration
@EnableWebMvc
public class WebMvcConfig {

//  @Autowired
//  private WebFlowConfig webFlowConfig;

//  public WebMvcConfig(WebFlowConfig webFlowConfig){
//    this.webFlowConfig = webFlowConfig;
//  }

  //private ServletContext servletContext;

//  @Override
//  public void setServletContext(ServletContext servletContext) {
//    this.servletContext = servletContext;
//  }

//  @Bean
//  public FlowHandlerMapping flowHandlerMapping() {
//    FlowHandlerMapping handlerMapping = new FlowHandlerMapping();
//    handlerMapping.setOrder(-1);
//    handlerMapping.setFlowRegistry(this.webFlowConfig.flowRegistry());
//    return handlerMapping;
//  }
//
//  @Bean
//  public FlowHandlerAdapter flowHandlerAdapter() {
//    FlowHandlerAdapter handlerAdapter = new FlowHandlerAdapter();
//    handlerAdapter.setFlowExecutor(this.webFlowConfig.flowExecutor());
//    handlerAdapter.setSaveOutputToFlashScopeOnRedirect(true);
//    return handlerAdapter;
//  }
//
//  @Bean(name="booking")
//  public BookingFlowHandler BookingFlowHandler() {
//    return new BookingFlowHandler();
//  }

//  @Bean
//  public AjaxThymeleafViewResolver thymeleafViewResolver() {
//    AjaxThymeleafViewResolver viewResolver = new AjaxThymeleafViewResolver();
//    viewResolver.setViewClass(FlowAjaxThymeleafView.class);
//    viewResolver.setTemplateEngine(this.templateEngine());
//    viewResolver.setCharacterEncoding("UTF-8");
//    return viewResolver;
//  }
//
//  @Bean
//  public SpringTemplateEngine templateEngine(){
//    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//    templateEngine.setTemplateResolver(this.templateResolver());
//    return templateEngine;
//  }
//
//  @Bean
//  public ClassLoaderTemplateResolver templateResolver() {
//  //  IWebApplication application = JakartaServletWebApplication.buildApplication(this.servletContext);
//    ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
//    resolver.setPrefix("templates/");
//    resolver.setSuffix(".html");
//    resolver.setTemplateMode("HTML5");
//    resolver.setCharacterEncoding("UTF-8");
//    return resolver;
//  }


  }
