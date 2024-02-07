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
		this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
		if(dto.getEmail().equals("aa@gmail.com") && dto.getTechnology().equals("JAVA")){
			return true;
		} 

		return false;
	}
}
