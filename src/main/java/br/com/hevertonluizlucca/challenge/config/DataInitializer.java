package br.com.hevertonluizlucca.challenge.config;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.hevertonluizlucca.challenge.entity.User;
import br.com.hevertonluizlucca.challenge.repository.UserRepository;
import br.com.hevertonluizlucca.challenge.utils.StringUtils;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		List<User> users = userRepository.findAll();
		if (users == null || users.isEmpty()) {

			users.add(new User(null, "heverton.lucca", StringUtils.encoder("hk200402"), true, new Date(),
					"Héverton Luiz", "Lucca", "heverton.lucca@gmail.com", "55 48 98401-5661"));
			users.add(new User(null, "kelly.adam", StringUtils.encoder("senha001"), true, new Date(), "Kelly", "Adam",
					"kelly@gmail.com", "55 48 00000-0000"));
			users.add(new User(null, "alberto.saulo", StringUtils.encoder("senha002"), true, new Date(), "Alberto",
					"Saulo", "alberto@gmail.com", "55 48 00000-0000"));
			users.add(new User(null, "bruno.luiz", StringUtils.encoder("senha003"), true, new Date(), "Bruno", "Luiz",
					"bruno@gmail.com", "55 48 00000-0000"));

			for (int i = 0; i < 20; i++) {
				users.add(new User(null, "usuario" + i, StringUtils.encoder("senha000" + i), true, new Date(),
						"Usuario" + i, "Sobrenome" + i, "usuario" + i + "@gmail.com", "55 48 00000-0000"));
			}

			userRepository.saveAll(users);
			
		}
	}
}
