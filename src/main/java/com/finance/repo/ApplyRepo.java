package com.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.entity.Apply;

public interface ApplyRepo extends JpaRepository<Apply, Integer> {

}
