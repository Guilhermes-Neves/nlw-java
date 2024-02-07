package com.rocketseat.certification_nlw.modules.students.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data //Annotation para Getters e Setters
@AllArgsConstructor //Annotation para o construtor com todos os atributos como argumentos
@NoArgsConstructor //Annotation para o construtor sem nenhum argumento
@Entity(name = "students") // Annotation para definir que essa classe é uma entidade da nossa aplicação
public class StudentEntity {

    @Id // Annotation para definir o primary key no banco
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false) // Annotation para definir o comportamento dessa coluna no banco
    private String email;

    @OneToMany(mappedBy = "studentEntity")
    private List<CertificationStudentEntity> certificationStudentEntity;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
