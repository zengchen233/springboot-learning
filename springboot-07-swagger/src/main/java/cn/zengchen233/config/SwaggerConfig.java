package cn.zengchen233.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author zengchen
 * @title SwaggerConfig
 * @description
 * @create 2023/2/17
 */
@Configuration
@EnableSwagger2 //开启Swagger
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment) {

        //获取项目的环境
        Profiles isDev = Profiles.of("dev");

        boolean flag = environment.acceptsProfiles(isDev);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).enable(flag).groupName("测试")
                .select().apis(RequestHandlerSelectors.basePackage("cn.zengchen233.controller"))
                .build();
    }

    //配置swagger信息 apiInfo
    private ApiInfo apiInfo() {
        Contact contact = new Contact("曾晨", "https://zengchen233.cn/", "me@zengchen233.cn");

        return new ApiInfo("zcc的swaggerAPI文档",
                "so good",
                "v1.0",
                "https://zengchen233.cn/",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
