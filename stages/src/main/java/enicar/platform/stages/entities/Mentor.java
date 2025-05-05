package enicar.platform.stages.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Mentor")
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idM;

    @Column(nullable = false)
    private String name;

    private String job;

    private String email;

    // Getters and Setters
    public Integer getIdM() { return idM; }
    public void setIdM(Integer idM) { this.idM = idM; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}