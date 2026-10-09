package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Stallion_R_wing_2 extends Wing
{
	public Stallion_R_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Stallion custom trunk wing";
		description = "Custom trunk wing for Stallion models.";

		value = tHUF2USD(113.729);
		brand_new_prestige_value = 76.89;
	}
}
