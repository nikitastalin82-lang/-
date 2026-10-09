package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Badge_R_bumper_3 extends Bumper
{
	public Badge_R_bumper_3( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "Badge custom rear bumper";
		description = "Custom rear bumper for Badge models.";

		value = tHUF2USD(230.098);
		brand_new_prestige_value = 55.29;

	}
}
