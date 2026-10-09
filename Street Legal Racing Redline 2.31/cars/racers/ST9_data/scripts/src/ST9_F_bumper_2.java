package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class ST9_F_bumper_2 extends Bumper
{
	public ST9_F_bumper_2( int id )
	{
		super( id );
		carCategory = PACKAGE;
		name = "ST9 custom front bumper";
		description = "Custom front bumper for ST9 models.";

		value = tHUF2USD(157.617);
		brand_new_prestige_value = 42.30;
	}
}
