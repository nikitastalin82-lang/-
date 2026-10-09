package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Prime_extra_L_exhaust_pipe extends ExhaustPipe
{
	public Prime_extra_L_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Prime DLH 500 left side exit exhaust pipe";

		description = "The left side exit exhaust system for the Prime DLH.";

		value = tHUF2USD(633.000);
		brand_new_prestige_value = 95.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
