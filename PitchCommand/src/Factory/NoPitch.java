package Factory;

import Main.*;

public class NoPitch extends Pitch {

	public void ThrowPitch() {
		speed = 0;
		pitch = PitchType.None;
		pitched = true;
		PitchCounter.getInstance().AddToPitchCount(pitch);
	}

}
