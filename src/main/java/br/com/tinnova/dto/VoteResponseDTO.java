package br.com.tinnova.dto;

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
