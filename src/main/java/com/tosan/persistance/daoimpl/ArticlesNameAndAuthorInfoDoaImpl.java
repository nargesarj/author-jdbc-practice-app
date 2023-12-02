package com.tosan.persistance.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tosan.persistance.dao.ArticlesNameAndAuthorInfoDoa;
import com.tosan.persistance.entity.ArticlesNameAndAuthorInfo;

public class ArticlesNameAndAuthorInfoDoaImpl implements ArticlesNameAndAuthorInfoDoa {

	@Override
	public List<ArticlesNameAndAuthorInfo> articlesAndAuthorsInfoByAuthorsLastName(String lastName) {
		List<ArticlesNameAndAuthorInfo> list = new ArrayList<>();
		ResultSet resultSet;
		String sql = "SELECT articles.name AS articleName , authors.id AS authorId, authors.first_name AS authorFirstName, authors.last_name AS authorLastName FROM articles join authors ON articles.author_id = authors.id WHERE authors.last_name = \"jacky\"";
		try {
			resultSet = JdbcConnection.getJdbcConnection().statement.executeQuery(sql);
			while (resultSet.next()) {
				list.add(
						new ArticlesNameAndAuthorInfo(resultSet.getString("articleName"), resultSet.getLong("authorId"),
								resultSet.getString("authorFirstName"), resultSet.getString("authorLastName")));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

}
