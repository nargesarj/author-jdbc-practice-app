package com.tosan.persistance.entity;

import java.util.List;

public class Article {

	private Long id;

	private String name;

	private String categoty;

	private Author author;

	private List<Tag> tags;

	public Article(Long id, String name, String categoty, Author author, List<Tag> tags) {
		this.id = id;
		this.name = name;
		this.categoty = categoty;
		this.author = author;
		this.tags = tags;
	}

	public Article(String name, String categoty) {
		this.name = name;
		this.categoty = categoty;
		this.author = null;
		this.tags = null;
	}

	public Article(String string, long long1, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public Article(String string, String string2, long long1, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public Article(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategoty() {
		return categoty;
	}

	public void setCategoty(String categoty) {
		this.categoty = categoty;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Article [id=" + id + ", name=" + name + ", categoty=" + categoty + ", author=" + author + ", tags="
				+ (tags != null ? tags.subList(0, Math.min(tags.size(), maxLen)) : null) + "]";
	}

	

}
