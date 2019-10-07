package by.bsu.web.sardyko.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.validation.XmlValidator;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	// Import schemas as beans:
	@Bean
	public XsdSchema bookSchema() {
		return new SimpleXsdSchema(new ClassPathResource("books.xsd"));
	}

	@Bean
	public XsdSchema hourSchema() {
		return new SimpleXsdSchema(new ClassPathResource("hours.xsd"));
	}

	// Create collection of this schemas
	@Bean
	public XsdSchemaCollection getXsdCollection() {
		return new XsdSchemaCollection() {
			@Override
			public XmlValidator createValidator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public XsdSchema[] getXsdSchemas() {
				return new XsdSchema[] { bookSchema(), hourSchema() };
			}
		};
	}

	@Bean(name = "wsdl")//name of wsdl file
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchemaCollection xsdSchemaCollection) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("BookPort");
		wsdl11Definition.setLocationUri("/ws");
		wsdl11Definition.setTargetNamespace("http://sardyko.web.bsu.by/models/book");
		wsdl11Definition.setSchemaCollection(xsdSchemaCollection);
		return wsdl11Definition;
	}
}
