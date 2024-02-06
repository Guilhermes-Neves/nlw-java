package com.rocketseat.certification_nlw.modules.students.services;

import com.rocketseat.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationService {

    public boolean execute(VerifyIfHasCertificationDTO dto) {
        if (dto.getEmail().equals("guilherme.neves@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }

}
