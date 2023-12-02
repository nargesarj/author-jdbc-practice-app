package com.tosan.persistance.entity;

public class ArticlesNameAndAuthorInfoAndArticlesCategory {

	private String articleName;

	private String articleCategory;

	private Long authorId;

	private String authorFirstName;

	private String authorLastName;

	public ArticlesNameAndAuthorInfoAndArticlesCategory(String articleName, String articleCategory, Long authorId,
			String authorFirstName, String authorLastName) {
		this.articleName = articleName;
		this.articleCategory = articleCategory;
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

	public String getArticleCategory() {
		return articleCategory;
	}

	public void setArticleCategory(String articleCategory) {
		this.articleCategory = articleCategory;
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
		return "ArticlesNameAndAuthorInfoAndArticlesCategory [articleName=" + articleName + ", articleCategory="
				+ articleCategory + ", authorId=" + authorId + ", authorFirstName=" + authorFirstName
				+ ", authorLastName=" + authorLastName + "]";
	}
}
