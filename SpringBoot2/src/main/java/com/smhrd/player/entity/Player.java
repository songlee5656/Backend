package com.smhrd.player.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // getter, setter 
@AllArgsConstructor  // 모든 필드값을 가진 생성자
@NoArgsConstructor  // 기본 생성자 (필드값X)
public class Player {

	private String name;
	private String position;
	private int age;
	private int height;
	private int weight;
	private String team;
	private String imgSrc;
}
