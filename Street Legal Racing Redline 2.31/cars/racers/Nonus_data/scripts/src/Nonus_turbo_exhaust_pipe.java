package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Nonus_turbo_exhaust_pipe extends ExhaustPipe
{
	public Nonus_turbo_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Emer Nonus turbo exhaust pipe";

		description = "The exhaust system for Emer Nonus StreetGT with a turbocharged engine.";

		value = tHUF2USD(340.000);
		brand_new_prestige_value = 59.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
		mufflerSlotIDList.addElement(new Integer(3));
	}
}
