package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Stallion_L_exhaust_pipe extends ExhaustPipe
{
	public Stallion_L_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion stock left exhaust pipe";

		description = "Stock left side exhaust system for Stallion models.";

		value = tHUF2USD(57.814);
		brand_new_prestige_value = 25.84;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
