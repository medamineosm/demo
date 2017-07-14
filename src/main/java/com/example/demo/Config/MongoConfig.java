package com.example.demo.Config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ouasmine on 14/07/2017.
 */
@Configuration
@EnableAutoConfiguration(exclude = { EmbeddedMongoAutoConfiguration.class })
public class MongoConfig{
}