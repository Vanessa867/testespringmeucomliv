package com.comlivteste.demo.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MeetingModel{
    @Id
    @GeneratedValue
    private Long id;
    @DateTimeFormat(pattern = "dd/MM")
    private LocalDate dataMeeting;
    private String topic;
}
