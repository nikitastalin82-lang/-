package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Teg_FR_scissor_door extends FrontDoor
{
	public Teg_FR_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Teg scissor passenger's door";
		description = "Scissor type passenger's door for Teg models.";

		value = tHUF2USD(72.301);
		brand_new_prestige_value = 49.68;
	}
}
