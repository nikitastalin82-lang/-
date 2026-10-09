package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Badge_L_exhaust_pipe_1 extends ExhaustPipe
{
	public Badge_L_exhaust_pipe_1( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge stock left exhaust pipe";

		description = "Stock exhaust system for all Badge models.";

		value = tHUF2USD(115.000);
		brand_new_prestige_value = 25.84;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(2));
	}
}
