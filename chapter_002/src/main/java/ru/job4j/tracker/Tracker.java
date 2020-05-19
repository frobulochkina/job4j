package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 19.05.2020
 */

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    private int index = 100;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод получает список всех заявок.
     * @return копию массива без пустых клеток.
     */
    public Item[] findAll() {
        Item[] names = new Item[items.length];
        Item[] namesWithoutNull = new Item[names.length];
        int size = 0;
        for(int i = 0; i < names.length; i++){
            Item name = names[i];
            if(name != null){
                namesWithoutNull[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(items, position);
    }


    /**
     * Метод получает список по имени.
     * Проверяет в цикле все элемента массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * @return список элементов, у которых совпало name.
     */
    public Item[] findByName(String key) {
        Item[] searcher  = new Item[this.index];
        int count = 0;
        for (int i = 0; i < this.position; i++) {
            if (key.equals(this.items[i].getName())) {
                searcher [count++] = this.items[i];
            }
        }
        searcher  = Arrays.copyOf(searcher , count);
        return searcher ;
    }

    /**
     * Метод получает список заявок по id.
     * Проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id.
     * @return найденный Item. Если Item не найден - возвращает null.
     */
    public Item findById(String id) {
        Item searcher = null;
        for (int i = 0; i < this.position; i++) {
            if (id.equals(this.items[i].getId())) {
                searcher = this.items[i];
                break;
            }
        }
        return searcher ;
    }

}