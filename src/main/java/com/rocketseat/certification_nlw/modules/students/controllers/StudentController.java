package com.rocketseat.certification_nlw.modules.students.controllers;

import com.rocketseat.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import com.rocketseat.certification_nlw.modules.students.services.VerifyIfHasCertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationService verifyIfHasCertificationService;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO verifyIfHasCertificationDTO) {
        var result = this.verifyIfHasCertificationService.execute(verifyIfHasCertificationDTO);
        if (result) {
            return "Usuário já fez a prova";
        }
        return "Usuário pode fazer a prova";
    }
}
