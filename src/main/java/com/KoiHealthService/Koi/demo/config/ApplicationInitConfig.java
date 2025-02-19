package com.KoiHealthService.Koi.demo.config;


import com.KoiHealthService.Koi.demo.entity.User;
import com.KoiHealthService.Koi.demo.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@Slf4j
public class ApplicationInitConfig {


    final PasswordEncoder passwordEncoder;

    @Bean
    ApplicationRunner applicationRunner(UserRepository userRepository){
        return args -> {
           if(userRepository.findByUsername("admin").isEmpty()){
               User user = User.builder()
                       .username("admin")
                       .password(passwordEncoder.encode("12345"))
                       .roles("ADMIN")
                       .build();
               userRepository.save(user);
               log.warn("default user has been with default password : 12345");
           }
        };
    }
}
