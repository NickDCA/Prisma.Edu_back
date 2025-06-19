package br.com.nicolasdca.prisma_edu.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String header;
    @OneToMany(
            mappedBy = "question",
            orphanRemoval = true,
            cascade = CascadeType.ALL
    )
    private List<Item> items;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher publisher;
    @ManyToOne
    @JoinColumn(name = "certifier_id")
    private Teacher certifier;
    @Enumerated(EnumType.STRING)
    private GeneralSubject subject;
    @OneToMany(mappedBy = "question")
    private List<Answer> testInstances;

}
