package workbook;
//况农合 60率
public class Otab extends Mobile{
	public Otab() {
		
	}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType);
	}
	
	public int operate(int time) {
		int result = getBatterySize();
		result = getBatterySize()-(time*12);
		setBatterySize(result);
		return getBatterySize();
	}
	public int charge(int time) {
		int result = getBatterySize();
		result= getBatterySize()+(time*8);
		setBatterySize(result);
		return getBatterySize();
	}
}
