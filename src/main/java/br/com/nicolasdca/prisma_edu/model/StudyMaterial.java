//package br.com.nicolasdca.prisma_edu.model;
//
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//@Entity
//@Table(name = "tb_study_materials")
//public class StudyMaterial {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String title;
//    private String filePath;
//    @Enumerated(EnumType.STRING)
//    private Status status;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "teacher_id")
//    private Teacher publisher;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "certifier_id")
//    private Teacher certifier;
//    @Enumerated(EnumType.STRING)
//    private GeneralSubject subject;
//
//}
