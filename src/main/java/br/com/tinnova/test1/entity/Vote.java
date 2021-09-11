package br.com.tinnova.test1.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "vote")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vote extends BaseAuditEntity {

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
