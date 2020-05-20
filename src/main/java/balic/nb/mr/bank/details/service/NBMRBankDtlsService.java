/**
 * 
 */
package balic.nb.mr.bank.details.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import balic.nb.mr.bank.details.exception.NBMRBankException;
import balic.nb.mr.bank.details.models.NBMRBankDtlsEntity;
import balic.nb.mr.bank.details.repository.NBMRBankDtlsRepository;

/**
 * @author User
 *
 */
@Service
public class NBMRBankDtlsService {
	
	 @Autowired
	 private  NBMRBankDtlsRepository nbMrRepository;
	 
	 public NBMRBankDtlsEntity createOrUpdateEmployee(NBMRBankDtlsEntity nbmrDtls) 
	 
	 
	    {
	        Optional<NBMRBankDtlsEntity> nbMrEntity = nbMrRepository.findById(nbmrDtls.getMbId());
	        if(!nbMrEntity.isPresent()) 
	        {
	        	NBMRBankDtlsEntity nbMrBankDtlsEntity = new NBMRBankDtlsEntity();
	        	nbMrBankDtlsEntity.setMbId(123L);
	        	nbMrBankDtlsEntity.setIpphId(345L);
	        	nbMrBankDtlsEntity.setModeOfPayment("Online");
	        	nbMrBankDtlsEntity.setNameOfBank("ICICI");
	        	nbMrBankDtlsEntity.setAccountNumber("60123456");
	        	nbMrBankDtlsEntity.setAccountHolderName("Sanjeev patel");
	        	nbMrBankDtlsEntity.setBranchName("WAKAD");
	        	nbMrBankDtlsEntity.setIfscCode("ICICI6014");
	        	nbMrBankDtlsEntity.setInsuranceRepository("Insurance Repo");
	        	nbMrBankDtlsEntity.setIsApplicantEIA("True");
	        	nbMrBankDtlsEntity.setCreatedBy("Sanju");
	        	nbMrBankDtlsEntity.setCreatedDate(new Date());
	        	nbMrBankDtlsEntity.setEiaNumber("E101");
	        	nbMrBankDtlsEntity.setUpdatedBy("Sanju");
	        	nbMrBankDtlsEntity.setUpdatedDate(new Date());
	        	nbMrBankDtlsEntity = nbMrRepository.save(nbMrBankDtlsEntity);
	             
	            return nbMrBankDtlsEntity;
	        } else {
	        	//ErrorDetails.builder().errorCode(HttpStatus.NOT_FOUND.toString()).description("Requested Data Not Found").build();
	        	throw new NBMRBankException("Requested Data Not Found");
				/*
				 * System.out.println("Already Present"); Optional<NBMRBankDtlsEntity>
				 * bankDetails = nbMrRepository.findByIPPHId(nbmrDtls.getIpphId()); return
				 * nbMrEntity.get();
				 */
	        }
	    } 

}
