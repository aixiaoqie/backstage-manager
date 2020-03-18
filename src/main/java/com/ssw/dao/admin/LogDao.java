package com.ssw.dao.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ssw.entity.admin.Log;

@Repository
public interface LogDao {
	public int add(Log log);

	public List<Log> findList(Map<String, Object> queryMap);

	public int getTotal(Map<String, Object> queryMap);

	public int delete(String ids);
}
