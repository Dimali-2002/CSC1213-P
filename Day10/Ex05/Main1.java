class SmartDevice
{
	public void performFunction(){}
}
class LightBulb extends SmartDevice
{
	public void performFunction()
	{
		System.out.println("LightBulb is lighting up.");
	}
}
class Thermostat extends SmartDevice
{
	public void performFunction()
	{
		System.out.println("Thermostat is adjusting temperature.");
	}
}
class SecurityCamera extends SmartDevice
{
	public void performFunction()
	{
		System.out.println("SecurityCamera is monitoring home.");
	}
}
class Main1
{
	public static void main(String args[])
	{
		LightBulb bulb = new LightBulb();
		Thermostat thermo = new Thermostat();
		SecurityCamera camera = new SecurityCamera();
		
		bulb.performFunction();
		thermo.performFunction();
		camera.performFunction();
	}
}