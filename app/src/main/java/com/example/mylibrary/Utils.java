package com.example.mylibrary;

import java.util.ArrayList;

public class Utils {

    private static Utils instance;



    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> alreadyRead;
    private static ArrayList<Book> wantToRead;
    private static ArrayList<Book> currentlyReading;
    private static ArrayList<Book> favoriteBooks;

    private Utils(){
        if(null == allBooks){
            allBooks = new ArrayList<>();
            initData();
        }

        if(null == alreadyRead){
            alreadyRead = new ArrayList<>();
        }

        if(null == wantToRead){
            wantToRead = new ArrayList<>();
        }

        if(null == currentlyReading){
            currentlyReading = new ArrayList<>();
        }

        if(null == favoriteBooks){
            favoriteBooks = new ArrayList<>();
        }
    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getAlreadyRead() {
        return alreadyRead;
    }

    public static ArrayList<Book> getWantToRead() {
        return wantToRead;
    }

    public static ArrayList<Book> getCurrentlyReading() {
        return currentlyReading;
    }

    public static ArrayList<Book> getFavoriteBooks() {
        return favoriteBooks;
    }

    private void initData() {
        //TODO: add initial data
        allBooks.add(new Book(
                1,
                233,
                "1Q84",
                "X1",
                "https://copertine.hoepli.it/hoepli/xxl/978/8483/9788483835999.jpg",
                "A work of maddening brilliance",
                "Long description")
        );

    }


    public static Utils getInstance() {
        if(null != instance){
            return instance;
        }else{
            instance = new Utils();
            return instance;
        }
    }
}
