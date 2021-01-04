package io.github.alexmartinssi.clientes.model.repository;

import io.github.alexmartinssi.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
