package com.fiap.tc.gerenciamentopedidos.infra.repository;

import com.fiap.tc.gerenciamentopedidos.infra.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity,Long> {

}
