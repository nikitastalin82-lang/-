package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class MC_V12_L_exhaust_pipe extends ExhaustPipe
{
	public MC_V12_L_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "MC GT V12 left exhaust pipe";

		description = "The stock left side V12 exhaust system for the MC GT and GTB.";

		value = tHUF2USD(193.122);
		brand_new_prestige_value = 62.00;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
