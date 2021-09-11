package br.com.tinnova.test1.business;

import br.com.tinnova.test1.dto.VoteResponseDTO;

public interface VoteBusiness {
    VoteResponseDTO calculateAllVotePercent();
    VoteResponseDTO calculateValidVotesPercent();
    VoteResponseDTO calculateBlankVotesPercent();
    VoteResponseDTO calculateNullVotesPercent();
}
