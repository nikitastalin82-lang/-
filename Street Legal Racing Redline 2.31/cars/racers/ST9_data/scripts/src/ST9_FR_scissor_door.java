package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_FR_scissor_door extends FrontDoor
{
	public ST9_FR_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 scissor passenger's door";
		description = "Scissor type passenger's door for ST9 models.";

		value = tHUF2USD(107.495);
		brand_new_prestige_value = 62.27;
	}
}
