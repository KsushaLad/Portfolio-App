package com.ksusha.portfolioapp.portfolio;

import java.io.Serializable;

public class PortfolioItem implements Serializable {

    private int image;

    public PortfolioItem(int image) {
        this.image = image;
    }
    public int getImage() {
        return image;
    }
}
