package com.ksusha.portfolioapp.cv;

public class CVItem {

    private String title;
    private String description;

    public CVItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
