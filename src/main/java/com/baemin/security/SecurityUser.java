package com.baemin.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.baemin.domain.entity.Member;

public class SecurityUser extends User {

	//따로 요구하는 것을 만들고 싶으면 작성해서 setter, getter 추가.
	private String name;
	public SecurityUser(Member m) {
		super(m.getMemId(), 
				m.getMemPw(),
				true,true,true,true,
				AuthorityUtils.createAuthorityList(m.getRole()));
	}
	
	public String getMemName() {
		return name;
	}

	public void setMemName(String name) {
		this.name = name;
	}

	
	
}
