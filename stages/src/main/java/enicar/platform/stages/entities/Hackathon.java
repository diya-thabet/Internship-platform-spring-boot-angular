package enicar.platform.stages.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Hackathon", schema = "stages")
public class Hackathon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_H")
    private Integer idH;

    @Column(nullable = false)
    private String nameHack;

    private LocalDate dateHack;

    private String description;

    private String imageH;

    private String urlH;

    @ManyToMany(mappedBy = "hackathons")
    private Set<Participant> participants = new HashSet<>();

    // Getters and Setters
    public Integer getIdH() { return idH; }
    public void setIdH(Integer idH) { this.idH = idH; }
    public String getNameHack() { return nameHack; }
    public void setNameHack(String nameHack) { this.nameHack = nameHack; }
    public LocalDate getDateHack() { return dateHack; }
    public void setDateHack(LocalDate dateHack) { this.dateHack = dateHack; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getImageH() { return imageH; }
    public void setImageH(String imageH) { this.imageH = imageH; }
    public String getUrlH() { return urlH; }
    public void setUrlH(String urlH) { this.urlH = urlH; }
    public Set<Participant> getParticipants() { return participants; }
    public void setParticipants(Set<Participant> participants) { this.participants = participants; }
}