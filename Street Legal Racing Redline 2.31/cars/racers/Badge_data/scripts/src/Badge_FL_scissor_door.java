package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FL_scissor_door extends FrontDoor
{
	public Badge_FL_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge scissor driver's door";
		description = "Scissor type driver's door for Badge models.";

		value = tHUF2USD(121.333);
		brand_new_prestige_value = 56.12;
	}
}
