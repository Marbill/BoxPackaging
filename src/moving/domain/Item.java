package moving.domain;

/* @author marbi */
public class Item implements Thing, Comparable<Item> {

    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int compareTo(Item o) {
        if (this.volume == o.volume) {
            return 0;
        } else {
            return this.volume > o.volume ? 1 : -1;
        }
    }

}
