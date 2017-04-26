package com.ravisoni.webcrawler.util;

/**
 * 
 * @author ravi_kant_soni
 * @since 27April2017 ~ 01:52AM
 */
public class CrawlerUtility {

	public static Boolean IsExternal(String URL, String baseUrl) {
		Boolean isExternal = false;
		if (URL.contains(baseUrl)) {
			isExternal = true;
		}
		return isExternal;
	}

}
