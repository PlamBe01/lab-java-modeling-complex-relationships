package com.ironhack.labweek8;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("CONFERENCE")
public class Conference extends Event {

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;

    // Getters and setters

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }
}
