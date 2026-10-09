package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_FR_scissor_door extends FrontDoor
{
	public Stallion_FR_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion scissor passenger's door";
		description = "Scissor type passenger's door for Stallion models.";

		value = tHUF2USD(102.117);
		brand_new_prestige_value = 49.31;
	}
}
