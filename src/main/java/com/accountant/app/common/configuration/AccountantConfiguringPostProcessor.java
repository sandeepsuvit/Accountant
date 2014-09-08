/**
 * 
 */
package com.accountant.app.common.configuration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;

/**
 * 
 * -------------------------------
 * @author SANDEEP K NAIR
 * EMAIL : sandeepsuvit@gmail.com
 * WEBSITE : www.dotedlabs.com
 * -------------------------------
 * 
 * MvcConfiguringPostProcessor.java | com.accountant.app.common.configuration
 * 
 * Sep 8, 2014 | 12:15:48 PM | 2014
 *
 * The HTTP Message converters are created automatically by Spring. 
 * To perform additional configuration we use a bean post-processor.
 */
public class AccountantConfiguringPostProcessor implements BeanPostProcessor {

	/**
	 * Enable pretty print on any bean of type
	 * 
	 * {@link MappingJacksonHttpMessageConverter} or
	 * {@link MappingJackson2HttpMessageConverter}.
	 */
	public Object postProcessBeforeInitialization(Object bean, String name)
			throws BeansException {
		if (bean instanceof HttpMessageConverter<?>)

			if (bean instanceof MappingJacksonHttpMessageConverter) {
				((MappingJacksonHttpMessageConverter) bean)
						.setPrettyPrint(true);
			} else if (bean instanceof MappingJackson2HttpMessageConverter) {
				((MappingJackson2HttpMessageConverter) bean)
						.setPrettyPrint(true);
			}

		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// Nothing to do
		return bean;
	}

}
