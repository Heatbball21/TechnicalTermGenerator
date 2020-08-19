package UI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import Generator.Generator;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main {
	
	
	
	static Generator g = new Generator();
	static FileWriter fw;// = new FileWriter("C:\\Users\\Jackson\\Desktop\\TTGOutput.txt");
	static BufferedWriter b;
	static File f;
	static String userHome;
	
	public static void main(String[] args) {
		//launch(args);
		
		
		try {
			userHome = System.getProperty("user.home") + "\\Desktop";
			System.out.println(userHome);
			f = new File(userHome + "\\TTGOutput.txt");
		}catch(Exception e) {
			
		}
		
		try {
			if(f.isFile()) {
				fw = new FileWriter(userHome + "\\TTGOutput.txt");
				b = new BufferedWriter(fw);
			}else {
				f.createNewFile();
				fw = new FileWriter(userHome + "\\TTGOutput.txt");
				b = new BufferedWriter(fw);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 101; i++) {
			try {
				
				b.write(g.generate());
				b.newLine();
				
				fw.flush();
				b.flush();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
		try {
			fw.close();
			b.close();
		}catch(Exception e) {
			
		}
	

	}

	//@Override
	//public void start(Stage arg0) throws Exception {
		
		
	//}

}
