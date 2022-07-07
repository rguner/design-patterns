package p_1_5_factory;

public abstract class Car {

    private String title;
    private String color;
    private int power;

    public Car(String title, String color, int power) {
        this.title = title;
        this.color = color;
        this.power = power;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("title='").append(title).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", power=").append(power);
        sb.append('}');
        return sb.toString();
    }
}
