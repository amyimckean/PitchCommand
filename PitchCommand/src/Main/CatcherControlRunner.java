package Main;

import Commands.*;

public class CatcherControlRunner {
	public static void main(String[] args) {
		CatcherControl control = loadControls();
		control.callPitch(1);
		control.infoPitch();
		control.undoPitch();
		control.undoPitch();
		control.callPitch(0);
		control.infoPitch();
		control.callPitch(3);
		control.infoPitch();
		control.callPitch(2);
		control.callPitch(2);
		control.callPitch(2);
		control.infoPitch();
		control.undoPitch();
		control.undoPitch();
		control.undoPitch();
		control.undoPitch();
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
