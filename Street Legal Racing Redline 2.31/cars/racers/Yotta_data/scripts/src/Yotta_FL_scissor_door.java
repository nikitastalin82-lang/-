package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_FL_scissor_door extends FrontDoor
{
	public Yotta_FL_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta scissor driver's door";
		description = "Scissor type driver's door for Yotta models.";

		value = tHUF2USD(105.482);
		brand_new_prestige_value = 63.30;
	}
}
