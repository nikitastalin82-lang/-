package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Nonus_L_DTM_exhaust_pipe extends ExhaustPipe
{
	public Nonus_L_DTM_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Emer Nonus DTM left exhaust pipe";

		description = "The stock left side exhaust system for the Emer Nonus DTM.";

		value = tHUF2USD(1905.000);
		brand_new_prestige_value = 44.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
		mufflerSlotIDList.addElement(new Integer(3));
	}
}
