package br.com.nicolasdca.prisma_edu.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    private enum UserType {
        TEACHER,
        STUDENT
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "CPF is mandatory")
    @Column(unique = true, updatable = false, nullable = false)
    private String cpf;
    @NotBlank(message = "Name is mandatory")
    @Column(nullable = false)
    private String nome;
    @NotBlank(message = "Email is mandatory")
    @Column(unique = true, nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    private UserType userType;
    @Column(nullable = false)
    private String hashedPassword;

}
