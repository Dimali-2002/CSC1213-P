class SmartDevice{
	public void performFunction(){}
}
class LightBulb extends SmartDevice{
	public void performFunction(){
		System.out.println("LightBulb is lighting up.");
	}
}
class Thermostat extends SmartDevice{
	public void performFunction(){
		System.out.println("Thermostat is adjusting temperature.");
	}
}
class SecurityCamera extends SmartDevice{
	public void performFunction(){
		System.out.println("SecurityCamera is monitoring home.");
	}
}

class MainClass1{
	public static void main(String[] args){
		SmartDevice myLightBulb = new LightBulb();
		SmartDevice myThermostat = new Thermostat();
		SmartDevice mySecurityCamera = new SecurityCamera();
		
		myLightBulb.performFunction();
		myThermostat.performFunction();
		mySecurityCamera.performFunction();
	}
}