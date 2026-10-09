package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.enginepart.*;


public class Whisper_R_V16_exhaust_pipe extends ExhaustPipe
{
	public Whisper_R_V16_exhaust_pipe( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Whisper stock right V16 exhaust pipe";

		description = "Stock right side exhaust system for Whisper models powered by V16 engines.";

		value = tHUF2USD(233.185);
		brand_new_prestige_value = 32.89;
		setMaxWear(kmToMaxWear(500000.0));

		mufflerSlotIDList = new Vector();
		mufflerSlotIDList.addElement(new Integer(3));
	}
}
