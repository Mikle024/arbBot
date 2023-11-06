package arbBot.classes;

import java.util.Objects;

public class Denomination {
    private int id;
    private String name;
    private int quantity;

    public Denomination(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
