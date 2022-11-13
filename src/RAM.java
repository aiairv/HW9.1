public class RAM {
    private int capacity;
    private String producer;

    public RAM(int capacity, String producer) {
        this.capacity = capacity;
        this.producer = producer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacity=" + capacity +
                ", producer='" + producer + '\'' +
                '}';
    }
}
