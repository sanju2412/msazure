/**
 * 
 */
package balic.nb.mr.bank.details;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import balic.nb.mr.bank.details.models.ErrorDetails;

/**
 * @author User
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<ErrorDetails>errorDetailsList = new ArrayList<>();
		List<ErrorDetails>changeDetailsList = new ArrayList<>();
		/*
		 * ErrorDetails errorDetails1 = new ErrorDetails();
		 * errorDetails1.setDetails("ABC"); errorDetails1.setMessage("Text");
		 * errorDetails1.setTimestamp(java.sql.Timestamp.valueOf("2020-05-15 10:10:10.0"
		 * )); ErrorDetails errorDetails2 = new ErrorDetails();
		 * errorDetails2.setDetails("ABC"); errorDetails2.setMessage("Email");
		 * errorDetails2.setTimestamp(java.sql.Timestamp.valueOf("2020-05-11 10:10:10.0"
		 * )); ErrorDetails errorDetails3 = new ErrorDetails();
		 * errorDetails3.setDetails("ABC"); errorDetails3.setMessage("Phone");
		 * errorDetails3.setTimestamp(java.sql.Timestamp.valueOf("2020-05-19 10:10:10.0"
		 * )); errorDetailsList.add(errorDetails1); errorDetailsList.add(errorDetails2);
		 * errorDetailsList.add(errorDetails3);
		 */
		
		ErrorDetails errorDetails4 = new ErrorDetails();
		errorDetails4.setDetails("2020-05-15 10:10:10.0");
		errorDetails4.setMessage("Phone");
		errorDetails4.setTimestamp(java.sql.Timestamp.valueOf("2020-05-19 10:10:10.0"));
		errorDetailsList.add(errorDetails4);
		ErrorDetails errorDetails5 = new ErrorDetails();
		errorDetails5.setDetails("2020-05-19 10:10:10.0");
		errorDetails5.setMessage("Phone");
		errorDetails5.setTimestamp(java.sql.Timestamp.valueOf("2020-05-19 10:10:10.0"));
		errorDetailsList.add(errorDetails5);
		ErrorDetails errorDetails6 = new ErrorDetails();
		errorDetails6.setDetails("2020-05-19 10:10:10.0");
		errorDetails6.setMessage("Phone");
		errorDetails6.setTimestamp(java.sql.Timestamp.valueOf("2020-05-19 10:10:10.0"));
		errorDetailsList.add(errorDetails6);
		Date currentDate, oneYearBefore;   // assume these are set to something
		
		currentDate= new Date(); 
		System.out.println(currentDate);
		long milliseconds = (long) 365 * 24 * 60 * 60 * 1000;
        oneYearBefore = new Date(currentDate.getTime() - milliseconds);
        System.out.println(oneYearBefore);
		
        //Add in property file (comm.system.change.hist.years=1)
        long changeHistForYears =1;
        LocalDate localDateCurrent = LocalDate.now();
        LocalDate localDatePrev1Year = LocalDate.now().minusYears(changeHistForYears);
        for (ErrorDetails errorDetails : errorDetailsList) {
        	if(Objects.nonNull(errorDetails.getDetails())) {
        		LocalDate convertedTimestamp = Timestamp.valueOf(errorDetails.getDetails()).toLocalDateTime().toLocalDate();
        		System.out.println("Converted Date : "+ convertedTimestamp);
        		 if(convertedTimestamp.isAfter(localDatePrev1Year) && convertedTimestamp.isBefore(localDateCurrent)) {
   				  changeDetailsList.add(errorDetails) ;
   			  }
        	}
			 
		  
		  }
		 
System.out.println("Final Sorted List :" + changeDetailsList);
		
	}
}
