package com.ravisoni.webcrawler.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravisoni.webcrawler.service.CrawlerService;

/**
 * 
 * @author ravi_kant_soni
 * @since 27April2017 ~ 01:52AM
 */
@RestController
public class CrawlerRestController {
	private static final Logger log = LoggerFactory.getLogger(CrawlerRestController.class);

	@Autowired
	private CrawlerService crawlerService;

	@Value("${crawler.baseURL}")
	private String baseURL;

	@Value("${crawler.crawlerURL}")
	private String crawlerURL;

	@RequestMapping("/webcrawler")
	public String processWebPage() {
		log.info("processWebPage method called");
		crawlerService.saveLinksFromPage(crawlerURL, baseURL);
		return "open webpage: <b>http://localhost:8080/h2-console</b> </br> execute </br>"
				+ "<b>select * from crawler</b>";
	}

}
