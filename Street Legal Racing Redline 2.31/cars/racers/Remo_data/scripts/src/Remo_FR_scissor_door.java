package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Remo_FR_scissor_door extends FrontDoor
{
	public Remo_FR_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Remo scissor passenger's door";
		description = "Scissor type passenger's door for Remo models.";

		value = tHUF2USD(105.111);
		brand_new_prestige_value = 49.64;
	}
}
