package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "series")
    private int series;

    @Column(name = "model")
    private String model;


    @OneToOne
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }


    public Car(String model, int series) {
        this.series = series;
        this.model = model;
    }

    public Car() {

    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int service) {
        this.series = service;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                '}';
    }

}
