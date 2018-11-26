package com.example.Controller;

import java.util.ArrayList;

public class Tempature {
	 private String cod;
	 private float message;
	 private float cnt;
	 ArrayList < Object > list = new ArrayList < Object > ();
	 City CityObject;


	 // Getter Methods 

	 public String getCod() {
	  return cod;
	 }

	 public float getMessage() {
	  return message;
	 }

	 public float getCnt() {
	  return cnt;
	 }

	 public City getCity() {
	  return CityObject;
	 }

	 // Setter Methods 

	 public void setCod(String cod) {
	  this.cod = cod;
	 }

	 public void setMessage(float message) {
	  this.message = message;
	 }

	 public void setCnt(float cnt) {
	  this.cnt = cnt;
	 }

	 public void setCity(City cityObject) {
	  this.CityObject = cityObject;
	 }

	@Override
	public String toString() {
		return "Tempature [cod=" + cod + ", message=" + message + ", cnt=" + cnt + ", list=" + list + ", CityObject="
				+ CityObject + "]";
	}
	 
	 
	}