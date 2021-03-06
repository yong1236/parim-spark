package net.parim.system.repository;

import java.util.List;

import net.parim.common.persistence.CurdRepository;
import net.parim.common.persistence.annotation.MyBatisRepository;
import net.parim.system.entity.User;
import net.parim.system.entity.UserRole;

@MyBatisRepository
public interface UserRoleRepository extends CurdRepository<UserRole>{

	public List<UserRole> findAllByUser(User user);
}
