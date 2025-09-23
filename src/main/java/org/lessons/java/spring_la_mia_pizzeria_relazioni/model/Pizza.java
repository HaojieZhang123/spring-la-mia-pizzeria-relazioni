package org.lessons.java.spring_la_mia_pizzeria_relazioni.model;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "pizzas")
public class Pizza {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Il nome della pizza non può essere vuoto")
    @Size(min = 2, max = 50, message = "Il nome della pizza deve essere tra 2 e 50 caratteri")
    private String name;

    @Lob
    private String description;

    @NotBlank(message = "La foto della pizza non può essere vuota")
    private String photo;

    @NotNull(message = "Il prezzo della pizza non può essere vuoto")
    @Min(value = 0, message = "Il prezzo della pizza non puo' essere negativo")
    private BigInteger price;

    // setters and getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

}
