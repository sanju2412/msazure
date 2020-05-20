/**
 * 
 */
package balic.nb.mr.bank.details.models;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author User
 *
 */
@Data
@Entity
@Table(name="NB_MR_BANK_DTLS")
//@Access(AccessType.FIELD)
public class NBMRBankDtlsEntity {
	
	@Id 
	@Column(name = "MB_ID")
	private Long mbId;
	@Column(name = "IPPH_ID")
	private Long ipphId;
	@Column(name = "MODE_OF_PAYMENT")
	private String modeOfPayment;
	@Column(name = "IFSC_CODE")
	private String ifscCode;
	@Column(name = "NAME_OF_BANK")
	private String nameOfBank;
	@Column(name = "BRANCH_NAME")
	private String branchName;
	@Column(name = "ACCOUNT_HOLDER_NAME")
	private String accountHolderName;
	@Column(name = "ACCOUNT_NUMBER")
	private String accountNumber;
	@Column(name = "IS_APPLICANT_EIA_ELIGIBLE")
	private String isApplicantEIA;
	@Column(name = "INSURANCE_REPOSITORY")
	private String insuranceRepository;
	@Column(name = "EIA_NUMBER")
	private String eiaNumber;
	@Column(name = "CREATED_BY")
	private String createdBy;
	@Column(name = "CREATED_DATE")
	private Date createdDate;
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

}
