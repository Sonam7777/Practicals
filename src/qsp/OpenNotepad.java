package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class OpenNotepad {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		Runtime.getRuntime().exec("Notepad");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		Thread.sleep(2000);
		
		
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(2000);
		
		
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		
		
		r.keyPress(KeyEvent.VK_P);
		
	}

}
