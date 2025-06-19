package br.com.nicolasdca.prisma_edu.repository;

import br.com.nicolasdca.prisma_edu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
