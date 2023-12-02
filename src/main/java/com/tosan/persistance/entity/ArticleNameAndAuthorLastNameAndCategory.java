package com.tosan.persistance.entity;

public class ArticleNameAndAuthorLastNameAndCategory {

	private String articleName;

	private String authorLastName;

	private String articleCategory;

	public ArticleNameAndAuthorLastNameAndCategory(String articleName, String authorLastName, String articleCategory) {
		this.articleName = articleName;
		this.authorLastName = authorLastName;
		this.articleCategory = articleCategory;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public String getArticleCategory() {
		return articleCategory;
	}

	public void setArticleCategory(String articleCategory) {
		this.articleCategory = articleCategory;
	}

	@Override
	public String toString() {
		return "ArticleNameAndAuthorLastNameAndCategory [articleName=" + articleName + ", authorLastName="
				+ authorLastName + ", articleCategory=" + articleCategory + "]";
	}
}
