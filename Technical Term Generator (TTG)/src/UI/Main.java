package UI;

import java.io.BufferedWriter;
import java.io.FileWriter;

import Generator.Generator;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	
	
	
	static Generator g = new Generator();
	static FileWriter fw;// = new FileWriter("C:\\Users\\Jackson\\Desktop\\TTGOutput.txt");
	static BufferedWriter b;
	
	public static void main(String[] args) {
		
		
		
		try {
			fw = new FileWriter("C:\\Users\\Jackson\\Desktop\\TTGOutput.txt");
			b = new BufferedWriter(fw);
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
	launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		
	}

}
