package enicar.platform.stages.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Certification")
public class Certification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCertif;

    @Column(nullable = false)
    private String titleCert;

    private String type;

    private String description;

    private String imageUrl;

    // Getters and Setters
    public Integer getIdCertif() { return idCertif; }
    public void setIdCertif(Integer idCertif) { this.idCertif = idCertif; }
    public String getTitleCert() { return titleCert; }
    public void setTitleCert(String titleCert) { this.titleCert = titleCert; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}