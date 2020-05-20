/**
 * 
 */
package balic.nb.mr.bank.details.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import balic.nb.mr.bank.details.models.NBMRBankDtlsEntity;

/**
 * @author User
 *
 */
@Repository
public interface NBMRBankDtlsRepository extends JpaRepository<NBMRBankDtlsEntity, Long> {

	@Query(value = "select p from NBMRBankDtlsEntity p WHERE p.ipphId = :ipphId")
	//@Query(value = "select * from  NB_MR_BANK_DTLS a WHERE a.IPPH_ID = :ipphId",nativeQuery = true)
	Optional<NBMRBankDtlsEntity> findByIPPHId(@Param("ipphId") Long ipphId);

}
