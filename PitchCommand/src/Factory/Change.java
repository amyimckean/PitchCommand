package Factory;

import Main.*;

public class Change extends Pitch {

	public void ThrowPitch() {
		speed = 75;
		pitch = PitchType.Change;
		pitched = true;
		PitchCounter.getInstance().AddToPitchCount(pitch);
	}
}