package com.tosan.persistance.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tosan.persistance.dao.ArticleDao;
import com.tosan.persistance.entity.Article;

public class ArticleDaoImpl implements ArticleDao {

	public List<Article> articlesWithCategory() {
		List<Article> list = new ArrayList<Article>();
		ResultSet resultSet;
		String sql = "SELECT  name, category FROM articles";
		try {
			resultSet = JdbcConnection.getJdbcConnection().statement.executeQuery(sql);
			while (resultSet.next()) {
				list.add(new Article(resultSet.getString("name"), resultSet.getString("category")));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	public List<Article> articlesByAuthorsLastName(String lastName) {
		List<Article> list = new ArrayList<Article>();
		ResultSet resultSet;
		String sql = "SELECT articles.name , articles.category FROM articles join authors ON articles.author_id = authors.id WHERE authors.last_name = \"jacky\"";
		try {
			resultSet = JdbcConnection.getJdbcConnection().statement.executeQuery(sql);
			while (resultSet.next()) {
				list.add(new Article(resultSet.getString("name"), resultSet.getString("category")));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	public List<Article> articlesByCategory(String category) {
		List<Article> list = new ArrayList<Article>();
		ResultSet resultSet;
		String sql = "SELECT name, category FROM articles WHERE category =\"software1\"";
		try {
			resultSet = JdbcConnection.getJdbcConnection().statement.executeQuery(sql);
			while (resultSet.next()) {
				list.add(new Article(resultSet.getString("name"), resultSet.getString("category")));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	public List<Article> articlesByTagTitle(String title) {
		List<Article> list = new ArrayList<Article>();
		ResultSet resultSet;
		String sql = "SELECT articles.name, tags.title FROM tags join articles ON tags.article_id = articles.id WHERE tags.title =\"s1\"";
		try {
			resultSet = JdbcConnection.getJdbcConnection().statement.executeQuery(sql);
			while (resultSet.next()) {
				list.add(new Article(resultSet.getString("name"), resultSet.getString("title")));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	public int CountArticlesByAuthorsLastNameAndByCategory(String lastName, String category) {
		int count;
		ResultSet resultSet;
		String sql = "SELECT COUNT(articles.name) AS count, articles.name, authors.last_name, category FROM articles join authors ON articles.author_id =  authors.id WHERE authors.last_name = \"willy\" and articles.category = \"software2\" GROUP BY articles.name";
		try {
			resultSet = JdbcConnection.getJdbcConnection().statement.executeQuery(sql);
			resultSet.next();
			count = resultSet.getInt("count");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return count;
	}

	public int CountArticlesByTagTitle(String title) {
		int count;
		ResultSet resultSet;
		String sql = "SELECT COUNT(articles.name) AS count, articles.name, tags.title FROM tags join articles ON tags.article_id = articles.id WHERE tags.title = \"s1\" GROUP BY articles.name";
		try {
			resultSet = JdbcConnection.getJdbcConnection().statement.executeQuery(sql);
			resultSet.next();
			count = resultSet.getInt("count");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return count;
	}

}
