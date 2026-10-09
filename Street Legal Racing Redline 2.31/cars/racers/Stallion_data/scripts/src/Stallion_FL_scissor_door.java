package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_FL_scissor_door extends FrontDoor
{
	public Stallion_FL_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion scissor driver's door";
		description = "Scissor type driver's door for Stallion models.";

		value = tHUF2USD(102.117);
		brand_new_prestige_value = 49.31;
	}
}
