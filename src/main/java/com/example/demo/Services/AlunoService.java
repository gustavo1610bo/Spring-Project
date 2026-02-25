package com.example.demo.Services;

import com.example.demo.Models.AlunoModel;
import com.example.demo.Repositories.AlunoRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepositorie alunoRepositorie;

    public AlunoModel criarAluno(AlunoModel alunoModel){
        return alunoRepositorie.save(alunoModel);
    }

    public List<AlunoModel>buscarTodosAlunos(){
        return alunoRepositorie.findAll();
    }

    public void deletarAluno(Long id){
        alunoRepositorie.deleteById(id);
    }
}
