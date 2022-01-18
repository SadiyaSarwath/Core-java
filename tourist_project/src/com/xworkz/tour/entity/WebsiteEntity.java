package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "website_details")
public class WebsiteEntity implements Serializable {
	@Id
	@Column(name = "wid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int wid;
	@Column(name = "name")
	private String name;
	@Column(name = "web_url")
	private String webURL;
	@Column(name = "since")
	private int since;
	@Column(name = "domain")
	private String domain;
	@Column(name = "owner")
	private String owner;

	public WebsiteEntity() {

	}

	public WebsiteEntity(String name, String webURL, int since, String domain, String owner) {
		super();

		this.name = name;
		this.webURL = webURL;
		this.since = since;
		this.domain = domain;
		this.owner = owner;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebURL() {
		return webURL;
	}

	public void setWebURL(String webURL) {
		this.webURL = webURL;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "WebsiteEntity [wid=" + wid + ", name=" + name + ", webURL=" + webURL + ", since=" + since + ", domain="
				+ domain + ", owner=" + owner + "]";
	}

}
