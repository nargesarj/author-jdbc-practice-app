package com.tosan.persistance.entity;

import java.util.List;

public class Author {

	private Long id;

	private String firstName;

	private String lastName;

	private List<Article> articles;

	public Author(Long id, String firstName, String lastName, List<Article> articles) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.articles = articles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
