package Main;

import java.util.ArrayList;

import Commands.*;

public class CatcherControl {
	iCommand[] pitchCommands;
	iCommand undo = new NoCommand();
	iCommand info = new NoCommand();
	ArrayList<Integer> commandList = new ArrayList();
	
	public CatcherControl() {
		pitchCommands = new iCommand[4];
		for(int i = 0; i > pitchCommands.length; ++i) {
			pitchCommands[i] = new NoCommand();
		}
	}
	
	public void callPitch(int pitch) {
		commandList.add(pitch);
		if(pitchCommands[pitch]!= null) {
			pitchCommands[pitch].execute();
			undo = pitchCommands[pitch];
			info = pitchCommands[pitch];
		}
	}
	
	public void setCommand(int index, iCommand pitch) {
		pitchCommands[index] = pitch;
	} 
	
	public void undoPitch() {
		undo.undo();
	}
	
	public String infoPitch() {
		System.out.println(info.info());
		return info.info();
	}
}
