package Tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;

import Commands.*;
import Main.*;


public class CatcherControlTests {

	@Test
	public void TestThrowFastball() {
		RunTests(0, "Fast");
	}

	@Test
	public void TestThrowSlider() {
		RunTests(2, "Slider");
	}

	@Test
	public void TestThrowCurve() {
		RunTests(3, "Curve");
	}

	@Test
	public void TestThrowChange() {
		RunTests(1, "Change");
	}
	
	public void RunTests(int button, String pitch) {
		PitchCounter.getInstance().Reset();
		CatcherControl control = loadControls();
		control.callPitch(button);
		
		Assert.assertTrue(control.infoPitch().contains(pitch));
		Assert.assertEquals(1, PitchCounter.getInstance().GetPitchCount());
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
