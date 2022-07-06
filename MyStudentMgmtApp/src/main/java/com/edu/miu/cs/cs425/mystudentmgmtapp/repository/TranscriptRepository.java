package com.edu.miu.cs.cs425.mystudentmgmtapp.repository;

import com.edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranscriptRepository extends JpaRepository<Transcript,Long> {
}
