package com.ali.dao.impl;

import com.ali.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("save is running...");
    }
}
