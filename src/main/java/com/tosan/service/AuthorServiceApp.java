package com.tosan.service;

import java.util.ArrayList;
import java.util.List;

import com.tosan.persistance.dao.ArticleDao;
import com.tosan.persistance.dao.ArticleNameAndAuthorLastNameAndCategoryDao;
import com.tosan.persistance.dao.ArticlesNameAndAuthorInfoAndArticlesCategoryDoa;
import com.tosan.persistance.dao.ArticlesNameAndAuthorInfoDoa;
import com.tosan.persistance.daoimpl.ArticleDaoImpl;
import com.tosan.persistance.daoimpl.ArticleNameAndAuthorLastNameAndCategoryDaoImpl;
import com.tosan.persistance.daoimpl.ArticlesNameAndAuthorInfoAndArticlesCategoryDoaImpl;
import com.tosan.persistance.daoimpl.ArticlesNameAndAuthorInfoDoaImpl;
import com.tosan.persistance.entity.Article;
import com.tosan.persistance.entity.ArticleNameAndAuthorLastNameAndCategory;
import com.tosan.persistance.entity.ArticlesNameAndAuthorInfo;
import com.tosan.persistance.entity.ArticlesNameAndAuthorInfoAndArticlesCategory;
import com.tosan.persistance.entity.Author;

public class AuthorServiceApp {

	private ArticleDao articleDao = new ArticleDaoImpl();

	public List<String> getArticlesWithCategory() {

		List<Article> list = articleDao.articlesWithCategory();
		List<String> strList = new ArrayList<String>();
		for (Article article : list) {
			strList.add(article.toString());
		}
		return strList;
	}

	public List<String> getArticlesByAuthor() {

		List<Article> list = articleDao.articlesByAuthorsLastName("last_name");
		List<String> strList = new ArrayList<String>();
		for (Article article : list) {
			strList.add(article.toString());
		}
		return strList;
	}

	public List<String> getArticlesAndAuthorsInfoByAuthor() {

		ArticlesNameAndAuthorInfoDoa articlesNameAndAuthorInfoDoa = new ArticlesNameAndAuthorInfoDoaImpl();
		List<ArticlesNameAndAuthorInfo> list = articlesNameAndAuthorInfoDoa
				.articlesAndAuthorsInfoByAuthorsLastName("last_name");
		List<String> strList = new ArrayList<String>();
		for (ArticlesNameAndAuthorInfo article : list) {
			strList.add(article.toString());
		}
		return strList;
	}

	public List<String> getArticlesAndAuthorsInfoAndArticlesCategoryByAuthor() {

		ArticlesNameAndAuthorInfoAndArticlesCategoryDoa doa = new ArticlesNameAndAuthorInfoAndArticlesCategoryDoaImpl();
		List<ArticlesNameAndAuthorInfoAndArticlesCategory> list = doa
				.articlesAndAuthorsInfoAndArticlesCategoryByAuthorsLastName("last_name");
		List<String> strList = new ArrayList<String>();
		for (ArticlesNameAndAuthorInfoAndArticlesCategory article : list) {
			strList.add(article.toString());
		}
		return strList;
	}

	public List<String> getArticlesByCategory() {

		List<Article> list = articleDao.articlesByCategory("category");
		List<String> strList = new ArrayList<String>();
		for (Article article : list) {
			strList.add(article.toString());
		}
		return strList;
	}

	public List<String> getArticlesBytag() {

		List<Article> list = articleDao.articlesByTagTitle("title");
		List<String> strList = new ArrayList<String>();
		for (Article article : list) {
			strList.add(article.toString());
		}
		return strList;
	}

	public List<String> getArticlesByAuthorAndCategory() {

		ArticleNameAndAuthorLastNameAndCategoryDao dao = new ArticleNameAndAuthorLastNameAndCategoryDaoImpl();
		List<ArticleNameAndAuthorLastNameAndCategory> list = dao.articlesByAuthorsLastNameAndByCategory("last_name",
				"categorys");
		List<String> strList = new ArrayList<String>();
		for (ArticleNameAndAuthorLastNameAndCategory article : list) {
			strList.add(article.toString());
		}
		return strList;
	}

	public int CountArticlesByAuthorAndCategory() {
		int count;
		count = articleDao.CountArticlesByAuthorsLastNameAndByCategory("last_name", "category");
		return count;
	}

	public int CountArticlesBytag() {
		int count;
		count = articleDao.CountArticlesByTagTitle("title");
		return count;
	}

}
