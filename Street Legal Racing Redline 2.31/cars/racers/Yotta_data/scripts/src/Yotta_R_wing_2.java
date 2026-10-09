package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Yotta_R_wing_2 extends Wing
{
	public Yotta_R_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Yotta custom trunk wing";
		description = "Custom trunk wing for Yotta models.";

		value = tHUF2USD(141.581);
		brand_new_prestige_value = 109.85;

	}
}
