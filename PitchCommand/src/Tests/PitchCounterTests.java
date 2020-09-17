package Tests;

import org.junit.*;

import Commands.*;
import Main.*;

public class PitchCounterTests {
	
	@Test
	public void TestPitchCounterCount10() {
		PitchCounter.getInstance().Reset();
		CatcherControl control = loadControls();
		for(int i = 0; i < 10; ++i) {
			control.callPitch(1);
		}
		Assert.assertEquals(10, PitchCounter.getInstance().GetPitchCount());
	}
	
	@Test
	public void TestPitchCounterCount5() {
		PitchCounter.getInstance().Reset();
		CatcherControl control = loadControls();
		for(int i = 0; i < 4; ++i) {
			control.callPitch(i);
		}
		Assert.assertEquals(4, PitchCounter.getInstance().GetPitchCount());
	}
	
	
	@Test
	public void TestPitchCounterCount10Undo() {
		PitchCounter.getInstance().Reset();
		CatcherControl control = loadControls();
		for(int i = 0; i < 10; ++i) {
			control.callPitch(1);
		}
		for(int i = 0; i < 10; ++i) {
			control.undoPitch();
		}
		Assert.assertEquals(0, PitchCounter.getInstance().GetPitchCount());
	}
	
	public static CatcherControl loadControls() {
		CatcherControl control = new CatcherControl();
		control.setCommand(0, new FastCommand());
		control.setCommand(1, new ChangeCommand());
		control.setCommand(2, new SliderCommand());
		control.setCommand(3, new CurveCommand());
		return control;
	}
}
