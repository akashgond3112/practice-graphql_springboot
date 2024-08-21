package com.graphql.spring_graphql;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id, String name, Integer pageCount, Integer authorId) {

	public static List<Book> books = Arrays.asList(
		new Book(1, "A", 1,1),
		new Book(2, "B", 1,2),
		new Book(3, "C", 1,2),
		new Book(4, "D", 1,1),
		new Book(5, "E", 1,1)
	);

	public static Book getBookById(Integer id) {
		return books.stream().filter(book -> book.id.equals(id)).findFirst().orElse(null);
	}
}
