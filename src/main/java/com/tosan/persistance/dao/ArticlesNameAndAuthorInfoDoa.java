package com.tosan.persistance.dao;

import java.util.List;

import com.tosan.persistance.entity.ArticlesNameAndAuthorInfo;

public interface ArticlesNameAndAuthorInfoDoa {

	List<ArticlesNameAndAuthorInfo> articlesAndAuthorsInfoByAuthorsLastName(String lastName);
}
