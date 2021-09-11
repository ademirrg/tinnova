package br.com.tinnova.test1.controller;

import br.com.tinnova.test1.business.VoteBusiness;
import br.com.tinnova.test1.dto.VoteResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-1/vote")
public class VoteController {

    @Autowired @Lazy
    VoteBusiness business;

    @GetMapping("/percent/all")
    private ResponseEntity<VoteResponseDTO> getAllVotesPercent() {
        VoteResponseDTO responseDTO = business.calculateAllVotePercent();
        if (responseDTO == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/percent/valid-votes")
    private ResponseEntity<VoteResponseDTO> getValidVotesPercent() {
        VoteResponseDTO responseDTO = business.calculateValidVotesPercent();
        if (responseDTO == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/percent/blank-votes")
    private ResponseEntity<VoteResponseDTO> getBlankVotesPercent() {
        VoteResponseDTO responseDTO = business.calculateBlankVotesPercent();
        if (responseDTO == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/percent/null-votes")
    private ResponseEntity<VoteResponseDTO> getNullVotesPercent() {
        VoteResponseDTO responseDTO = business.calculateNullVotesPercent();
        if (responseDTO == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(responseDTO);
    }
}
