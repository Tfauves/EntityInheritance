package com.practice.entity.inheritance.repository;

import com.practice.entity.inheritance.model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
