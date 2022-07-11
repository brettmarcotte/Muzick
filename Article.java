package com.example.muzick.payloads.ApiResponse;

public class Article {

    private class Source {
        private String name;

        public Source(String name) {

            this.name = name;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    private String source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;

    public Article(){

    }

    public Article(String author, String title, String description, String url, String urlToImage) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
    }
}
