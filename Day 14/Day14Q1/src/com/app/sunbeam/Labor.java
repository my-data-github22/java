package com.app.sunbeam;

public class Labor implements Emp {
	double hrs;
	double rate;

	public Labor(double hrs, double rate) {

		this.hrs = hrs;
		this.rate = rate;
	}

	@Override
	public double getsal() {

		return hrs * rate;
	}

	@Override
	public double calcIncentives() {
		if (hrs > 300)
			return 0.05 * hrs * rate;
		else
			return 0.0;
	}
}
