package com.onurdagdelenn.repository;

import com.onurdagdelenn.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface KullaniciRepository extends MongoRepository <Kullanici, String> {

}
