package com.ravisoni.webcrawler.service;

/**
 * 
 * @author ravi_kant_soni
 * @since 27April2017 ~ 01:52AM
 */
public interface CrawlerService {

	public int countURL(Boolean isExternal);
	public void saveLinksFromPage(String crawlerURL, String baseURL);

}
