package Factory;

import Main.*;

public class Fastball extends Pitch {

	public void ThrowPitch() {
		speed = 95;
		pitch = PitchType.Fastball;
		pitched = true;
		PitchCounter.getInstance().AddToPitchCount(pitch);
	}
}
