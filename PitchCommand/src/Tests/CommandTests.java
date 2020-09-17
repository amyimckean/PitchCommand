package Tests;

import org.junit.*;

import Commands.*;

public class CommandTests {
	
	@Test
	public void ChangeCommandTests() {
		ChangeCommand command = new ChangeCommand();
		Assert.assertFalse(command.pitch.pitched);
		Assert.assertEquals(0, command.pitch.speed);
		command.execute();
		Assert.assertTrue(command.pitch.pitched);
		Assert.assertEquals(75, command.pitch.speed);
	}
	
	@Test
	public void SliderCommandTests() {
		SliderCommand command = new SliderCommand();
		Assert.assertFalse(command.pitch.pitched);
		Assert.assertEquals(0, command.pitch.speed);
		command.execute();
		Assert.assertTrue(command.pitch.pitched);
		Assert.assertEquals(90, command.pitch.speed);
	}
	
	@Test
	public void FastballCommandTests() {
		FastCommand command = new FastCommand();
		Assert.assertFalse(command.pitch.pitched);
		Assert.assertEquals(0, command.pitch.speed);
		command.execute();
		Assert.assertTrue(command.pitch.pitched);
		Assert.assertEquals(95, command.pitch.speed);
	}


}
