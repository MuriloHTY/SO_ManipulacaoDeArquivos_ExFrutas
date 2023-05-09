package view;

import java.io.IOException;

import controller.ControllerFiles;

public class Main {

	public static void main(String[] args) {

		ControllerFiles aC = new ControllerFiles();

		String path = "C:\\temp";
		String nome = "generic_food.csv";

		try {
			aC.lerFrutas(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}