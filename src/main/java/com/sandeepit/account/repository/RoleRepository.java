package com.sandeepit.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeepit.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
