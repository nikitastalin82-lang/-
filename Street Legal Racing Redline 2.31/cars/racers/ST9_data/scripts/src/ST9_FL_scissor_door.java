package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_FL_scissor_door extends FrontDoor
{
	public ST9_FL_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 scissor driver's door";
		description = "Scissor type driver's door for ST9 models.";

		value = tHUF2USD(107.495);
		brand_new_prestige_value = 62.27;
	}
}
