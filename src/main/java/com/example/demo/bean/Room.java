package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Room {
	private Integer rommId;
	private String roomName;
	private Integer roomSize;
	
}
