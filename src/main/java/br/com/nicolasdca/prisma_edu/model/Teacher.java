package br.com.nicolasdca.prisma_edu.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "tb_teachers")
public class Teacher extends User{

    @Column(nullable = false)
    private Boolean isCertifier;
    @OneToMany(
            mappedBy = "publisher", // "creator" é o nome do CAMPO na classe MaterialEstudo
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Question> publishedQuestions;
    @OneToMany(
            mappedBy = "certifier", // "creator" é o nome do CAMPO na classe MaterialEstudo
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Question> certifiedQuestions;

//    @OneToMany(
//            mappedBy = "publisher", // "creator" é o nome do CAMPO na classe MaterialEstudo
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private List<StudyMaterial> publishedStudyMaterials;
//    @OneToMany(
//            mappedBy = "certifier", // "creator" é o nome do CAMPO na classe MaterialEstudo
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private List<StudyMaterial> certifiedStudyMaterials;

}
