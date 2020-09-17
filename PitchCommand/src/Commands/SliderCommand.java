package Commands;

import Main.*;
import Factory.*;

public class SliderCommand implements iCommand{
	public Pitch pitch;
	
	public SliderCommand() {
		this.pitch = PitchFactory.getInstance().getPitch(PitchType.Slider);
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
