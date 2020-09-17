package Factory;

import java.util.ArrayList;

import Main.Pitch;
import Main.PitchType;

public class PitchFactory {
	private static PitchFactory factory;
	
	private PitchFactory() { }
	
	public static PitchFactory getInstance() {
		if(factory == null) {
			factory = new PitchFactory();
		}
		return factory;
	}

	public Pitch getPitch(PitchType pitch) {
		switch(pitch) {
			case Change:
				return new Change();
			case Curve:
				return new Curve();
			case Fastball:
				return new Fastball();
			case Slider:
				return new Slider();
			default:
				return new NoPitch();
		}
	}
}
