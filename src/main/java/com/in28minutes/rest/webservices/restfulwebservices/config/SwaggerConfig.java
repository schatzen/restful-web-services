//package com.in28minutes.rest.webservices.restfulwebservices.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.hateoas.client.LinkDiscoverer;
//import org.springframework.hateoas.client.LinkDiscoverers;
//import org.springframework.hateoas.mediatype.collectionjson.CollectionJsonLinkDiscoverer;
//import org.springframework.plugin.core.SimplePluginRegistry;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//// Configuration
//// Enable Swagger
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    // Bean - Docket
//    // Swagger 2
//    // All the pathss
//    // All the apis
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2);
//    }
//
//    // HATEOAS를 쓸 경우, swagger 버전과 충돌이 날 수 있다.
//    // 해당 bean을 추가하면 해결된다.
//    @Bean
//    public LinkDiscoverers discoverers() {
//        List<LinkDiscoverer> plugins = new ArrayList<>();
//        plugins.add(new CollectionJsonLinkDiscoverer());
//        return new LinkDiscoverers(SimplePluginRegistry.create(plugins));
//    }
//}
