package br.com.tinnova.test1.business.businessImpl;

import br.com.tinnova.test1.business.VoteBusiness;
import br.com.tinnova.test1.dto.VoteDTO;
import br.com.tinnova.test1.dto.VoteResponseDTO;
import br.com.tinnova.test1.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class VoteBusinessImpl implements VoteBusiness {

    @Autowired @Lazy
    VoteRepository repository;

    public VoteResponseDTO calculateAllVotePercent() {
       VoteDTO voteDTO = getSumVotes();
       if (voteDTO == null) {
           return new VoteResponseDTO();
       }
       return VoteResponseDTO.builder()
               .validVotesPercent(voteDTO.getValidVotes().doubleValue()/voteDTO.getTotalVoters())
               .blankVotesPercent(voteDTO.getBlankVotes().doubleValue()/voteDTO.getTotalVoters())
               .nullVotesPercent(voteDTO.getNullVotes().doubleValue()/voteDTO.getTotalVoters())
               .build();
    }

    public VoteResponseDTO calculateValidVotesPercent() {
        VoteResponseDTO responseDTO = calculateAllVotePercent();
        if (responseDTO == null) {
            return null;
        }

        return VoteResponseDTO.builder()
                .validVotesPercent(responseDTO.getValidVotesPercent())
                .build();
    }

    public VoteResponseDTO calculateBlankVotesPercent() {
        VoteResponseDTO responseDTO = calculateAllVotePercent();
        if (responseDTO == null) {
            return null;
        }

        return VoteResponseDTO.builder()
                .blankVotesPercent(responseDTO.getBlankVotesPercent())
                .build();
    }

    public VoteResponseDTO calculateNullVotesPercent() {
        VoteResponseDTO responseDTO = calculateAllVotePercent();
        if (responseDTO == null) {
            return null;
        }

        return VoteResponseDTO.builder()
                .nullVotesPercent(responseDTO.getNullVotesPercent())
                .build();
    }

    public VoteDTO getSumVotes() {
        return repository.selectSum();
    }

}
