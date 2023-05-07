package com.stick.registraduria.repositories;

import com.stick.registraduria.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository {
    public abstract ArrayList<UserModel> findByDocument(Integer documentPosition);
}
