package com.tosan.presentation;

import java.util.List;

import com.tosan.service.AuthorServiceApp;

public class MyAuthorApp {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("getArticlesWithCategory");
		AuthorServiceApp authorServiceApp = new AuthorServiceApp();
		List<String> list = authorServiceApp.getArticlesWithCategory();
		for (String string : list)
			System.out.println(string);

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("getArticlesByAuthor");
		authorServiceApp = new AuthorServiceApp();
		list = authorServiceApp.getArticlesByAuthor();
		for (String string : list)
			System.out.println(string);

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("getArticlesAndAuthorsInfoByAuthor");
		authorServiceApp = new AuthorServiceApp();
		list = authorServiceApp.getArticlesAndAuthorsInfoByAuthor();
		for (String string : list)
			System.out.println(string);

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("getArticlesAndAuthorsInfoAndArticlesCategoryByAuthor");
		authorServiceApp = new AuthorServiceApp();
		list = authorServiceApp.getArticlesAndAuthorsInfoAndArticlesCategoryByAuthor();
		for (String string : list)
			System.out.println(string);

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("getArticlesByCategory");
		authorServiceApp = new AuthorServiceApp();
		list = authorServiceApp.getArticlesByCategory();
		for (String string : list)
			System.out.println(string);

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("getArticlesBytag");
		authorServiceApp = new AuthorServiceApp();
		list = authorServiceApp.getArticlesBytag();
		for (String string : list)
			System.out.println(string);

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("getArticlesByAuthorAndCategory");
		authorServiceApp = new AuthorServiceApp();
		list = authorServiceApp.getArticlesByAuthorAndCategory();
		for (String string : list)
			System.out.println(string);

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("CountArticlesByAuthorAndCategory");
		authorServiceApp = new AuthorServiceApp();
		int count1 = authorServiceApp.CountArticlesByAuthorAndCategory();
		System.out.println(count1);

		System.out.println("");
		System.out.println("--------------------------------------------------------------");
		System.out.println("CountArticlesBytag");
		authorServiceApp = new AuthorServiceApp();
		int count2 = authorServiceApp.CountArticlesBytag();
		System.out.println(count2);

	}

}
