package dev.sukanya.gamecourtbooking.dto.timeslot;


import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
public class TimeSlotDTO {
    private int id;

    private Time startDate;

    private Time endDate;
}
