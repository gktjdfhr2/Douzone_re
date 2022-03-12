package ex.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scales {
	static BufferedReader br =new  BufferedReader(new InputStreamReader(System.in));
	protected String name;
	protected double weight;
	protected double tall;
	protected double bmi;	
	
	public String getName() {
		return name;
	}
	public double getBmi() {
		return bmi;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public double getWeight() {
		return weight;
	}
	public double getTall() {
		return tall;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	public Scales() throws NumberFormatException, IOException {
		// TODO Auto-generated constructor stub
		System.out.print("이름을  입력하시오:");
		this.name = br.readLine();
		System.out.print("키를 입력하시오:");
		this.tall = Double.parseDouble(br.readLine());
		System.out.print("몸무게를 입력하시오:");
		this.weight = Double.parseDouble(br.readLine());		
		this.bmi = (this.weight / ( ( this.tall / 100 ) * ( this.tall / 100 ) ));		
	}
	
	
	
	
	@Override
	public String toString() {
		return name + "\t"+ weight + "\t" + tall;
	}
	
	
	
}
