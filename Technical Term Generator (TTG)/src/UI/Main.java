package UI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import Generator.Generator;
//import javafx.application.Application;
//import javafx.stage.Stage;

public class Main {
	
	
	//Vars
	static Generator g = new Generator();
	static FileWriter fw;
	static BufferedWriter b;
	static File f;
	static String userHome;
	
	public static void main(String[] args) {
		//launch(args);
		
		
		try {
			//creates a file instance using the users Desktop
			userHome = System.getProperty("user.home") + "\\Desktop";
			System.out.println(userHome);
			f = new File(userHome + "\\TTGOutput.txt");
		}catch(Exception e) {
			
		}
		
		try {
			//is there already a TTGOutput file on the Desktop?
			
			if(f.isFile()) {
				//yes, create writers
				fw = new FileWriter(userHome + "\\TTGOutput.txt");
				b = new BufferedWriter(fw);
			}else {
				//no, create file and writers
				f.createNewFile();
				fw = new FileWriter(userHome + "\\TTGOutput.txt");
				b = new BufferedWriter(fw);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		//loop through the generation of terms
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
