package com.example.Controller;


public class Main {
	 private float temp;
	 private float pressure;
	 private float humidity;
	 private float temp_min;
	 private float temp_max;


	 // Getter Methods 

	 public float getTemp() {
	  return temp;
	 }

	 public float getPressure() {
	  return pressure;
	 }

	 public float getHumidity() {
	  return humidity;
	 }

	 public float getTemp_min() {
	  return temp_min;
	 }

	 public float getTemp_max() {
	  return temp_max;
	 }

	 // Setter Methods 

	 public void setTemp(float temp) {
	  this.temp = temp;
	 }

	 public void setPressure(float pressure) {
	  this.pressure = pressure;
	 }

	 public void setHumidity(float humidity) {
	  this.humidity = humidity;
	 }

	 public void setTemp_min(float temp_min) {
	  this.temp_min = temp_min;
	 }

	 public void setTemp_max(float temp_max) {
	  this.temp_max = temp_max;
	 }

	@Override
	public String toString() {
		return "Main [temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity + ", temp_min=" + temp_min
				+ ", temp_max=" + temp_max + "]";
	}
	 
	 
}
		 
		 


