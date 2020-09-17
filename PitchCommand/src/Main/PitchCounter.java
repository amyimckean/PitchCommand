package Main;

import java.util.ArrayList;

public class PitchCounter {
	private static PitchCounter counter;
	ArrayList<PitchType> pitches = new ArrayList<PitchType>();
	
	private PitchCounter() { }
	
	public static PitchCounter getInstance() {
		if(counter == null) {
			counter = new PitchCounter();
		}
		return counter;
	}
	
	public void AddToPitchCount(PitchType pitch) {
		pitches.add(pitch);
	}
	
	public int GetPitchCount() {
		return pitches.size();
	}
	
	public void Reset() {
		pitches = new ArrayList<PitchType>();
	}
	
	public void Undo(PitchType type) {
		int index = pitches.lastIndexOf(type);
		if(index >= 0) {
			System.out.println(String.format("Undo last %1$s pitch", type.toString()));
			pitches.remove(index);
		}
		else {
			System.out.println("This pitch cannot be undone anymore");
		}
	}	
}
