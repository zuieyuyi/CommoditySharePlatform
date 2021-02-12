package com.commodityshareplatform.subject.service;

import com.commodityshareplatform.subject.dao.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    CommentMapper commentMapper;
}
