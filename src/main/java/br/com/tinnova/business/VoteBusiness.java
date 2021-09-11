package br.com.tinnova.business;

import br.com.tinnova.dto.VoteResponseDTO;

public interface VoteBusiness {
    VoteResponseDTO calculateAllVotePercent();
    VoteResponseDTO calculateValidVotesPercent();
    VoteResponseDTO calculateBlankVotesPercent();
    VoteResponseDTO calculateNullVotesPercent();
}
