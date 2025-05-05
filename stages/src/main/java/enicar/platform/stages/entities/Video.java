package enicar.platform.stages.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Video", schema = "stages")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_V")
    private Integer idV;

    private String description;

    @Column(nullable = false)
    private String name;

    // Getters and Setters
    public Integer getIdV() { return idV; }
    public void setIdV(Integer idV) { this.idV = idV; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}