package com.spring.jpa.repository;

import com.spring.jpa.model.UserInfo;
import com.spring.jpa.repository.service.MyJpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends MyJpaRepository, CrudRepository<UserInfo,Long>, JpaRepository<UserInfo,Long> {
}
