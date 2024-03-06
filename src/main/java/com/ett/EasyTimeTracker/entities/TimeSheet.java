package com.ett.EasyTimeTracker.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "tb_time_sheet")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class TimeSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Instant entry;
    private Instant exit;
    private Duration workedHours;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
