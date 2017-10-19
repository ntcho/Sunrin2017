
public class Television {
	int channel;
	int volume;
	boolean isOn;
	
	public Television(int channel, int volume, boolean isOn) {
		this.channel = channel;
		this.volume = volume;
		this.isOn = isOn;
	}
	
	public Television() {
		
	}
	
	public void printTvStatus() {
		print("Channel : " + channel);
		print("Volume : " + volume);
		print("Is tv on : " + isOn);
	}
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
	
	// shortcut key : no fuken shortcut
	// use intellij guys plz
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
}
