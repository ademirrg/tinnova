package br.com.tinnova.test1.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VoteResponseDTO {

    private Double validVotesPercent;
    private Double blankVotesPercent;
    private Double nullVotesPercent;

}
