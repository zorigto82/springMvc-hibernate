package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private int series;
    private int releaseDate;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car(String model, int series, int releaseDate) {
        this.model = model;
        this.series = series;
        this.releaseDate = releaseDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && releaseDate == car.releaseDate && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, releaseDate);
    }

    @Override
    public String toString() {
        return "Car{" +
                " model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
