package com.ironhack.labweek8;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RepositoryTests {

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private ConferenceRepository conferenceRepository;

    @Autowired
    private ExpositionRepository expositionRepository;

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private SpeakerRepository speakerRepository;

    @Test
    public void testCreateChapter() {
        Chapter chapter = new Chapter();
        chapter.setName("Chapter 1");
        chapter.setDistrict("District 1");
        chapter = chapterRepository.save(chapter);
        assertNotNull(chapter.getId());
    }

    @Test
    public void testCreateMember() {
        Member member = new Member();
        member.setName("John Doe");
        member.setStatus(Status.ACTIVE);
        member.setRenewalDate(LocalDate.now().plusYears(1));
        member = memberRepository.save(member);
        assertNotNull(member.getId());
    }

    @Test
    public void testCreateConference() {
        Conference conference = new Conference();
        conference.setDate(LocalDate.now().plusMonths(1));
        conference.setDuration(3);
        conference.setLocation("New York");
        conference.setTitle("Tech Conference 2024");
        conference = conferenceRepository.save(conference);
        assertNotNull(conference.getId());
    }

    @Test
    public void testCreateExposition() {
        Exposition exposition = new Exposition();
        exposition.setDate(LocalDate.now().plusMonths(2));
        exposition.setDuration(2);
        exposition.setLocation("Los Angeles");
        exposition.setTitle("Art Expo 2024");
        exposition = expositionRepository.save(exposition);
        assertNotNull(exposition.getId());
    }

    @Test
    public void testCreateGuest() {
        Guest guest = new Guest();
        guest.setName("Jane Smith");
        guest.setStatus(ResponseStatus.ATTENDING);
        guest = guestRepository.save(guest);
        assertNotNull(guest.getId());
    }

    @Test
    public void testCreateSpeaker() {
        Speaker speaker = new Speaker();
        speaker.setName("Dr. John");
        speaker.setPresentationDuration(45);
        speaker = speakerRepository.save(speaker);
        assertNotNull(speaker.getId());
    }
}

