package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Naxas_muffler_V12 extends ExhaustPipe
{
	public Naxas_muffler_V12( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Naxas V12 exhaust pipe";

		description = "Stock exhaust system for all Naxas models powered by V12 engines.";

		value = tHUF2USD(210.12);
		brand_new_prestige_value = 30.54;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
