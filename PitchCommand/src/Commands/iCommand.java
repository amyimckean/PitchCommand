package Commands;

public interface iCommand {
	public void execute();
	public void undo();
	public String info();
}
