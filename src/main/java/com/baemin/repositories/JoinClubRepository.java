package com.baemin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.baemin.domain.entity.JoinClub;
import com.baemin.domain.entity.Member;

public interface JoinClubRepository extends JpaRepository<JoinClub, Integer> {
	/*@Query(value = """
		    SELECT 
		        ROW_NUMBER() OVER() AS JO_ID,
		        JC.JO_NAME AS JO_NAME, 
		        JC.JO_CONTACT AS JO_CONTACT, 
		        JC.JO_DEPT AS JO_DEPT,
		        JC.JO_STU_ID AS JO_STU_ID, 
		        JC.JO_GENDER AS JO_GENDER, 
		        GROUP_CONCAT(IV.IV_DATE ORDER BY IV.IV_DATE ASC SEPARATOR ',') AS JO_IV_IDS,
		        GROUP_CONCAT(AD.AD_DATE ORDER BY AD.AD_DATE ASC SEPARATOR ',') AS JO_AD_IDS,
		        MAX(JC.JO_APPR_DATE) AS JO_APPR_DATE,
		        JC.IS_APP AS IS_APP,
		        JC.JO_SKILL AS JO_SKILL,
		        JC.CLUB_NUM_ID AS CLUB_NUM_ID
		    FROM 
		        JOINCLUB JC
		    LEFT JOIN INTERVIEW IV ON FIND_IN_SET(IV.IV_ID, JC.JO_IV_IDS) > 0
		    LEFT JOIN ACTIVITY_DATE AD ON FIND_IN_SET(AD.AD_ID, JC.JO_AD_IDS) > 0
		    GROUP BY
		        JC.JO_NAME, 
		        JC.JO_CONTACT, 
		        JC.JO_DEPT, 
		        JC.JO_STU_ID, 
		        JC.JO_GENDER, 
		        JC.JO_SKILL,
		        JC.IS_APP, 
		        JC.CLUB_NUM_ID
		    """, nativeQuery = true)
		List<JoinClub> findJoinClubInfo();
	
	
	JoinClub findByJoStuId(String stuId);*/
	
	JoinClub findByJoId(long JoId);
	
	List<JoinClub> findByIsApp(boolean isApp); // JoIsApp이 true인 모든 JoinClub 반환

}
