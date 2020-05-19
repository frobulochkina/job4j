package ru.job4j.tracker;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReturnTheListWithoutNull() {
        Tracker tracker = new Tracker();
        Item one = new Item("test1");
        Item second = new Item("test2");
        Item[] expected = {one, second};
        tracker.add(one);
        tracker.add(second);
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item thirst = new Item("test3");
        Item fourth = new Item("test3");
        tracker.add(first);
        tracker.add(second);
        tracker.add(thirst);
        tracker.add(fourth);
        Item[] expected = {thirst, fourth};
        Item[] result = tracker.findByName("test3");
        assertThat(result, is(expected));
    }
}