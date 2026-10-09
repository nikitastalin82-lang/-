package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_FL_scissor_door extends FrontDoor
{
	public Coyot_FL_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot scissor driver's door";
		description = "Scissor type driver's door for Coyot models.";

		value = tHUF2USD(117.263);
		brand_new_prestige_value = 59.12;
	}
}
