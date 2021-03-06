package ru.job4j.tracker;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 19.05.2020
 */

public class Item {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}