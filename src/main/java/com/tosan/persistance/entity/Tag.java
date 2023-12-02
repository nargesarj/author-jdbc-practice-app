package com.tosan.persistance.entity;

public class Tag {

	private Long id; 
	
	private String title;  
	
	private Article article;

	public Tag(Long id, String title, Article article) {
		super();
		this.id = id;
		this.title = title;
		this.article = article;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
}
