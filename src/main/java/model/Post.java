package model;

import tool.Util;

public class Post {
    private String title;
    private String content;
    private int number;
    private String date;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.date = Util.getNowTime();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }
}
