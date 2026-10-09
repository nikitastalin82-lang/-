package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Codrac_R_wing_2 extends Wing
{
	public Codrac_R_wing_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Codrac stock trunk wing";
		description = "Stock trunk wing for Codrac models.";

		value = tHUF2USD(50.64);
		brand_new_prestige_value = 46.02;

	}
}
