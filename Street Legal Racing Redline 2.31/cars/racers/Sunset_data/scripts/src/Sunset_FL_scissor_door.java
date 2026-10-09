package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Sunset_FL_scissor_door extends FrontDoor
{
	public Sunset_FL_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Sunset scissor driver's door";
		description = "Scissor type driver's door for Sunset models.";

		value = tHUF2USD(113.481);
		brand_new_prestige_value = 66.13;
	}
}
