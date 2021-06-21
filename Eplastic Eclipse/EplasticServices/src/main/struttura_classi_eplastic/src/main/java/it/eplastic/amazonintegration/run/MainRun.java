package it.eplastic.amazonintegration.run;

import it.eplastic.amazonintegration.api.call.OrderServices;

public class MainRun {

	public static void main(String[] args) {
		try {
			OrderServices.getInstance().callListOrder();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
