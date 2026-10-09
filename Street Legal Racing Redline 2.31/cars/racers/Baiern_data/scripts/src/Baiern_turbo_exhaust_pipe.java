package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Baiern_turbo_exhaust_pipe extends ExhaustPipe
{
	public Baiern_turbo_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Baiern CoupeSport/DevilSport turbo exhaust pipe";

		description = "Exhaust system for the DevilSport and CoupeSport models with a turbocharged engine.";

		value = tHUF2USD(373.000);
		brand_new_prestige_value = 51.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
		mufflerSlotIDList.addElement(new Integer(3));
	}
}
