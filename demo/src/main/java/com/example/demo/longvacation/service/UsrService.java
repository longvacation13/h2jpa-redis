package com.example.demo.longvacation.service;

import com.example.demo.longvacation.dto.Usr;
import com.example.demo.longvacation.repository.UsrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsrService {

        private final UsrRepository usrRepository;

        @Autowired
        public UsrService(UsrRepository usrRepository) {
            this.usrRepository = usrRepository;
        }

        public List<Usr> findAllUsers() {
            return usrRepository.findAll();
        }
}
