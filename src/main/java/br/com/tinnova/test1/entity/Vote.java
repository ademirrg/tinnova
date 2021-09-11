package br.com.tinnova.test1.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "vote")
@Data
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "total_voters")
    private Long totalVoters;

    @Column(name = "valid_votes")
    private Long validVotes;

    @Column(name = "blank_votes")
    private Long blankVotes;

    @Column(name = "null_votes")
    private Long nullVotes;
}
