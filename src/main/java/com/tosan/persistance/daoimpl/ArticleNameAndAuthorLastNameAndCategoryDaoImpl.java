package com.tosan.persistance.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tosan.persistance.dao.ArticleNameAndAuthorLastNameAndCategoryDao;
import com.tosan.persistance.entity.ArticleNameAndAuthorLastNameAndCategory;

public class ArticleNameAndAuthorLastNameAndCategoryDaoImpl implements ArticleNameAndAuthorLastNameAndCategoryDao {

	@Override
	public List<ArticleNameAndAuthorLastNameAndCategory> articlesByAuthorsLastNameAndByCategory(String lastName,
			String category) {

		List<ArticleNameAndAuthorLastNameAndCategory> list = new ArrayList<>();
		ResultSet resultSet;
		String sql = "SELECT articles.name, authors.last_name, category FROM articles join authors ON articles.author_id =  authors.id WHERE category =\"software1\" and last_name =\"jacky\"";
		try {
			resultSet = JdbcConnection.getJdbcConnection().statement.executeQuery(sql);
			while (resultSet.next()) {
				list.add(new ArticleNameAndAuthorLastNameAndCategory(resultSet.getString("name"),
						resultSet.getString("last_name"), resultSet.getString("category")));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

}
