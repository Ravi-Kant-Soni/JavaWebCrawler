package com.ravisoni.webcrawler.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ravisoni.webcrawler.model.Crawler;

/**
 * 
 * @author ravi_kant_soni
 * @since 27April2017 ~ 01:52AM
 */
public interface CrawlerRepository extends CrudRepository<Crawler, Long> {

	List<Crawler> findByIsExternalTrue();

	List<Crawler> findByIsExternalFalse();
}
