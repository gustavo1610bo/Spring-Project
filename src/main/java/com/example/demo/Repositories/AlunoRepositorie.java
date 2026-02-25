package com.example.demo.Repositories;

import com.example.demo.Models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorie extends JpaRepository<AlunoModel, Long> {

}
