package com.tosan.persistance.dao;

import java.util.List;

import com.tosan.persistance.entity.ArticlesNameAndAuthorInfoAndArticlesCategory;

public interface ArticlesNameAndAuthorInfoAndArticlesCategoryDoa {

	List<ArticlesNameAndAuthorInfoAndArticlesCategory> articlesAndAuthorsInfoAndArticlesCategoryByAuthorsLastName(
			String lastName);
}
