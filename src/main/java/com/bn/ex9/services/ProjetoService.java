package com.bn.ex9.services;

import com.bn.ex9.models.ProjetoModel;
import com.bn.ex9.repositories.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    private final ProjetoRepository repository;

    public ProjetoService(ProjetoRepository repository) {
        this.repository = repository;
    }

    public ProjetoModel criarProjeto(ProjetoModel projeto) {
        return repository.save(projeto);
    }

    public List<ProjetoModel> findAll() {
        return repository.findAll();
    }

    public ProjetoModel buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletarProjeto(Long id) {
        repository.deleteById(id);
    }
}