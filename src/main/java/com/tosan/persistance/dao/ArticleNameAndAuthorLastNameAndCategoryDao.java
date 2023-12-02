package com.tosan.persistance.dao;

import java.util.List;

import com.tosan.persistance.entity.ArticleNameAndAuthorLastNameAndCategory;

public interface ArticleNameAndAuthorLastNameAndCategoryDao {

	List<ArticleNameAndAuthorLastNameAndCategory> articlesByAuthorsLastNameAndByCategory(String lastName,
			String category);
}
