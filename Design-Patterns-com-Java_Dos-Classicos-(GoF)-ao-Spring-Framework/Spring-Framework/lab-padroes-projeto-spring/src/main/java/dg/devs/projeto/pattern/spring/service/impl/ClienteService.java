package main.java.dg.devs.projeto.pattern.spring.service.impl;

import main.java.dg.devs.projeto.pattern.spring.model.Cliente;

public interface ClienteService {

  Iterable<Cliente> buscarTodos();

  Cliente buscarPorId(Long id);

  void inserir(Cliente cliente);

  void atualizar(Long id, Cliente cliente);

  void deletar(Long id);

}