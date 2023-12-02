package com.tosan.persistance.dao;

import java.util.List;

import com.tosan.persistance.entity.Article;
import com.tosan.persistance.entity.Author;

public interface ArticleDao {

	List<Article> articlesWithCategory();

	List<Article> articlesByAuthorsLastName(String lastName);

	List<Article> articlesByCategory(String category);

	List<Article> articlesByTagTitle(String title);

	int CountArticlesByAuthorsLastNameAndByCategory(String lastName, String category);

	int CountArticlesByTagTitle(String title);

}
