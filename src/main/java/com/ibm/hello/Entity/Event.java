package com.ibm.hello.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


@Entity
@Table(name="tb_event")
@Getter
@Setter
public class Event implements Serializable {
    public static final long SerialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String local;
    private String city;
    private String estado;
    private Double price;
    private Instant data;
    private String description ;

    public Event() {
    }

    public Event(Long id, String name, String local, String city, String estado, Double price, Instant data, String description) {
        Id = id;
        this.name = name;
        this.local = local;
        this.city = city;
        this.estado = estado;
        this.price = price;
        this.data = data;
        this.description = description;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(Id, event.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
