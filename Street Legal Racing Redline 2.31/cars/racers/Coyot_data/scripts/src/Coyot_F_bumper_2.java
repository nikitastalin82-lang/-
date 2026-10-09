package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Coyot_F_bumper_2 extends Bumper
{
	public Coyot_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Coyot custom front bumper";
		description = "Custom front bumper for Coyot models.";

		value = tHUF2USD(93.051);
		brand_new_prestige_value = 36.26;
	}
}
