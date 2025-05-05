package enicar.platform.stages.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Article", schema = "stages")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_A")
    private Integer idA;

    @Column(nullable = false)
    private String name;

    private String typeA;

    private String description;

    private String url;

    // Getters and Setters
    public Integer getIdA() { return idA; }
    public void setIdA(Integer idA) { this.idA = idA; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTypeA() { return typeA; }
    public void setTypeA(String typeA) { this.typeA = typeA; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}