package enicar.platform.stages.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "User", schema = "stages")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_U")
    private Integer idU;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    //@Column(name = "imageUser")
    private String imageUser;

    // Getters and Setters
    public Integer getIdU() { return idU; }
    public void setIdU(Integer idU) { this.idU = idU; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getImageUser() { return imageUser; }
    public void setImageUser(String imageUser) { this.imageUser = imageUser; }
}