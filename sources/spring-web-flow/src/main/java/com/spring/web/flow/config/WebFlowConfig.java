package com.spring.web.flow.config;



import com.spring.web.flow.BookingFlowHandler;
import jakarta.servlet.ServletContext;
import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.webflow.config.AbstractFlowConfiguration;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;
import org.springframework.webflow.engine.builder.support.FlowBuilderServices;
import org.springframework.webflow.executor.FlowExecutor;
import org.springframework.webflow.mvc.builder.MvcViewFactoryCreator;
import org.springframework.webflow.mvc.servlet.FlowHandlerAdapter;
import org.springframework.webflow.mvc.servlet.FlowHandlerMapping;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.webflow.view.AjaxThymeleafViewResolver;
import org.thymeleaf.spring6.webflow.view.FlowAjaxThymeleafView;
import org.thymeleaf.templateresolver.WebApplicationTemplateResolver;
import org.thymeleaf.web.IWebApplication;
import org.thymeleaf.web.servlet.JakartaServletWebApplication;

@Configuration
public class WebFlowConfig extends AbstractFlowConfiguration {


//  @Autowired
//  private WebMvcConfig webMvcConfig;

//  public WebFlowConfig(WebMvcConfig webMvcConfig){
//    this.webMvcConfig = webMvcConfig;
//  }
//  private ServletContext servletContext;

//  @Override
//  public void setServletContext(ServletContext servletContext) {
//    this.servletContext = servletContext;
//  }

  @Bean(name="booking")
  public BookingFlowHandler bookingFlowHandler() {
    return new BookingFlowHandler();
  }

// define flow bean config
// flow config
  @Bean
  public FlowDefinitionRegistry flowRegistry() {
    return getFlowDefinitionRegistryBuilder(flowBuilderServices())
        .addFlowLocation("/templates/booking/booking.xml")
        .build();
  }

  @Bean
  public FlowBuilderServices flowBuilderServices() {
    return getFlowBuilderServicesBuilder()
        //.setViewFactoryCreator(mvcViewFactoryCreator())
        .setDevelopmentMode(true)
        .build();
  }

  @Bean
  public FlowExecutor flowExecutor() {
    return getFlowExecutorBuilder(flowRegistry()).build();
  }

// mvc config

//  @Bean
//  public FlowHandlerMapping flowHandlerMapping() {
//    FlowHandlerMapping handlerMapping = new FlowHandlerMapping();
//    handlerMapping.setOrder(0);
//    handlerMapping.setFlowRegistry(flowRegistry());
//    return handlerMapping;
//  }

//  @Bean
//  public FlowHandlerAdapter flowHandlerAdapter() {
//    FlowHandlerAdapter handlerAdapter = new FlowHandlerAdapter();
//    handlerAdapter.setFlowExecutor(flowExecutor());
//    handlerAdapter.setSaveOutputToFlashScopeOnRedirect(true);
//    return handlerAdapter;
//  }

//  @Bean
//  public MvcViewFactoryCreator mvcViewFactoryCreator() {
//    MvcViewFactoryCreator factoryCreator = new MvcViewFactoryCreator();
//    factoryCreator.setViewResolvers(Collections.singletonList(thymeleafViewResolver()));
//    factoryCreator.setUseSpringBeanBinding(true);
//    return factoryCreator;
//  }

//  @Bean
//  public ViewResolver thymeleafViewResolver() {
//    AjaxThymeleafViewResolver resolver = new AjaxThymeleafViewResolver();
//    resolver.setTemplateEngine(templateEngine());
//    resolver.setViewClass(FlowAjaxThymeleafView.class);
//    resolver.setCharacterEncoding("UTF8");
//    resolver.setOrder(0);
//    return resolver;
//  }

//  @Bean
//  public SpringTemplateEngine templateEngine(){
//    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//    templateEngine.setTemplateResolver(templateResolver());
//    return templateEngine;
//  }

//  @Bean
//  public WebApplicationTemplateResolver templateResolver() {
//    IWebApplication application = JakartaServletWebApplication.buildApplication(this.servletContext);
//    WebApplicationTemplateResolver resolver = new WebApplicationTemplateResolver(application);
//    resolver.setPrefix("/templates/");
//    resolver.setSuffix(".html");
//    resolver.setTemplateMode("HTML5");
//    return resolver;
//  }

//  @Bean
//  public LocalValidatorFactoryBean validator() {
//    return new LocalValidatorFactoryBean();
//  }



}
