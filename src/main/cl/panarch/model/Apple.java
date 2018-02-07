package main.cl.panarch.model;


public class Apple {
    private String color;
    private int weight;
    private int id;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        if(o instanceof Apple){
            Apple apple = (Apple) o;

            if (this.weight != apple.weight) return false;
            if (this.id != apple.id) return false;
            return this.color != null ? this.color.equals(apple.color) : apple.color == null;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + weight;
        result = 31 * result + id;
        return result;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", id=" + id +
                '}';
    }
}
