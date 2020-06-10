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
        return Arrays.copyOf(items, position);
    }


    /**
     * Метод получает список по имени.
     * Проверяет в цикле все элемента массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key.
     * @return список элементов, у которых совпало name.
     */
    public Item[] findByName(String key) {
        Item[] searcher  = new Item[this.position];
        int count = 0;
        for (int i = 0; i < this.position; i++) {
            if (key.equals(this.items[i].getName())) {
                searcher [count++] = this.items[i];
            }
        }
        searcher = Arrays.copyOf(searcher, count);
        return searcher;
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
        return searcher;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        this.items[index] = item;
        this.items[index].setId(id);
        return true;
    }

    public boolean delete(String id) {
        int distPosition = indexOf(id);
        int start = distPosition + 1;
        int size = position - distPosition;
        if (distPosition == -1) {
            return false;
        }
        System.arraycopy(items, start, items, distPosition, size);
        items[position] = null;
        position--;
        return true;
    }

}