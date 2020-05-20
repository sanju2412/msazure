/**
 * 
 */
package balic.nb.mr.bank.details.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import balic.nb.mr.bank.details.exception.NBMRBankException;
import balic.nb.mr.bank.details.models.NBMRBankDtlsEntity;
import balic.nb.mr.bank.details.service.NBMRBankDtlsService;

/**
 * @author User
 *
 */
@RestController
@RequestMapping("/nbmrbankdetails")
public class NBMRBankDtlsController {
	
	@Autowired
	private NBMRBankDtlsService nbmrBankService;
	
	 @PostMapping
	    public ResponseEntity<NBMRBankDtlsEntity> createOrUpdateEmployee(@RequestBody NBMRBankDtlsEntity nbmrBankDtlsEntity) throws NBMRBankException
	                                                    {
		 NBMRBankDtlsEntity updated = nbmrBankService.createOrUpdateEmployee(nbmrBankDtlsEntity);
	        return new ResponseEntity<>(updated, new HttpHeaders(), HttpStatus.OK);
	    }

}
