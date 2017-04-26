package com.ravisoni.webcrawler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author ravi_kant_soni
 * @since 27April2017 ~ 01:52AM
 */
@Entity
@Table(name = "crawler")
public class Crawler {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long crawlerId;

	private String url;
	private Boolean isExternal;
	private String type;

	public Crawler() {
	}

	public Crawler(String url, Boolean isExternal, String type) {
		this.url = url;
		this.isExternal = isExternal;
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getIsExternal() {
		return isExternal;
	}

	public void setIsExternal(Boolean isExternal) {
		this.isExternal = isExternal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
