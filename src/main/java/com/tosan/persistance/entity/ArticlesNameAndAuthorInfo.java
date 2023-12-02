package com.tosan.persistance.entity;

public class ArticlesNameAndAuthorInfo {

	private String articleName;

	private Long authorId;

	private String authorFirstName;

	private String authorLastName;

	public ArticlesNameAndAuthorInfo(String articleName, Long authorId, String authorFirstName, String authorLastName) {
		this.articleName = articleName;
		this.authorId = authorId;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	@Override
	public String toString() {
		return "ArticlesNameAndAuthorInfo [articleName=" + articleName + ", authorId=" + authorId + ", authorFirstName="
				+ authorFirstName + ", authorLastName=" + authorLastName + "]";
	}
}