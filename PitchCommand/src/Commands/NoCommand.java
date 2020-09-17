package Commands;

import Factory.*;
import Main.*;

public class NoCommand implements iCommand{
	public Pitch pitch;
	
	public NoCommand() {
		this.pitch = PitchFactory.getInstance().getPitch(PitchType.None);
	}
	
	public void execute() {
		pitch.ThrowPitch();
	}

	public void undo() {
		PitchCounter.getInstance().Undo(pitch.pitch);
	}
	
	public String info() {
		return pitch.GetThrownPitch();
	}
}