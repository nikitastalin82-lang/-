package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FL_scissor_door extends FrontDoor
{
	public Axis_FL_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis scissor driver's door";
		description = "The scissor type driver's door for the Axis models.";

		value = tHUF2USD(82.651);
		brand_new_prestige_value = 57.31;
	}
}
