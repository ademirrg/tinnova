package br.com.tinnova.controller;

import br.com.tinnova.business.VoteBusiness;
import br.com.tinnova.dto.VoteResponseDTO;
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
    VoteBusiness voteBusiness;

    @GetMapping("/percent/all")
    private ResponseEntity<VoteResponseDTO> getAllVotesPercent() {
        VoteResponseDTO responseDTO = voteBusiness.calculateAllVotePercent();
        if (responseDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/percent/valid-votes")
    private ResponseEntity<VoteResponseDTO> getValidVotesPercent() {
        VoteResponseDTO responseDTO = voteBusiness.calculateValidVotesPercent();
        if (responseDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/percent/blank-votes")
    private ResponseEntity<VoteResponseDTO> getBlankVotesPercent() {
        VoteResponseDTO responseDTO = voteBusiness.calculateBlankVotesPercent();
        if (responseDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping("/percent/null-votes")
    private ResponseEntity<VoteResponseDTO> getNullVotesPercent() {
        VoteResponseDTO responseDTO = voteBusiness.calculateNullVotesPercent();
        if (responseDTO == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(responseDTO);
    }
}
