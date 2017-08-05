package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/* @author marbi */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<Box>();
        Box box = new Box(boxesVolume);

        while (!things.isEmpty()) {
            for (int i = 0; i < things.size(); i++) {
                if (box.addThing(things.get(i))) {
                    things.remove(i);
                } else {
                    boxes.add(box);
                    box = new Box(boxesVolume);
                }

                if (things.isEmpty()) {
                    boxes.add(box);
                }
            }
        }

        return boxes;
    }

}
