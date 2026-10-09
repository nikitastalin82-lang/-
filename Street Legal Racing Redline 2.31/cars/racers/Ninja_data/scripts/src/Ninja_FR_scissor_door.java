package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Ninja_FR_scissor_door extends FrontDoor
{
	public Ninja_FR_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Ninja scissor passenger's door";
		description = "Scissor type passenger's door for Ninja models.";

		value = tHUF2USD(54.307);
		brand_new_prestige_value = 60.12;
	}
}
