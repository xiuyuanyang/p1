package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by ucmed on 2016/11/18.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.example")
public class DispatcherConfig {


}
