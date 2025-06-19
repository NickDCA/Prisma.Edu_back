package br.com.nicolasdca.prisma_edu.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;
    private String text;
    private Boolean isCorrect;
    @OneToMany(mappedBy = "chosenItem")
    private List<Answer> chosenAsAnswer;


}
