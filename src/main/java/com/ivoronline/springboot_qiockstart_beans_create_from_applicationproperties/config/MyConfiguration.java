package com.ivoronline.springboot_qiockstart_beans_create_from_applicationproperties.config;

import com.ivoronline.springboot_qiockstart_beans_create_from_applicationproperties.Person;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

  //=======================================================================
  // STRING BEAN
  //=======================================================================
  @Bean
  @ConfigurationProperties("person1.property") //Use Setters after Bean creation
  public Person stringBean() {
    return new Person();
  }

}
