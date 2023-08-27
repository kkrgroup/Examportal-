package org.exam;

import java.util.HashSet;
import java.util.Set;

import org.exam.model.Role;
import org.exam.model.User;
import org.exam.model.UserRole;
import org.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args){
		
		
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
		
		
		/*
		 * User user=new User(); user.setFirstName("Komal");
		 * user.setLastName("Dantkale"); user.setUsername("komal123");
		 * user.setPassword(this.bCryptPasswordEncoder.encode("kkk"));
		 * user.setEmail("k@gmail.com"); user.setProfile("default.png");
		 * 
		 * Role role1=new Role(); role1.setRoleId(44L); role1.setRoleName("ADMIN");
		 * 
		 * Set<UserRole> userRoleSet=new HashSet<>(); UserRole userRole=new UserRole();
		 * userRole.setRole(role1); userRole.setUser(user); userRoleSet.add(userRole);
		 * 
		 * User user1=this.userService.createUser(user, userRoleSet);
		 * System.out.println(user1.getUsername());
		 */
		 
		
	}

}
