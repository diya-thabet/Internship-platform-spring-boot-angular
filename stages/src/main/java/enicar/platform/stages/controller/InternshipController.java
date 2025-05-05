package enicar.platform.stages.controller;

import enicar.platform.stages.DTO.InternshipDTO;
import enicar.platform.stages.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/internships")
@CrossOrigin(origins = "*")
public class InternshipController {

    @Autowired
    private InternshipService internshipService;

    @GetMapping
    public List<InternshipDTO> getAllInternships() {
        return internshipService.getAllInternships();
    }

    @GetMapping("/this-month")
    public List<InternshipDTO> getInternshipsThisMonth() {
        return internshipService.getInternshipsThisMonth();
    }

    @GetMapping("/this-day")
    public List<InternshipDTO> getInternshipsThisDay() {
        return internshipService.getInternshipsThisDay();
    }

    @GetMapping("/this-week")
    public List<InternshipDTO> getInternshipsThisWeek() {
        return internshipService.getInternshipsThisWeek();
    }

    @GetMapping("/popular")
    public List<InternshipDTO> getPopularInternships() {
        return internshipService.getPopularInternships();
    }
}