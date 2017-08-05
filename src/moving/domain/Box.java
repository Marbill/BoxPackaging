package moving.domain;

import java.util.ArrayList;
import java.util.List;

/* @author marbi */
public class Box implements Thing {

    private int maximumCapacity;
    private List<Item> items;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        items = new ArrayList<Item>();
    }

    public boolean addThing(Thing thing) {
        if (this.maximumCapacity >= thing.getVolume()) {
            items.add((Item) thing);
            this.maximumCapacity -= thing.getVolume();
            return true;
        }

        return false;
    }

    @Override
    public int getVolume() {
        int totalVolume = 0;
        for (Item item : items) {
            totalVolume += item.getVolume();
        }

        return totalVolume;
    }

}
