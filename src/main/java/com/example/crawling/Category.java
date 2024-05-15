package com.example.crawling;

public enum Category {
    DARAMA("01", "drama"),
    MOVIE("02", "movie"),
    SHOW("03", "show"),
    ARTIST("04", "artist"),
    NONE("00", "");

    private final String code;
    private final String type;

    Category(String code, String type) {
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public static Category of(String input) {
        for (Category category : Category.values()) {
            if (input.contains(category.type)) {
                return category;
            }
        }
        return NONE;
    }
}