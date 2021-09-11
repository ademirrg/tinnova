package br.com.tinnova.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VoteDTO {

    private Long totalVoters;
    private Long validVotes;
    private Long blankVotes;
    private Long nullVotes;
}
