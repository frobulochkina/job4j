package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.print("Name: " + items[i].getName() + ", Id:");
                    System.out.println(items[i].getId());
                }
                System.out.println();
            } else if (select == 2) {
                System.out.print("Enter Id: ");
                String id = scanner.nextLine();
                System.out.print("Enter new item name: ");
                String newId = scanner.nextLine();
                if (tracker.replace(id, new Item(newId))) {
                    System.out.println("Item replaced");
                } else {
                    System.out.println("Item not found, check ID");
                }

            } else if (select == 3) {
                System.out.println("Enter item Id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Item deleted");
                } else {
                    System.out.println("Item not found, check ID");
                }

            } else if (select == 4) {
                System.out.println("Enter item Id: ");
                Item item = tracker.findById(scanner.nextLine());
                if (item != null) {
                    System.out.print("Name: " + item.getName() + ", Id:");
                    System.out.println(item.getId());
                } else {
                    System.out.println("Item not found, check ID");
                }
            } else if (select == 5) {
                System.out.println("Enter name: ");
                Item[] items = tracker.findByName(scanner.nextLine());
                for (int i = 0; i < items.length; i++) {
                    System.out.print("Name: " + items[i].getName() + ", Id:");
                    System.out.println(items[i].getId());
                }
                System.out.println();
            }else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu:" + "\n"
                + "0. Add new Item" + "\n"
                + "1. Show all items" + "\n"
                + "2. Edit item" + "\n"
                + "3. Delete item" + "\n"
                + "4. Find item by Id" + "\n"
                + "5. Find items by name" + "\n"
                + "6. Exit Program" + "\n");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}