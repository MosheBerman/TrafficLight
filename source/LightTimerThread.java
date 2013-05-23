/**
 *	@author Moshe Berman
 *	
 *	@description: LightTimerThread drives the automatic animation of the StopLight class.
 *
 */

public class LightTimerThread extends Thread 
{
	
	StopLight stopLight;
	
	public LightTimerThread(StopLight light)
	{
		super();
		stopLight = light;
	}
	
	public void run()
	{
		while(true)
		{
			stopLight.changeColorFromTimer();
		}
	}
}
