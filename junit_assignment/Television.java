
public class Television {
	public boolean state;
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int volume;
	public int channel;
		
	
	
	
	public boolean checkState(){

		return state;

	}
	
	public int currentChannel()
	{
		if(state==true)
		{
		 channel=channel;
		}
		return channel;
	}
	public int currentVolume()
	{
		if(state==true)
		{
		 volume=volume;
		}
		return volume;
	}
	public int channelIncrement()
	{
		if(state==true && channel>=0)
		{
			channel=channel+1;			
		}
			return channel;
	}
	public int channelDecrement()
	{
		if(state==true && channel>=0)
		{
			channel=channel-1;			
		}
			return channel;
	}
	public int volumeIncrement()
	{
		if(channel>=0 && volume>=1)
		{
		volume=volume+1;
	}
		return volume;
	}
	public int volumeDecrement()
	{
		if(channel>=0 && volume>=1)
		{
		volume=volume-1;
	}
		return volume;
	}
	public boolean changeState(){

		if(state==true){

			return false;

		}

		return state;

	}
	
	
	
}

