
package library.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import library.model.Lendable;

public class Library {

    private final List<Lendable> items = new ArrayList<>();

    public void addItem(Lendable item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    public List<Lendable> getAvailableItems() {
        List<Lendable> availableItems = new ArrayList<>();

        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                availableItems.add(item);
            }
        }

        return availableItems;
    }

    public List<Lendable> getAllItems() {
        return Collections.unmodifiableList(
            new ArrayList<>(items)
        );
    }

    public void listAllItems() {
        for (Lendable item : items) {
            System.out.println(item);
        }
    }
}
