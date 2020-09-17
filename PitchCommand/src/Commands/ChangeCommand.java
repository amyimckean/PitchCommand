package Commands;

import Factory.*;
import Main.*;

public class ChangeCommand implements iCommand {
	public Pitch pitch;
	
	public ChangeCommand() {
		this.pitch = PitchFactory.getInstance().getPitch(PitchType.Change);
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
