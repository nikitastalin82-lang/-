package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Axis_FR_scissor_door extends FrontDoor
{
	public Axis_FR_scissor_door( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Axis scissor passenger's door";
		description = "The scissor type passenger's door for Axis models.";

		value = tHUF2USD(82.651);
		brand_new_prestige_value = 57.31;
	}
}
