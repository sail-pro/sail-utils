package com.sail.config;

import com.sail.properties.SailUtilsProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SailUtilsProperties.class)
public class SailUtilsConfigure {
}
