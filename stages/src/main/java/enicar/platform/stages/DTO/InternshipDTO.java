package enicar.platform.stages.DTO;


import java.time.LocalDate;

public class InternshipDTO {
    private Integer idI;
    private String company;
    private String description;
    private String nameIntern;
    private String imageIntern;
    private String urlDrive;
    private LocalDate dateEnd;
    private Integer popularity;

    // Getters and Setters
    public Integer getIdI() { return idI; }
    public void setIdI(Integer idI) { this.idI = idI; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getNameIntern() { return nameIntern; }
    public void setNameIntern(String nameIntern) { this.nameIntern = nameIntern; }
    public String getImageIntern() { return imageIntern; }
    public void setImageIntern(String imageIntern) { this.imageIntern = imageIntern; }
    public String getUrlDrive() { return urlDrive; }
    public void setUrlDrive(String urlDrive) { this.urlDrive = urlDrive; }
    public LocalDate getDateEnd() { return dateEnd; }
    public void setDateEnd(LocalDate dateEnd) { this.dateEnd = dateEnd; }
    public Integer getPopularity() { return popularity; }
    public void setPopularity(Integer popularity) { this.popularity = popularity; }
}