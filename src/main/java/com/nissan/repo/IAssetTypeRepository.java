package com.nissan.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.AssetType;

@Repository
public interface IAssetTypeRepository extends CrudRepository<AssetType, Integer> {

}
