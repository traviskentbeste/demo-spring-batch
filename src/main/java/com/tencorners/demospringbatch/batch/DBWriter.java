package com.tencorners.demospringbatch.batch;

import com.tencorners.demospringbatch.model.User;
import com.tencorners.demospringbatch.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> list) throws Exception {

        System.out.println("Data saved for users : " + list);

        userRepository.saveAll(list);
    }
}
