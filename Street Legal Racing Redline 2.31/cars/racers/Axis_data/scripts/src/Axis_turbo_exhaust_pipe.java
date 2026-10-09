package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Axis_turbo_exhaust_pipe extends ExhaustPipe
{
	public Axis_turbo_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis turbo exhaust pipe";

		description = "The turbo exhaust system for all Axis models designed for using with turbocharged inline-4 engines.";

		value = tHUF2USD(88.62);
		brand_new_prestige_value = 23.49;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
