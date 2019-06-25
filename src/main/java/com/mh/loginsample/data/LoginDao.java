package com.mh.loginsample.data;

import com.mh.loginsample.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends CrudRepository<User,String> {

    User findByUserName(String userName);
}