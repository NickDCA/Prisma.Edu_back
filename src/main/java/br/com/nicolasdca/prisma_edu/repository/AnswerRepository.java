package br.com.nicolasdca.prisma_edu.repository;

import br.com.nicolasdca.prisma_edu.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
