package com.ravisoni.webcrawler.service;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravisoni.webcrawler.dao.CrawlerRepository;
import com.ravisoni.webcrawler.model.Crawler;
import com.ravisoni.webcrawler.util.CrawlerUtility;

/**
 * 
 * @author ravi_kant_soni
 * @since 27April2017 ~ 01:52AM
 */
@Service
public class CrawlerServiceImpl implements CrawlerService {
	private static final Logger log = LoggerFactory.getLogger(CrawlerServiceImpl.class);

	@Autowired
	private CrawlerRepository crawlerRepository;

	private Crawler crawler = new Crawler();
	private Set<String> visitedURL = new HashSet<>();
	private Set<String> visitedMedia = new HashSet<>();

	public void saveLinksFromPage(String crawlerURL, String baseURL) {
		log.info("saveLinksFromPage method");
		fetchLinksFromPage(crawlerURL, baseURL);
	}

	public int countURL(Boolean isExternal) {
		if (isExternal) {
			return crawlerRepository.findByIsExternalTrue().size();
		} else {
			return crawlerRepository.findByIsExternalFalse().size();
		}
	}

	private void fetchLinksFromPage(String crawlerURL, String baseURL) {
		try {
			Document doc = Jsoup.connect(crawlerURL).get();
			Elements linksOnPage = doc.select("a[href]");
			Elements media = doc.select("[src]");

			for (Element src : media) {
				if (src.tagName().equals("img")) {
					String type = src.tagName();
					String mediaName = src.attr("abs:src");
					if (visitedMedia.add(mediaName)) {
						crawler = new Crawler(mediaName, true, type);
						saveCrawler(crawler);
					}
				}
			}
			for (Element link : linksOnPage) {
				String url = link.attr("abs:href");
				Boolean isExternal = CrawlerUtility.IsExternal(url, baseURL);
				if (visitedURL.add(url) && !url.contains("google") && !url.contains("facebook")
						&& !url.contains("twitter")) {
					crawler = new Crawler(url, isExternal, "link");
					saveCrawler(crawler);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void saveCrawler(Crawler crawler) {
		crawlerRepository.save(crawler);
	}

}
