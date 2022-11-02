package com.nissan.repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.AssetDefinition;

@Repository
public interface IAssetDefinitionRepo extends JpaRepositoryImplementation<AssetDefinition, Integer> {
	
	@Modifying
	@Query("update AssetDefinition ad set ad.isActive=false where ad.assetDefinitionId=?1")
	public void disableById(int assetDefinitionId);
}
