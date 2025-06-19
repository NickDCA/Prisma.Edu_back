package br.com.nicolasdca.prisma_edu.repository;

import br.com.nicolasdca.prisma_edu.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
