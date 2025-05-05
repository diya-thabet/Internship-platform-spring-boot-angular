package enicar.platform.stages.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Roadmap")
public class Roadmap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idR;

    private String type;

    private String imageR;

    private String description;

    // Getters and Setters
    public Integer getIdR() { return idR; }
    public void setIdR(Integer idR) { this.idR = idR; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getImageR() { return imageR; }
    public void setImageR(String imageR) { this.imageR = imageR; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}