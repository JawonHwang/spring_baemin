//package com.baemin.security;
//
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//
//import com.baemin.domain.entity.Member;
//
//public class SecurityUser extends User {
//
//	//따로 요구하는 것을 만들고 싶으면 작성해서 setter, getter를 만든다.
//	private String name;
//	public SecurityUser(Member m) {
//		super(m.getId(), 
//				m.getPassword(),
//				m.getEnabled(),
//				true,true,true,
//				AuthorityUtils.createAuthorityList(m.getRole()));
//	}
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	
//	
//}
