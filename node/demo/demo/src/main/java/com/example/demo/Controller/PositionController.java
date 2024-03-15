package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.enums.Direction;
import com.example.demo.model.Position;

@RestController
@RequestMapping("v1")
public class PositionController {
	
	@Autowired
	private Direction direction;
	
	@Autowired
	private Position position;
	
	@GetMapping("/get/{commands}")
	public void move(@PathVariable String[] commands) {
        for (String command : commands) {
            switch (command) {
                case "f":
                    moveForward();
                    break;
               
                default:
                    throw new IllegalArgumentException("Invalid command: " + command);
            }
        }
    }
 
    private void moveForward() {
        switch (direction) {
            case NORTH:
            	position.y++;
                break;
            case EAST:
            	position.x++;
                break;
            case SOUTH:
            	position.y--;
                break;
            case WEST:
            	position.x--;
                break;
        }
    }
 
    
 

}
