package Commands;

import Factory.*;
import Main.*;

public class FastCommand implements iCommand{
	public Pitch pitch;
	
	public FastCommand() {
		this.pitch = PitchFactory.getInstance().getPitch(PitchType.Fastball);
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
