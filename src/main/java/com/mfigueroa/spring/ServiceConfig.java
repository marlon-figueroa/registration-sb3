package com.mfigueroa.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.mfigueroa.service" })
public class ServiceConfig {
}