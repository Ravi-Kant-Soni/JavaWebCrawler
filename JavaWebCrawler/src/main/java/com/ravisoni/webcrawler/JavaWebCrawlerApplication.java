package com.ravisoni.webcrawler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author ravi_kant_soni
 * @since 27April2017 ~ 01:52AM
 */
@SpringBootApplication
public class JavaWebCrawlerApplication {
	private static final Logger log = LoggerFactory.getLogger(JavaWebCrawlerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JavaWebCrawlerApplication.class, args);
		log.info("Welcome to Java Web Crawler Project");
	}
}
