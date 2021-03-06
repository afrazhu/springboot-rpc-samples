package com.github.tonydeng.demo.rpc.swift.producer;


import com.github.tonydeng.demo.rpc.swift.facade.User;
import com.github.tonydeng.demo.rpc.swift.facade.UserService;
import org.apache.thrift.TException;
import org.springframework.stereotype.Service;


@Service("userServiceProducer")
public class UserServiceProducer implements UserService {

    @Override
    public User getUser(int id) throws TException {
        User user = new User();
        user.setId(id);
        user.setAge(18);
        user.setName("bomb");
        return user;
    }
}
