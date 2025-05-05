package enicar.platform.stages.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Podcast", schema = "stages")
public class Podcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_P")
    private Integer idP;

    @Column(nullable = false)
    private String nameP;

    private String descriptionP;

    private String imageP;

    private String urlP;

    // Getters and Setters
    public Integer getIdP() { return idP; }
    public void setIdP(Integer idP) { this.idP = idP; }
    public String getNameP() { return nameP; }
    public void setNameP(String nameP) { this.nameP = nameP; }
    public String getDescriptionP() { return descriptionP; }
    public void setDescriptionP(String descriptionP) { this.descriptionP = descriptionP; }
    public String getImageP() { return imageP; }
    public void setImageP(String imageP) { this.imageP = imageP; }
    public String getUrlP() { return urlP; }
    public void setUrlP(String urlP) { this.urlP = urlP; }
}