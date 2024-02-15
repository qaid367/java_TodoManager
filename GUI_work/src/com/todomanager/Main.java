package com.todomanager;

import java.util.ArrayList;

public class Main {
	public static final int SCREEN_WIDTH = 500;
	public static final int SCREEN_HEIGHT = 500;
	
	public static ArrayList<String> todos = new ArrayList<String>();
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
	
	public static String getTodos() {
		String todosOutput = "";
		for (int i = 0; i < todos.size(); i++) {
			todosOutput += todos.get(i);
		}
		
		return todosOutput;
	}
	
	public static void addTodo(String name) {
		if (name.trim().length() > 4 && name.trim().length() < 20) {
			
		} else {
			// alertMessage("TODO name is too short or too big");
		}
	};
	
	public static void removeTodo(int index) {
		
	};
	
	public static void updateTodo(int index, String name) {
		
	};

}
