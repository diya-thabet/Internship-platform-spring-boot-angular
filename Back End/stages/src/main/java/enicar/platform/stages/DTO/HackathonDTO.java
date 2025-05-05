package enicar.platform.stages.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class HackathonDTO {
    private Integer idH;
    private String nameHack;
    private LocalDate dateHack;
    private String description;
    private String imageH;
    private String urlH;

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
}