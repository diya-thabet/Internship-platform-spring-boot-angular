package enicar.platform.stages.service;

import enicar.platform.stages.DTO.DTOConverter;
import enicar.platform.stages.DTO.InternshipDTO;
import enicar.platform.stages.repositories.InternshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class InternshipService {

    @Autowired
    private InternshipRepository internshipRepository;

    public List<InternshipDTO> getAllInternships() {
        return DTOConverter.toInternshipDTOList(internshipRepository.findAll());
    }

    public List<InternshipDTO> getInternshipsThisMonth() {
        LocalDate now = LocalDate.now();
        LocalDate startOfMonth = now.withDayOfMonth(1);
        LocalDate endOfMonth = now.withDayOfMonth(now.lengthOfMonth());
        return DTOConverter.toInternshipDTOList(internshipRepository.findByDateEndBetween(startOfMonth, endOfMonth));
    }

    public List<InternshipDTO> getInternshipsThisDay() {
        LocalDate today = LocalDate.now();
        return DTOConverter.toInternshipDTOList(internshipRepository.findByDateEnd(today));
    }

    public List<InternshipDTO> getInternshipsThisWeek() {
        LocalDate now = LocalDate.now();
        LocalDate startOfWeek = now.with(java.time.temporal.TemporalAdjusters.previousOrSame(java.time.DayOfWeek.MONDAY));
        LocalDate endOfWeek = startOfWeek.plusDays(6);
        return DTOConverter.toInternshipDTOList(internshipRepository.findByDateEndBetween(startOfWeek, endOfWeek));
    }

    public List<InternshipDTO> getPopularInternships() {
        return DTOConverter.toInternshipDTOList(internshipRepository.findByPopularityGreaterThan(0));
    }
}