package lt.sdacademy.fundamentalscoding.practicalexcercises.bookAndAuthor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookAndAuthorMain {
    List<Author> bookList = new ArrayList<>();

    public static void main(String[] args) {
        List<Book> bookList = readDataFromFile();
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    private static List<Book> readDataFromFile() {
        List<Book> bookList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/jonas/IdeaProjects/Introduction webinar/src/lt/sdacademy/fundamentalscoding/practicalexcercises/bookAndAuthor/BooksData.txt"))) {
            String line = br.readLine();

            while (line != null) {
                bookList.add(mapBookData(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Ivyko klaida skaitant faila.");
        }
        return bookList;
    }

    private static Book mapBookData(String bookData) {
        String[] splittedLineData = bookData.split(";");
        return new Book(splittedLineData[0], mapAuthorData(splittedLineData[1]), Double.parseDouble(splittedLineData[2]), Integer.parseInt(splittedLineData[3]));
    }

    private static List<Author> mapAuthorData(String authorData) {
        List<Author> authors = new ArrayList<>();
        String[] splittedLineData = authorData.split("-");
        if (splittedLineData.length == 1 ) {
            String[] authorsData = authorData.split(",");
            authors.add(new Author(authorsData[0], authorsData[1], authorsData[2]));
        }
        for (String authorsInfo : splittedLineData) {
            String[] authorsData = authorsInfo.split(",");
            authors.add(new Author(authorsData[0], authorsData[1], authorsData[2]));
        }
        return authors;
    }


}
