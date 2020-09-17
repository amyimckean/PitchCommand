package Factory;

import Main.*;

public class Slider extends Pitch {
	
	public void ThrowPitch() {
		speed = 90;
		pitch = PitchType.Slider;
		pitched = true;
		PitchCounter.getInstance().AddToPitchCount(pitch);
	}
}