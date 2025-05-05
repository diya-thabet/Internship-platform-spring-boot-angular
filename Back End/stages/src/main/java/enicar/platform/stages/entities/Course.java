package enicar.platform.stages.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCourse;

    @Column(nullable = false)
    private String title;

    private String typeC;

    @Column(columnDefinition = "INT DEFAULT 0")
    private Integer nView;

    private String imageC;

    // Getters and Setters
    public Integer getIdCourse() { return idCourse; }
    public void setIdCourse(Integer idCourse) { this.idCourse = idCourse; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getTypeC() { return typeC; }
    public void setTypeC(String typeC) { this.typeC = typeC; }
    public Integer getNView() { return nView; }
    public void setNView(Integer nView) { this.nView = nView; }
    public String getImageC() { return imageC; }
    public void setImageC(String imageC) { this.imageC = imageC; }
}