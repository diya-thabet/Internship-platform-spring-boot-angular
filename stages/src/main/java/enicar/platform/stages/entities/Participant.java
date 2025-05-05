package enicar.platform.stages.entities;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Participant", schema = "stages")
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_F")
    private Integer idF;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String section;

    private String tel;

    @ManyToMany
    @JoinTable(
            name = "HackathonParticipant",
            schema = "stages",
            joinColumns = @JoinColumn(name = "id_F"),
            inverseJoinColumns = @JoinColumn(name = "id_H")
    )
    private Set<Hackathon> hackathons = new HashSet<>();

    // Getters and Setters
    public Integer getIdF() { return idF; }
    public void setIdF(Integer idF) { this.idF = idF; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getSection() { return section; }
    public void setSection(String section) { this.section = section; }
    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel = tel; }
    public Set<Hackathon> getHackathons() { return hackathons; }
    public void setHackathons(Set<Hackathon> hackathons) { this.hackathons = hackathons; }
}