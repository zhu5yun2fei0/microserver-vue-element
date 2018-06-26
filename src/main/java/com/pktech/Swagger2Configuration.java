package com.pktech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.pktech.osmc.swagger.Swagger2ConfigurationProperties;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {

	@Autowired
	private Swagger2ConfigurationProperties prop;

	@Bean
	public Docket createRestApi() {
		// 创建API基本信息
		ApiInfoBuilder apiIB = new ApiInfoBuilder();
		if (!StringUtils.isEmpty(prop.getVersion())) {
			apiIB.version(prop.getVersion());
		}

		if (!StringUtils.isEmpty(prop.getTitle())) {
			apiIB.title(prop.getTitle());
		}

		if (!StringUtils.isEmpty(prop.getDescription())) {
			apiIB.description(prop.getDescription());
		}

		if (!StringUtils.isEmpty(prop.getTermsOfServiceUrl())) {
			apiIB.termsOfServiceUrl(prop.getTermsOfServiceUrl());
		}

		if (!StringUtils.isEmpty(prop.getContact())) {
			apiIB.contact(prop.getContact());
		}

		if (!StringUtils.isEmpty(prop.getLicense())) {
			apiIB.license(prop.getLicense());
		}

		if (!StringUtils.isEmpty(prop.getLicenseUrl())) {
			apiIB.licenseUrl(prop.getLicenseUrl());
		}

		// 扫描该包下的所有需要在Swagger中展示的API，@ApiIgnore注解标注的除外
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiIB.build())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.pktech"))
				.paths(PathSelectors.any())
				.build();
	}

}