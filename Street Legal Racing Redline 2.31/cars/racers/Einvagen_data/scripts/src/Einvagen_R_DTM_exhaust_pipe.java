package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Einvagen_R_DTM_exhaust_pipe extends ExhaustPipe
{
	public Einvagen_R_DTM_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 DTM right exhaust pipe";

		description = "The stock right side exhaust system for the Einvagen 140 DTM.";

		value = tHUF2USD(1105.637);
		brand_new_prestige_value = 27.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
		mufflerSlotIDList.addElement(new Integer(3));
	}
}
