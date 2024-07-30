package com.ironhack.labweek8;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("EXPOSITION")
public class Exposition extends Event {
    // Specific fields for Exposition, if any
}

