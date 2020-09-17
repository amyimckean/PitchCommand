package Commands;

import Factory.*;
import Main.*;

public class CurveCommand implements iCommand {
	public Pitch pitch;
	
	public CurveCommand() {
		this.pitch = PitchFactory.getInstance().getPitch(PitchType.Curve);
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

