package br.com.tinnova.test1.repository;

import br.com.tinnova.test1.dto.VoteDTO;
import br.com.tinnova.test1.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

    @Query(" SELECT NEW br.com.tinnova.test1.dto.VoteDTO ( " +
            " SUM(vote.totalVoters) as totalVoters, " +
            " SUM(vote.validVotes) as validVotes, " +
            " SUM(vote.blankVotes) as blankVotes, " +
            " SUM(vote.nullVotes) as nullVotes ) " +
            " FROM Vote vote ")
    VoteDTO selectSum();
}
