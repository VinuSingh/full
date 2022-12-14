package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoomService {
	@Autowired
    private RoomRepository repo;
	
	public Room search(int roomId) {
		return repo.findById(roomId).get();
	}
	public List<Room> showEmploy() {
		return repo.findAll();
	}

}
