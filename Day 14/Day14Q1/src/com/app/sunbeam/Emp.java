package com.app.sunbeam;

public interface Emp {
	double getsal();
	default double calcIncentives() {
		return 0.0;
	}
	static double calcTotalIncome(Emp arr[]) {
		double total=0.0;
		for(Emp e:arr)
			total=e.getsal()+e.calcIncentives();
		return total;
	}

}

