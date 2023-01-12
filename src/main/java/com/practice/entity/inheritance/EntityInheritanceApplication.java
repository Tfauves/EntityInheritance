package com.practice.entity.inheritance;

import com.practice.entity.inheritance.model.AdminProfile;
import com.practice.entity.inheritance.model.Profile;
import com.practice.entity.inheritance.model.ProfileType;
import com.practice.entity.inheritance.model.PublicProfile;
import com.practice.entity.inheritance.repository.AdminProfileRepository;
import com.practice.entity.inheritance.repository.ProfileRepository;
import com.practice.entity.inheritance.repository.PublicProfileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EntityInheritanceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(EntityInheritanceApplication.class, args);

		ProfileRepository publicProfileRepository =
				configurableApplicationContext.getBean(PublicProfileRepository.class);

		ProfileRepository adminProfileRepository =
				configurableApplicationContext.getBean(AdminProfileRepository.class);

		Profile publicProfile =
				new PublicProfile(ProfileType.PUBLIC, "newUser", "user@mail.com", "02619", 0 );

		Profile adminProfile =
				new AdminProfile(ProfileType.ADMIN, "admin", "admin@mail.com", "02780", "taunton");

		publicProfileRepository.save(publicProfile);
		adminProfileRepository.save(adminProfile);

		publicProfileRepository.delete(publicProfile);

	}




}
