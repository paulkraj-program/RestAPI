package com.deere.ddf.api.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaInfo());
    }

	private ApiInfo metaInfo() {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("deprecation")
		ApiInfo apiInfo = new ApiInfo("Dealer data feed API","Dealer data feed API's","1.0","Terms of Service","Supported by MCT Team", "Apache License Version 2.0", "https://www.apache.org/license.html");
		return apiInfo;
	}
}