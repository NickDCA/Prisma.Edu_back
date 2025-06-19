package br.com.nicolasdca.prisma_edu.repository;

import br.com.nicolasdca.prisma_edu.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
