package br.com.nicolasdca.prisma_edu.repository;

import br.com.nicolasdca.prisma_edu.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
