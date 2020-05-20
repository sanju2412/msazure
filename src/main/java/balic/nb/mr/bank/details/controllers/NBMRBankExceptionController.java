/**
 * 
 */
package balic.nb.mr.bank.details.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import balic.nb.mr.bank.details.exception.NBMRBankException;
import balic.nb.mr.bank.details.models.ErrorDetails;

/**
 * @author Sanju
 *
 */
@ControllerAdvice
public class NBMRBankExceptionController {
	
	@ExceptionHandler(value = NBMRBankException.class)
	   public ResponseEntity<ErrorDetails> exception(NBMRBankException ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
	      return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	   }

}
