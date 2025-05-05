package enicar.platform.stages.DTO;

import enicar.platform.stages.entities.*;
import enicar.platform.stages.service.VideosRoad;

import java.util.List;
import java.util.stream.Collectors;

public class DTOConverter {

    // Course conversions
    public static CourseDTO toCourseDTO(Course course) {
        CourseDTO dto = new CourseDTO();
        dto.setIdCourse(course.getIdCourse());
        dto.setTitle(course.getTitle());
        dto.setTypeC(course.getTypeC());
        dto.setNView(course.getNView());
        dto.setImageC(course.getImageC());
        return dto;
    }

    public static List<CourseDTO> toCourseDTOList(List<Course> courses) {
        return courses.stream().map(DTOConverter::toCourseDTO).collect(Collectors.toList());
    }

    // Certification conversions
    public static CertificationDTO toCertificationDTO(Certification certification) {
        CertificationDTO dto = new CertificationDTO();
        dto.setIdCertif(certification.getIdCertif());
        dto.setTitleCert(certification.getTitleCert());
        dto.setType(certification.getType());
        dto.setDescription(certification.getDescription());
        dto.setImageUrl(certification.getImageUrl());
        return dto;
    }

    public static List<CertificationDTO> toCertificationDTOList(List<Certification> certifications) {
        return certifications.stream().map(DTOConverter::toCertificationDTO).collect(Collectors.toList());
    }

    // Mentor conversions
    public static MentorDTO toMentorDTO(Mentor mentor) {
        MentorDTO dto = new MentorDTO();
        dto.setIdM(mentor.getIdM());
        dto.setName(mentor.getName());
        dto.setJob(mentor.getJob());
        dto.setEmail(mentor.getEmail());
        return dto;
    }

    public static List<MentorDTO> toMentorDTOList(List<Mentor> mentors) {
        return mentors.stream().map(DTOConverter::toMentorDTO).collect(Collectors.toList());
    }

    // Internship conversions
    public static InternshipDTO toInternshipDTO(Internship internship) {
        InternshipDTO dto = new InternshipDTO();
        dto.setIdI(internship.getIdI());
        dto.setCompany(internship.getCompany());
        dto.setDescription(internship.getDescription());
        dto.setNameIntern(internship.getNameIntern());
        dto.setImageIntern(internship.getImageIntern());
        dto.setUrlDrive(internship.getUrlDrive());
        dto.setDateEnd(internship.getDateEnd());
        dto.setPopularity(internship.getPopularity());
        return dto;
    }

    public static List<InternshipDTO> toInternshipDTOList(List<Internship> internships) {
        return internships.stream().map(DTOConverter::toInternshipDTO).collect(Collectors.toList());
    }

    // Roadmap conversions
    public static RoadmapDTO toRoadmapDTO(Roadmap roadmap) {
        RoadmapDTO dto = new RoadmapDTO();
        dto.setIdR(roadmap.getIdR());
        dto.setType(roadmap.getType());
        dto.setImageR(roadmap.getImageR());
        dto.setDescription(roadmap.getDescription());
        return dto;
    }

    public static List<RoadmapDTO> toRoadmapDTOList(List<Roadmap> roadmaps) {
        return roadmaps.stream().map(DTOConverter::toRoadmapDTO).collect(Collectors.toList());
    }

    // Event conversions
    public static EventDTO toEventDTO(Event event) {
        EventDTO dto = new EventDTO();
        dto.setIdE(event.getIdE());
        dto.setName(event.getName());
        dto.setDescription(event.getDescription());
        dto.setImageE(event.getImageE());
        dto.setUrlE(event.getUrlE());
        return dto;
    }

    public static List<EventDTO> toEventDTOList(List<Event> events) {
        return events.stream().map(DTOConverter::toEventDTO).collect(Collectors.toList());
    }

    // Hackathon conversions
    public static HackathonDTO toHackathonDTO(Hackathon hackathon) {
        HackathonDTO dto = new HackathonDTO();
        dto.setIdH(hackathon.getIdH());
        dto.setNameHack(hackathon.getNameHack());
        dto.setDateHack(hackathon.getDateHack());
        dto.setDescription(hackathon.getDescription());
        dto.setImageH(hackathon.getImageH());
        dto.setUrlH(hackathon.getUrlH());
        return dto;
    }

    public static List<HackathonDTO> toHackathonDTOList(List<Hackathon> hackathons) {
        return hackathons.stream().map(DTOConverter::toHackathonDTO).collect(Collectors.toList());
    }

    // User conversions
    public static UserDTO toUserDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setIdU(user.getIdU());
        dto.setEmail(user.getEmail());
        dto.setImageUser(user.getImageUser());
        return dto;
    }

    public static List<UserDTO> toUserDTOList(List<User> users) {
        return users.stream().map(DTOConverter::toUserDTO).collect(Collectors.toList());
    }

    // Article conversions
    public static ArticleDTO toArticleDTO(Article article) {
        ArticleDTO dto = new ArticleDTO();
        dto.setIdA(article.getIdA());
        dto.setName(article.getName());
        dto.setTypeA(article.getTypeA());
        dto.setDescription(article.getDescription());
        dto.setUrl(article.getUrl());
        return dto;
    }

    public static List<ArticleDTO> toArticleDTOList(List<Article> articles) {
        return articles.stream().map(DTOConverter::toArticleDTO).collect(Collectors.toList());
    }

    // Podcast conversions
    public static PodcastDTO toPodcastDTO(Podcast podcast) {
        PodcastDTO dto = new PodcastDTO();
        dto.setIdP(podcast.getIdP());
        dto.setNameP(podcast.getNameP());
        dto.setDescriptionP(podcast.getDescriptionP());
        dto.setImageP(podcast.getImageP());
        dto.setUrlP(podcast.getUrlP());
        return dto;
    }

    public static List<PodcastDTO> toPodcastDTOList(List<Podcast> podcasts) {
        return podcasts.stream().map(DTOConverter::toPodcastDTO).collect(Collectors.toList());
    }

    // Video conversions
    public static VideoDTO toVideoDTO(Video video) {
        VideoDTO dto = new VideoDTO();
        dto.setIdV(video.getIdV());
        dto.setDescription(video.getDescription());
        dto.setName(video.getName());
        return dto;
    }

    public static List<VideoDTO> toVideoDTOList(List<Video> videos) {
        return videos.stream().map(DTOConverter::toVideoDTO).collect(Collectors.toList());
    }

    // Participant conversions
    public static ParticipantDTO toParticipantDTO(Participant participant) {
        ParticipantDTO dto = new ParticipantDTO();
        dto.setIdF(participant.getIdF());
        dto.setFirstName(participant.getFirstName());
        dto.setLastName(participant.getLastName());
        dto.setSection(participant.getSection());
        dto.setTel(participant.getTel());
        return dto;
    }

    public static List<ParticipantDTO> toParticipantDTOList(List<Participant> participants) {
        return participants.stream().map(DTOConverter::toParticipantDTO).collect(Collectors.toList());
    }

    // VideosRoad conversions
    public static VideosRoadDTO toVideosRoadDTO(VideosRoad videosRoad) {
        VideosRoadDTO dto = new VideosRoadDTO();
        dto.setIdV(videosRoad.getIdV());
        dto.setNameV(videosRoad.getNameV());
        dto.setImageV(videosRoad.getImageV());
        dto.setUrlV(videosRoad.getUrlV());
        dto.setType(videosRoad.getType());
        return dto;
    }

    public static List<VideosRoadDTO> toVideosRoadDTOList(List<VideosRoad> videosRoads) {
        return videosRoads.stream().map(DTOConverter::toVideosRoadDTO).collect(Collectors.toList());
    }
}