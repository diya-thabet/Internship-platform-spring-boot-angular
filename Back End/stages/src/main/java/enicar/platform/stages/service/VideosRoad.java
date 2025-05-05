package enicar.platform.stages.service;

import jakarta.persistence.*;

@Entity
@Table(name = "VideosRoad", schema = "stages")
public class VideosRoad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_V")
    private Integer idV;

    @Column(nullable = false)
    private String nameV;

    private String imageV;

    private String urlV;

    private String type;

    // Getters and Setters
    public Integer getIdV() { return idV; }
    public void setIdV(Integer idV) { this.idV = idV; }
    public String getNameV() { return nameV; }
    public void setNameV(String nameV) { this.nameV = nameV; }
    public String getImageV() { return imageV; }
    public void setImageV(String imageV) { this.imageV = imageV; }
    public String getUrlV() { return urlV; }
    public void setUrlV(String urlV) { this.urlV = urlV; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}