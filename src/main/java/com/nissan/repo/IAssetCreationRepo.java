package com.nissan.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.AssetCreation;

@Repository
public interface IAssetCreationRepo extends CrudRepository<AssetCreation, Integer> {

}
