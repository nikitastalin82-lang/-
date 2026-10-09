package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_R_bumper extends Bumper
{
	public ST9_R_bumper( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 stock rear bumper";
		description = "Stock rear bumper for ST9 models.";

		value = tHUF2USD(90.163);
		brand_new_prestige_value = 25.76;
	}
}
