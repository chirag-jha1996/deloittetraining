
public class demo {
	public class WeatherMonitor {	
		public static void main (String[] args) {
			City city = new City();
			int noOfCities=city.numberOfCities();
			for (int i = 0; i < noOfCities; i++) {
				city.temperature();
				city.checkRange();
			}
		}

}
