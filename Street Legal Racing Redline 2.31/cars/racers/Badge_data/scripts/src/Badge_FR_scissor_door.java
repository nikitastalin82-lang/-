package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_FR_scissor_door extends FrontDoor
{
	public Badge_FR_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge scissor passenger's door";
		description = "Scissor type passenger's door for Badge models.";

		value = tHUF2USD(121.333);
		brand_new_prestige_value = 56.12;
	}

}
