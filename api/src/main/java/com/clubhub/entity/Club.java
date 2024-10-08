package com.clubhub.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "club_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "clubs")
    private List<Union> unions;

    @Column(nullable = false)
    private String address;

    @OneToMany(mappedBy = "club")
    @JsonIgnore
    private List<ClubRequests> clubRequests;

    @OneToMany(mappedBy = "club")
    @JsonIgnore
    private List<ClubMembers> clubMembers;

    // Club Badge Design

    // Players

    // Grades

    // Est Date

    // Badge

    // Mascot

}
