package collections;

public class Box {

    private int weight;
    private int size;

    public Box(int weight, int size) {
        this.weight = weight;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Box) {
            Box box = (Box) obj;
            return this.weight == box.weight && this.size == box.size;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return weight * 2 + size / 4 + 16;
    }

    @Override
    public String toString() {
        return "Box: " + this.weight + " " + this.size;
    }
}
