package com.tosan.persistance.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tosan.persistance.dao.ArticlesNameAndAuthorInfoAndArticlesCategoryDoa;
import com.tosan.persistance.entity.ArticlesNameAndAuthorInfoAndArticlesCategory;

public class ArticlesNameAndAuthorInfoAndArticlesCategoryDoaImpl
		implements ArticlesNameAndAuthorInfoAndArticlesCategoryDoa {

	public List<ArticlesNameAndAuthorInfoAndArticlesCategory> articlesAndAuthorsInfoAndArticlesCategoryByAuthorsLastName(
			String lastName) {
		List<ArticlesNameAndAuthorInfoAndArticlesCategory> list = new ArrayList<>();
		ResultSet resultSet;
		String sql = "SELECT articles.name AS articleName, articles.category AS articleCategory, authors.id AS authorId, authors.first_name AS authorFirstName, authors.last_name AS authorLastName FROM articles join authors ON articles.author_id = authors.id WHERE authors.last_name = \"jacky\"";
		try {
			resultSet = JdbcConnection.getJdbcConnection().statement.executeQuery(sql);
			while (resultSet.next()) {
				list.add(new ArticlesNameAndAuthorInfoAndArticlesCategory(resultSet.getString("articleName"),
						resultSet.getString("articleCategory"), resultSet.getLong("authorId"),
						resultSet.getString("authorFirstName"), resultSet.getString("authorLastName")));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

}
