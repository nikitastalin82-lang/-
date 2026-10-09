package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_FL_scissor_door extends FrontDoor
{
	public Teg_FL_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg scissor driver's door";
		description = "Scissor type driver's door for Teg models.";

		value = tHUF2USD(72.301);
		brand_new_prestige_value = 49.68;
	}
}
