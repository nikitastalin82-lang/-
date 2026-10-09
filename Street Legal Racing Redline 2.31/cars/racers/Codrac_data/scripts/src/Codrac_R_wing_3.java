package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_wing_3 extends Wing
{
	public Codrac_R_wing_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac custom trunk wing";
		description = "Custom trunk wing for Codrac models.";

		value = tHUF2USD(90.097);
		brand_new_prestige_value = 55.92;

	}
}
