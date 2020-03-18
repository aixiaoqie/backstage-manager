package com.ssw.service.impl.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssw.dao.admin.AuthorityDao;
import com.ssw.entity.admin.Authority;
import com.ssw.service.admin.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityDao authorityDao;

	@Override
	public int add(Authority authority) {
		// TODO Auto-generated method stub
		return authorityDao.add(authority);
	}

	@Override
	public int deleteByRoleId(Long roleId) {
		// TODO Auto-generated method stub
		return authorityDao.deleteByRoleId(roleId);
	}

	@Override
	public List<Authority> findListByRoleId(Long roleId) {
		// TODO Auto-generated method stub
		return authorityDao.findListByRoleId(roleId);
	}

}
