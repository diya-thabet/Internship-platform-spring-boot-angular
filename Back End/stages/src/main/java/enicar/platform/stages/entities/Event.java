package enicar.platform.stages.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idE;

    @Column(nullable = false)
    private String name;

    private String description;

    private String imageE;

    private String urlE;

    // Getters and Setters
    public Integer getIdE() { return idE; }
    public void setIdE(Integer idE) { this.idE = idE; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getImageE() { return imageE; }
    public void setImageE(String imageE) { this.imageE = imageE; }
    public String getUrlE() { return urlE; }
    public void setUrlE(String urlE) { this.urlE = urlE; }
}