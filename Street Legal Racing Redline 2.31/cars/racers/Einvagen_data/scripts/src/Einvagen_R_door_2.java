package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;



public class Einvagen_R_door_2 extends HatchDoor
{
	public Einvagen_R_door_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Einvagen 140 DTM hatch door";
		description = "A polished light hatch door for Einvagen 140 DTM.";

		value = tHUF2USD(1814.6);
		brand_new_prestige_value = 32.14;
	}

	public void addStockParts( int actcolor, float optical, float power )
	{
		super.addStockParts( actcolor, optical, power );

		float part_random;

		randomize( optical + power );
	}
}
