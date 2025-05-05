package enicar.platform.stages.DTO;

public class ParticipantDTO {
    private Integer idF;
    private String firstName;
    private String lastName;
    private String section;
    private String tel;

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
}