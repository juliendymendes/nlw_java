package com.me.certification_nlw.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import com.me.certification_nlw.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationUseCase {
	@Autowired
	private CertificationStudentRepository certificationStudentRepository;

	public boolean execute(VerifyHasCertificationDTO dto){
		var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
		// já fez a certificação, não pode fazer de novo
		if(!result.isEmpty()){
			return true;
		}

		return false;
	}
}
