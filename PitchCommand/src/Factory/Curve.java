package Factory;

import Main.*;

public class Curve extends Pitch {
	
	public void ThrowPitch() {
		speed = 85;
		pitch = PitchType.Curve;
		pitched = true;
		PitchCounter.getInstance().AddToPitchCount(pitch);
	}
}
