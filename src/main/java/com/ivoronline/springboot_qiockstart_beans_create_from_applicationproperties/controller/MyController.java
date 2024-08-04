package com.ivoronline.springboot_qiockstart_beans_create_from_applicationproperties.controller;

import com.ivoronline.springboot_qiockstart_beans_create_from_applicationproperties.data.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired Person person;

  //=======================================================================
  // HELLO
  //=======================================================================
  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    return person.name + " is " + person.age + " years old";
  }

}

